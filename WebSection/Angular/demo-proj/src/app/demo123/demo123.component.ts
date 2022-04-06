import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-demo123',
  template: `<h1 [style.color]="'green'">Hello demo123</h1>
             <h2 [style.color]="mark">This is Angular style binding</h2>
             <h2 [ngStyle]="allStyle">This is another Angular style binding</h2>
             <h1 [style.color]="classGreen?'green':'red'">demo123 works</h1>`,//conditional operator for style binding
  styles: [`
    .red{
      color: orange;
    }
    .green{
      color:green;
    }
    .txt{
      font-style:italic;
    }`]
})
export class Demo123Component implements OnInit {
  public classGreen = false;
  public mark = "orange";
  public allStyle ={
    color: "blue",
    fontStyle: "italic"
  }
  constructor() { }

  ngOnInit(): void {
  }

}
