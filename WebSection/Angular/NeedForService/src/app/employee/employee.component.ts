import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css'],
})
export class EmployeeComponent implements OnInit {
  public emp = [
    { id: 1, name: 'shufa', dep: 'training' },
    { id: 2, name: 'wen', dep: 'jfs' },
  ];
  constructor() {}

  ngOnInit(): void {}
}
