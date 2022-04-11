import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FoodServiceService {

  constructor() { }
  getFoodInfo(){
    return [
      { id: 1, name: 'food1', price: 40 },
      { id: 2, name: 'food2', price: 50 },
      { id: 3, name: 'food3', price: 60 } ]
  }
}
