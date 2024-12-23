import { Routes } from '@angular/router';

export const routes: Routes = [
    {
        path: '',
        loadComponent: () => import('./core/components/gpa-calc/gpa-calc.component').then(m => m.GpaCalcComponent)
      },
];
