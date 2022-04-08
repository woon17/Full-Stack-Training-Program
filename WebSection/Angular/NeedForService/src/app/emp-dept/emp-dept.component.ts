import { Component, OnInit } from '@angular/core';
import { EmployeeServiceService } from '../employee-service.service';

@Component({
  selector: 'app-emp-dept',
  templateUrl: './emp-dept.component.html',
  styleUrls: ['./emp-dept.component.css', '../employee/employee.component.css']
})
export class EmpDeptComponent implements OnInit {
  public emp=[{id:0, name:"", dep:""}];
  constructor(private _employeeService: EmployeeServiceService) { }

  ngOnInit(): void {
    this.emp = this._employeeService.getEmployeeInfo();
  }

}
