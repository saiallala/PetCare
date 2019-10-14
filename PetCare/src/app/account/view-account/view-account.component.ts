import { Component, OnInit } from '@angular/core';
import { Pet } from '../../model/pet';
import { PetService } from '../../services/pet.service';

@Component({
  selector: 'app-view-account',
  templateUrl: './view-account.component.html',
  styleUrls: ['./view-account.component.css']
})
export class ViewAccountComponent implements OnInit {
    pets: Pet[];

      constructor() {
      }
      // constructor(private petService: PetService) {
      // }

      ngOnInit() {
        this.petService.findAll().subscribe(data => {
          this.pets = data;
        });
      }

}
