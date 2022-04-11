import { Component, OnInit } from '@angular/core';
import { FoodServiceService } from '../food-service.service';

@Component({
  selector: 'app-food-list',
  template: `
    <p>food-list works!, here is the foodList.</p>
    <ul *ngFor="let f of foods">
      <li>{{ f.id }} - {{ f.name }} - {{ f.price }}</li>
    </ul>
  `,
  styles: [],
})
export class FoodListComponent implements OnInit {
  public foods: any;
  constructor(private _foodService: FoodServiceService) {}

  ngOnInit(): void {
    this.foods = this._foodService.getFoodInfo();
  }
}
