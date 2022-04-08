import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { TestComponent } from './test/test.component';
import { CarDisplayComponent } from './car-display/car-display.component';
import { CarInfoService } from './car-info.service';

@NgModule({
  declarations: [
    AppComponent,
    TestComponent,
    CarDisplayComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [CarInfoService],
  bootstrap: [AppComponent]
})
export class AppModule { }
