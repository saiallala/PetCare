import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Pet } from '../model/pet';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PetService {

  private petsUrl: string;

  constructor(private http: HttpClient) {
    this.petsUrl = 'http://localhost:8080/pets';
  }

  public findAll(): Observable<Pet[]> {
    return this.http.get<Pet[]>(this.petsUrl);
  }

  public save(Pet: Pet) {
    return this.http.post<Pet>(this.petsUrl, Pet);
  }
}
