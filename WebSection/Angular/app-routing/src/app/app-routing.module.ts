import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { ElectronicsListComponent } from './electronics-list/electronics-list.component';
import { FoodListComponent } from './food-list/food-list.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

const routes: Routes = [
  { path: '', component: FoodListComponent },
  { path: 'food', component: FoodListComponent },
  { path: 'electronics', component: ElectronicsListComponent },
  { path: '**', component: PageNotFoundComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
export const routingComponents = [
  FoodListComponent,
  ElectronicsListComponent,
  PageNotFoundComponent,
]; //for NgModule
