import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-test',
  // templateUrl: './test.component.html',
  // templateUrl: './test.componentIfElse.html',
  // templateUrl: './test.componentSwitchCases.html',
  // templateUrl: './test.componentFor.html',
  templateUrl: './test.componentFromParentComponent.html',
  styleUrls: ['./test.component.css'],
})
export class TestComponent implements OnInit {
  public disp = true; //used for if else test
  public day = 'mon';
  public participants = ['wen', 'shu', 'fa', 'wu'];
  @Input() public dataFromParent = "";
  constructor() {}

  ngOnInit(): void {}
}
