//package com.techwaves.petcare.config;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.DefaultRedirectStrategy;
//import org.springframework.security.web.RedirectStrategy;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//
//@Configuration
//@EnableWebSecurity
//public class SpringSecurityJavaConfig extends WebSecurityConfigurerAdapter {
//	
//	
//	//Create users with different roles in SecurityJavaConfig that we will be using to authenticate our API endpoints
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//	    auth.inMemoryAuthentication()
//	        .withUser("admin").password(encoder().encode("adminPass")).roles("ADMIN")
//	        .and()
//	        .withUser("user").password(encoder().encode("userPass")).roles("USER");
//	}
//	
//	//This is the password encoder we use to encode plain text into a encoded value
//	@Bean
//	public PasswordEncoder  encoder() {
//	    return new BCryptPasswordEncoder();
//	}
//	
//	//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//		.csrf().disable()
//		// disable CSRF support. CSRF is a vulnerability in web applications. Generally, we dont need CSRF.
//		.authorizeRequests()
//		.antMatchers("/js/**", "/css/**", "/img/**", "/webjars/**", "/api/**").permitAll() // allow all webjars (bootstrap and jquery), css, images and javascript files without security
//		.antMatchers("/**").hasRole("USER").anyRequest().authenticated()// authorize requests only if they are successfully authenticated
//		.and().formLogin() // allow form login
//		.successHandler(authenticationSuccessHandler()) // if login is successful, call the authenticationSuccessHandler method
//		.loginPage("/login").permitAll() // show the login page located at /login URL
//		.and().httpBasic(); // also allow http basic authentication
//		
//	}
//	
//	private final RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
//
//	/* Redirects to the link that a user needs to be redirected after a successful login*/
//	private AuthenticationSuccessHandler authenticationSuccessHandler() {
//		return new AuthenticationSuccessHandler() {
//			public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
//					Authentication authentication) throws IOException, ServletException {
//				redirectStrategy.sendRedirect(request, response, "/movie-list"); // redirect to movie list page
//			}
//		};
//	}
//	
//	
//	
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//		// configuration to allow these urls accessed regardless of spring security
//		// configurations
//		web
//			.ignoring() 
//				// ignore security for all the below URL patterns and HTTP methods
//				.antMatchers(HttpMethod.OPTIONS, "/**") // Ignore security for HTTP method (OPTIONS)
//				.antMatchers("/static/**")
//				.antMatchers("/templates/**")
//				.antMatchers("/app/**/*.{js,html}")
//				.antMatchers("/swagger-ui/index.html"); // ignore security for the swagger UI
//	}
//
//}
//	