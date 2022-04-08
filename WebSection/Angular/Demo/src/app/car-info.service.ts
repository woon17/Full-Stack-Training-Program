import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CarInfoService {

  constructor() { }

  getCarInfo(){
    return [
      { id: 1, name: 'car1', color: 'red' },
      { id: 2, name: 'car2', color: 'blue' },
      { id: 3, name: 'car3', color: 'black' }
    ];
  }
}
