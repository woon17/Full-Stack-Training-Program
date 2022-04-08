import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { EmployeeComponent } from './employee/employee.component';
import { EmpDeptComponent } from './emp-dept/emp-dept.component';
import { EmpIdComponent } from './emp-id/emp-id.component';
import { EmployeeServiceService } from './employee-service.service';
@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponent,
    EmpDeptComponent,
    EmpIdComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [EmployeeServiceService],//put service in the provider
  bootstrap: [AppComponent]
})
export class AppModule { }
