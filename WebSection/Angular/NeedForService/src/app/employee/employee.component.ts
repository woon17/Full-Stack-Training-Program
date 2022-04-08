import { i18nMetaToJSDoc } from '@angular/compiler/src/render3/view/i18n/meta';
import { Component, OnInit } from '@angular/core';
import { EmployeeServiceService } from '../employee-service.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css'],
})
export class EmployeeComponent implements OnInit {
  public emp = [{}];

  public toString(emp: any){
    return emp.id + " - " + emp.name + " - " + emp.dep;
  }

  constructor(private _employeeService: EmployeeServiceService) {

  }

  ngOnInit(): void {
    this.emp = this._employeeService.getEmployeeInfo();
  }
}
