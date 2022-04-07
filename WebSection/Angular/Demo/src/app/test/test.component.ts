import { Component, OnInit, Input, Output } from '@angular/core';
// import { EventEmitter } from 'stream';
import { EventEmitter } from '@angular/core';

@Component({
  selector: 'app-test',
  // templateUrl: './test.component.html',
  // templateUrl: './test.componentIfElse.html',
  // templateUrl: './test.componentSwitchCases.html',
  // templateUrl: './test.componentFor.html',
  // templateUrl: './test.componentFromParentComponent.html',
  templateUrl: './test.componentToParentComponent.html',
  styleUrls: ['./test.component.css'],
})
export class TestComponent implements OnInit {
  public disp = true; //used for if else test
  public day = 'mon';
  public participants = ['wen', 'shu', 'fa', 'wu'];
  // @Input() public dataFromParent = '';
  @Input('dataFromParent') public test = '';
  @Output() public childEvent = new EventEmitter();
  constructor() {}

  ngOnInit(): void {}

  sendData() {
    this.childEvent.emit("Hello parent");
  }
}
