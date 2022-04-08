import { Component, OnInit } from '@angular/core';
import { CarInfoService } from '../car-info.service';

@Component({
  selector: 'app-car-display',
  templateUrl: './car-display.component.html',
  styleUrls: ['./car-display.component.css']
})
export class CarDisplayComponent implements OnInit {
  // three ways to create the variable reference for service data
  public carInfo=[{id:0, name:"", color:""}];
  // public carInfo=[{}]; // with ts function to work
  // public carInfo:any;

  constructor(private _carinfoservice: CarInfoService) { }
  toString(car:any){
    return car.id + " - " + car.name + " - " + car.color + " - " + car.testUnknowProperty;//use ts func is more powerful than {{}} in html
  }


  ngOnInit(): void {
    this.carInfo = this._carinfoservice.getCarInfo();
  }

}
