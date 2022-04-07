import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { EmployeeComponent } from './employee/employee.component';
import { EmpDeptComponent } from './emp-dept/emp-dept.component';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponent,
    EmpDeptComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
