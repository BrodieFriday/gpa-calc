public class Calculation{

   Calculation(){
   }
   
   public double gradePoints(double creditHours, double Grade){
     double c = creditHours * Grade;
     return c;
   }
   
   public int totalCredits(int class1, int class2, int class3, int class4, int class5, int class6 ){
   
   int total = class1 + class2 + class3 + class4 + class5 + class6;
   return total;
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