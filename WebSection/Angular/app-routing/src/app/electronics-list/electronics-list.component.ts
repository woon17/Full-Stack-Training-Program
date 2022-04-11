import { Component, OnInit } from '@angular/core';
import { ElectronicsServiceService } from '../electronics-service.service';
import { FoodServiceService } from '../food-service.service';

@Component({
  selector: 'app-electronics-list',
  template: `
    <p>electronics-list works, here is the electronicsList:</p>
    <ul *ngFor="let e of electronics">
      <li>{{ e.id }} - {{ e.name }} - {{ e.price }}</li>
    </ul>
  `,
  styles: [],
})
export class ElectronicsListComponent implements OnInit {
  public electronics: any;
  constructor(private _electronicService: ElectronicsServiceService) {}

  ngOnInit(): void {
    this.electronics = this._electronicService.getElectronicsInfo();
  }
}
