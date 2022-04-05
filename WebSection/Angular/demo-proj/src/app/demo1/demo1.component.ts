import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-demo1',
  // templateUrl: './demo1.component.html',
    // inline template
    template: `<p>This is template from test.component.html</p>`,
    styles:[`
    p{
      color:red;
    }`]

})
export class Demo1Component implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
