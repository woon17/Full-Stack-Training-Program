import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-emp-dept',
  templateUrl: './emp-dept.component.html',
  styleUrls: ['./emp-dept.component.css']
})
export class EmpDeptComponent implements OnInit {
  public emp = [
    { id: 1, name: 'shufa', dep: 'training' },
    { id: 2, name: 'wen', dep: 'jfs' },
  ];
  constructor() { }

  ngOnInit(): void {
  }

}
