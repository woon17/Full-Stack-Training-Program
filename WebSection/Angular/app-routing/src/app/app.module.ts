import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule, routingComponents } from './app-routing.module';
import { AppComponent } from './app.component';
import { ElectronicsServiceService } from './electronics-service.service';
import { FoodServiceService } from './food-service.service';

@NgModule({
  declarations: [
    AppComponent,
    routingComponents
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [FoodServiceService, ElectronicsServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
