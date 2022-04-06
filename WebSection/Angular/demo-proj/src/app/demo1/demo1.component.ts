import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-demo1',
  // templateUrl: './demo1.component.html',
  // inline template
  template: `<p [class]="classGreen">This is template from test.component.html</p>
  <h2 [class.red]="classColor" class="txt">This is shufa</h2>
  <h1 [ngClass]="testStyle">Welcom to mutiple styles</h1>`,
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
export class Demo1Component implements OnInit {
  public classGreen = "green";
  public classColor = true;
  // public classColor = false;
  public testStyle = {
    "green": false,
    "red": true,
    "txt": true
  }

  constructor() { }

  ngOnInit(): void {
  }

}
