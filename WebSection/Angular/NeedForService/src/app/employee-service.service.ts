import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EmployeeServiceService {

  constructor() { }

  getEmployeeInfo(){
    return [
      { id: 1, name: 'shufa', dep: 'training' },
      { id: 2, name: 'wen', dep: 'jfs' },
      { id: 3, name: 'xyz', dep: 'abc' }
    ];
  }
}
