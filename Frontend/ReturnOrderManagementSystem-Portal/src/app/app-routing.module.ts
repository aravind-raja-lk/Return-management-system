import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthGuardService } from 'src/auth-guard.service';
import { HomeComponent } from './home/home.component';
import {LoginComponent} from './login/login.component';
const routes: Routes = [
  { path: '', component: LoginComponent },
  {path: 'home', component: HomeComponent, canActivate:[AuthGuardService]},
  { path: 'login', component: LoginComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
