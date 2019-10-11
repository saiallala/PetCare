import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { AccountComponent } from './account/account.component';
import { ProfileComponent } from './profile/profile.component';
import { HelpComponent } from './help/help.component';
import { Routes,RouterModule } from '@angular/router';
import { HealthComponent } from './profile/health/health.component';
import { ContactInfoComponent } from './profile/contact-info/contact-info.component';
import {FormsModule} from '@angular/forms';
import { ViewAccountComponent } from './account/view-account/view-account.component';
import { CreateAccountComponent } from './account/create-account/create-account.component';



const appRoutes: Routes =[
        { path: '', component: HomeComponent },
        { path: 'profile', component: ProfileComponent },
        { path: 'help', component: HelpComponent },
        { path: 'account', component: AccountComponent },
        { path: 'viewAccount', component: ViewAccountComponent },
        { path: 'createAccount', component: CreateAccountComponent },
        { path: 'health', component: HealthComponent },
        { path: 'contact', component: ContactComponent }

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
    ViewAccountComponent,
    CreateAccountComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
