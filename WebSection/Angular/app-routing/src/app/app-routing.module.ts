import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ElectronicsListComponent } from './electronics-list/electronics-list.component';
import { FoodListComponent } from './food-list/food-list.component';

const routes: Routes = [
  { path: 'food', component: FoodListComponent },
  { path: 'electronics', component: ElectronicsListComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
export const routingComponents = [FoodListComponent, ElectronicsListComponent]; //for NgModule
