import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ElectronicsServiceService {

  constructor() { }

  getElectronicsInfo(){
    return [
      { id: 1, name: 'device1', price: 100 },
      { id: 2, name: 'device2', price: 200 },
      { id: 3, name: 'device3', price: 300 } ]
  }
}
