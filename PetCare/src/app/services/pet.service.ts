import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Pet } from '../model/pet';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PetService {

  public API = '//localhost:8080';
  public PETCARE_API = this.API + '/petcare';

  constructor(private http: HttpClient) {
  }

  public findAll(): Observable<Pet[]> {
    return this.http.get<Pet[]>(this.PETCARE_API + '/pets');
  }

  public findById(): Observable<Pet>{
      return this.http.get<Pet>(this.PETCARE_API + '/pets/1');
  }

  public save(Pet: Pet) {
    return this.http.post<Pet>(this.PETCARE_API + '/pets', Pet);
  }

  // save(car: any): Observable<any> {
  //   let result: Observable<Object>;
  //   if (car['href']) {
  //     result = this.http.put(car.href, car);
  //   } else {
  //     result = this.http.post(this.CAR_API, car);
  //   }
  //   return result;
  // }
}
