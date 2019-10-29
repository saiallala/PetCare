import { Component, OnInit, Input } from '@angular/core';
import { Pet } from '../../model/pet';
import { PetService } from '../../services/pet.service';

@Component({
  selector: 'app-contact-info',
  templateUrl: './contact-info.component.html',
  styleUrls: ['./contact-info.component.css']
})
export class ContactInfoComponent implements OnInit {

  @Input() petData;
  pets: Pet[] = [];
  constructor(private petService: PetService) {

  }

  ngOnInit() {
    this.petService.findById().subscribe(data => {
      this.pets.push(data);
      console.log(this.pets);
    });
  }
}
