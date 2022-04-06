import { Component, OnInit } from '@angular/core';

@Component({
  selector: '[app-demo]',
  // templateUrl: './demo.component.html',
  // styleUrls: ['./demo.component.css']
  template: `
    <p>Demo component</p><input [(ngModel)]="name" type="text">{{name}}
  `,//perfer property and event binding together
  //ngModel is from form module
  styles: [`
  `]
})
export class DemoComponent implements OnInit {
  public name = "";
  constructor() { }

  ngOnInit(): void {
  }

}
