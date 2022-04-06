import { Component, OnInit } from '@angular/core';

@Component({
  selector: '.app-test',//use class selector
  // templateUrl: './test.component.html',
  // template:`<button (click)="OnClick()">Click Me Now</button>`,
  template:`<button (click)="OnClick($event)">Click Me Now for event binding</button>`,
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {
  public msg="";
  OnClick(event: MouseEvent){
    console.log("Hello every one, user clicked on the button");
    this.msg="Button was clicked";
    // console.log(this.msg);
    console.log(event);
    console.log(event.type);
  }

  constructor() { }

  ngOnInit(): void {
  }
  hero = 'Windstorm';
}
