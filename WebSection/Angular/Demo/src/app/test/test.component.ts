import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  // templateUrl: './test.component.html',
  // if else way1:
  // template: `
  //   <h2 *ngIf="disp; else elseBlock">Hello</h2>
  //   <h2 *ngIf="true">Wen shufa</h2>
  //   <ng-template #elseBlock>
  //   <h2 >Bye</h2></ng-template>
  // `,

  template: `
    <div *ngIf="disp; then valueTrue; else valueFalse"></div>
    <ng-template #valueTrue>
      <h2>Hello</h2>
    </ng-template>
    <ng-template #valueFalse>
      <h2>Bye</h2>
    </ng-template>
  `,
  styleUrls: ['./test.component.css'],
})
export class TestComponent implements OnInit {
  public disp = true;
  constructor() {}

  ngOnInit(): void {}
}
