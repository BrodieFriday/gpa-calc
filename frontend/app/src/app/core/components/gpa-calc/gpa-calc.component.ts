import { CommonModule } from '@angular/common';
import { Component, ViewChild } from '@angular/core';
import { FormArray, FormBuilder, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatCheckboxModule } from '@angular/material/checkbox';
import {MatInputModule} from '@angular/material/input';
import { MatSelectModule } from '@angular/material/select';
import { MatTable, MatTableDataSource, MatTableModule } from '@angular/material/table';


const gradePoints = [
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
const classList: object[] = [
  { class: '' },
  { class: '' },
  { class: '' },
  { class: '' },
  { class: '' },
];

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
    CommonModule,
    MatCheckboxModule
  ],
  templateUrl: './gpa-calc.component.html',
  styleUrl: './gpa-calc.component.scss',
  
})
export class GpaCalcComponent {
  @ViewChild(MatTable) table?: MatTable<object[]>;
  public points = gradePoints;
  public classes = classList;
  public dataSource = new MatTableDataSource<object>(this.classes);
  public displayedColumns: string[] = ['creditHours', 'letterGrade', 'checkbox'];
  public calcForm!: FormGroup;

  constructor(private fb: FormBuilder) {
    this.calcForm = this.fb.group({
      classes: this.fb.array([])
    });
  }

  private classItems = this.fb.group({
    hours: ['', Validators.required],
    grade: ['', Validators.required]
  });
  
  get classList(): FormArray {
    return this.calcForm.get('classes') as FormArray;
  }

  ngOnInit() {
    this.classes.forEach(() => {
      this.classList.push(this.classItems);
    });
  }

  addClass(){
    this.classes.push({
      class:''
    });
    this.classList.push(this.classItems);
    this.table?.renderRows();
  }
  
}
