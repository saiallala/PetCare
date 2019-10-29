import { Component, OnInit, Input } from '@angular/core';
import { Pet } from '../../model/pet';
import { PetService } from '../../services/pet.service';

@Component({
  selector: 'app-view-account',
  templateUrl: './view-account.component.html',
  styleUrls: ['./view-account.component.css']
})
export class ViewAccountComponent implements OnInit {
    // @Input() petData;
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
