import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  // template: `<h2>Today is {{day}}</h2>`,
  template: `<h2>{{1+2}}</h2>
             <h2>{{a+b}}</h2>
             <h2>{{"wen " + "shufa"}}</h2>
             <h2>{{day.length}}</h2>
             <h2>{{day.toUpperCase()}}</h2>
             <h2>{{disp()}}</h2>`,
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public day = "Tuesday";
  public a =10;
  public b = 100;
  title = 'Test';

  disp(){
    return "Today is " + this.day + ", have a greate day";
  }
}
