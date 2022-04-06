import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  // template: `<h2>Today is {{day}}</h2>`,
  template: `<h2>{{1+2}}</h2>
             <h2>{{a+b}}</h2>
             <h2>{{"wen " + "shufa"}}</h2>
             <h2>{{day.length}}</h2>
             <h2>{{day.toUpperCase()}}</h2>
             <h2>{{disp()}}</h2>
             <input type="text" value="shufa"><br>
             <input [id]="testVar" type="text" value="input2_value"><br>
             <input [disabled]="isDisabled" type="text" value="shufa"><br>
             <input bind-disabled="isDisabled" type="text" value="shufa">`,// property binding: way 1, using [...]; way 2, using bind-...
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  // public isDisabled = false;
  public isDisabled = true;
  public day = "Tuesday";
  public testVar = "testVarId";
  public a =10;
  public b = 100;
  title = 'Test';

  disp(){
    return "Today is " + this.day + ", have a greate day";
  }
}
