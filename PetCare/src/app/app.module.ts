import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http'
import { FormsModule } from '@angular/forms';
import { MatDialogModule, MatDialog, MatCheckboxModule } from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatToolbarModule } from '@angular/material/toolbar';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { AccountComponent } from './account/account.component';
import { ProfileComponent } from './profile/profile.component';
import { HelpComponent } from './help/help.component';
import { Routes, RouterModule } from '@angular/router';
import { HealthComponent } from './profile/health/health.component';
import { ContactInfoComponent } from './profile/contact-info/contact-info.component';
import { CreateAccountComponent } from './account/create-account/create-account.component';
import { PetService } from './services/pet.service';
import { LoginComponent } from './login/login.component';
import { IntroComponent } from './intro/intro.component';



const appRoutes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'profile', component: ProfileComponent },
  { path: 'help', component: HelpComponent },
  { path: 'account', component: AccountComponent },
  { path: 'register', component: CreateAccountComponent },
  { path: 'health', component: HealthComponent },
  { path: 'contact', component: ContactInfoComponent },
  { path: 'login', component: LoginComponent },
  { path: '', component: IntroComponent }

];

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ContactComponent,
    AccountComponent,
    ProfileComponent,
    HelpComponent,
    HealthComponent,
    ContactInfoComponent,
    CreateAccountComponent,
    LoginComponent,
    IntroComponent,
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes),
    HttpClientModule,
    FormsModule,
    BrowserAnimationsModule,
    MatDialogModule,
    MatCheckboxModule,
    MatToolbarModule
  ],
  exports: [
    RouterModule,
    MatDialogModule,
    MatCheckboxModule,
    MatToolbarModule
  ],
  providers: [PetService],
  bootstrap: [AppComponent]
})
export class AppModule { }
