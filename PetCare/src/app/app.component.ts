import { Component } from '@angular/core';
import {MatDialog, MatDialogConfig} from "@angular/material";
import { LoginComponent } from './login/login.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'PetCare';
  constructor(private dialog: MatDialog) {
      
  }

  openLogin(){
      const dialogConfig = new MatDialogConfig();
      dialogConfig.autoFocus = true;
      this.dialog.open(LoginComponent, dialogConfig);
  }
}
