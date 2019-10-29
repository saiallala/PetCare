import { Component, OnInit } from '@angular/core';
import { Pet } from './../model/pet';
import { PetService } from './../services/pet.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

    pets: Pet[] = [];
    pet: Pet;

      constructor(private petService: PetService) {

      }
      ngOnInit() {

        this.petService.findById().subscribe(data => {
            this.pets.push(data);
            this.pet = data;
        });
    }

}
