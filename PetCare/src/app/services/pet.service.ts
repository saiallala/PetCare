import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Pet } from '../model/pet';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PetService {


  constructor(private http: HttpClient) {
  }

  public findAll(): Observable<Pet[]> {
    return this.http.get<Pet[]>('//localhost:8080/petcare/pets/');
  }

  public findById(): Observable<Pet>{
      return this.http.get<Pet>('http://localhost:8080/petcare/pets/1')
  }

  public save(Pet: Pet) {
    return this.http.post<Pet>('//localhost:8080/petcare/pets', Pet);
  }
}
