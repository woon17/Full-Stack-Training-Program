import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-food-list',
  template: `
    <p>
      food-list works!, here is the foodList.
    </p>
  `,
  styles: [
  ]
})
export class FoodListComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
