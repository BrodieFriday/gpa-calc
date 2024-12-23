import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatInputModule } from '@angular/material/input';
import { MatSelectModule } from '@angular/material/select';
import { MatTableModule } from '@angular/material/table';


@Component({
  selector: 'app-gpa-calc',
  standalone: true,
  imports: [
    MatButtonModule,
    MatInputModule,
    MatSelectModule,
    ReactiveFormsModule,
    FormsModule,
    MatTableModule,
    CommonModule
  ],
  templateUrl: './gpa-calc.component.html',
  styleUrl: './gpa-calc.component.scss',
  
})
export class GpaCalcComponent {
  dataSource = [
    { class: '' },
    { class: '' },
    { class: '' },
    { class: '' },
    { class: '' },
  ];
  displayedColumns: string[] = ['creditHours', 'letterGrade', 'gradePoints'];
  points = [
    { value: '4.0', label: 'A' },
    { value: '3.7', label: 'A-' },
    { value: '3.3', label: 'B+' },
    { value: '3.0', label: 'B' },
    { value: '2.7', label: 'B-' },
    { value: '2.3', label: 'C+' },
    { value: '2.0', label: 'C' },
    { value: '1.7', label: 'C-' },
    { value: '1.3', label: 'D+' },
    { value: '1.0', label: 'D' },
    { value: '0.7', label: 'D-' },
    { value: '0.0', label: 'F' },
  ];
}
