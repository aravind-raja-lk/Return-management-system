import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { AppConfig } from './app/Global/AppConfig';

@Injectable({
  providedIn: 'root'
})
export class AuthGuardService implements CanActivate {

  constructor(private router:Router) { }
  canActivate():any{
    if(AppConfig.Islogin){
      return true;
    }
    this.router.navigate(['/login']);
    return false;
  }
}
