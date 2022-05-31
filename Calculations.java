class Calculation{

   Calculation(){
   }
   
   public double gradePoints(double creditHours, double Grade){
     double c = creditHours * Grade;
     return c;
   }
   
   public double totalGradePoints(double class1GradePoints, double class2GradePoints, double class3GradePoints, double class4GradePoints, double class5GradePoints, double class6GradePoints){

      double totalGradePoints = class1GradePoints + class2GradePoints + class3GradePoints + class4GradePoints + class5GradePoints + class6GradePoints;
      return totalGradePoints;
   }

   public int totalCredits(int class1Credits, int class2Credits, int class3Credits, int class4Credits, int class5Credits, int class6Credits){
   
   int totalCredits = class1Credits + class2Credits + class3Credits + class4Credits + class5Credits + class6Credits;
   return totalCredits;
   }
   
   
   
   public double QualityPoints(String g){
      String grade = g;
      double QualityPoints = 0.0;
      switch(grade){
      case "A": QualityPoints = 4.0;
         break;
      case "A-": QualityPoints = 3.7;
         break;
      case "B+": QualityPoints = 3.3;
         break;
      case "B":  QualityPoints = 3.0;
         break;
      case "B-": QualityPoints = 2.7;
         break;
      case "C+": QualityPoints = 2.3;
         break;
      case "C": QualityPoints = 2.0;
         break;
      case "C-": QualityPoints = 1.7;
         break;
      case "D+": QualityPoints = 1.3;
         break;
      case "D": QualityPoints = 1.0;
         break;
      case "D-": QualityPoints = 0.7;
         break;
      case "F": QualityPoints = 0.0;
   }
    return QualityPoints;
 
  }
}