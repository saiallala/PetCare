import { Component, OnInit } from '@angular/core';
import { Pet } from '../../model/pet';
import { PetService } from '../../services/pet.service';
import { Subscription } from 'rxjs';
import { ActivatedRoute, Router } from '@angular/router';
import { NgForm, FormsModule } from '@angular/forms';

@Component({
  selector: 'app-create-account',
  templateUrl: './create-account.component.html',
  styleUrls: ['./create-account.component.css']
})
export class CreateAccountComponent implements OnInit {
    pets: Pet[] = [];
    pet: Pet;
  constructor(private route: ActivatedRoute,
              private router: Router,
              private petService: PetService) {
              }

              ngOnInit() {
                  this.petService.findById().subscribe(data => {
                      console.log(data);
                      this.pets.push(data);
                      this.pet = data;
                  });
              }
              // onSubmit() will display the inputs entered upon sumission
              onSubmit(form: NgForm){
                  console.log(form);
              }
}
