import { Component, OnInit } from '@angular/core';
import { EmployeeServiceService } from '../employee-service.service';

@Component({
  selector: 'app-emp-id',
  templateUrl: './emp-id.component.html',
  styleUrls: ['./emp-id.component.css', '../employee/employee.component.css'],
})
export class EmpIdComponent implements OnInit {
  public emp:any;

  constructor(private _employeeService: EmployeeServiceService) {}

  ngOnInit(): void {
    this.emp = this._employeeService.getEmployeeInfo();
  }
}
