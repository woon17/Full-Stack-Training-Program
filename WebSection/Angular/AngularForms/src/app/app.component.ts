import { Component } from '@angular/core';
import { User } from './user';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'AngularForms';
  cities = ['Singapore', 'India', 'China', 'Malaysia'];
  userData = new User(
    'shufa',
    'shufa17@gmail.com',
    12345678,
    'Singapore',
    'male',
    true
  );
}
