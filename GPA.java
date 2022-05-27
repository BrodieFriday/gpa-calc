import java.text.DecimalFormat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GPA extends JFrame implements ActionListener{

   JComboBox<String> class1Grade,class2Grade,class3Grade,class4Grade,class5Grade,class6Grade;
   JTextField class1CreditHrs,class2CreditHrs,class3CreditHrs,class4CreditHrs,class5CreditHrs,class6CreditHrs,class1GradePoints
   ,gradePoints,class2GradePoints,class3GradePoints,class4GradePoints,class5GradePoints,class6GradePoints;

    public GPA(){

      Container GPAContainer = getContentPane();
      GPAContainer.setLayout(null);
      Color c = new Color(255, 145, 94);
      GPAContainer.setBackground(c);
      // Title top center
      JLabel calculator = new JLabel("GPA Calculator");
      GPAContainer.add(calculator);
      calculator.setBounds(170, 20, 100, 20);
      // Title left column
      JLabel creditHours = new JLabel("Credit Hours");
      GPAContainer.add(creditHours);
      creditHours.setBounds(85, 80, 100, 20);
      // Title right column
      JLabel gradePoints = new JLabel("Grade Points");
      GPAContainer.add(gradePoints);
      gradePoints.setBounds(335, 80, 100, 20);

      // Left column of textboxes for credit hours (6 total)
       class1CreditHrs= new JTextField("");
       GPAContainer.add(class1CreditHrs);
       class1CreditHrs.setBounds(80, 100, 100, 20);
       
       class2CreditHrs= new JTextField("");
       GPAContainer.add(class2CreditHrs);
       class2CreditHrs.setBounds(80, 130, 100, 20);
       
       class3CreditHrs= new JTextField("");
       GPAContainer.add(class3CreditHrs);
       class3CreditHrs.setBounds(80, 160, 100, 20);
       
       class4CreditHrs= new JTextField("");
       GPAContainer.add(class4CreditHrs);
       class4CreditHrs.setBounds(80, 190, 100, 20);
       
       class5CreditHrs= new JTextField("");
       GPAContainer.add(class5CreditHrs);
       class5CreditHrs.setBounds(80, 220, 100, 20);
       
       class6CreditHrs = new JTextField("");
       GPAContainer.add(class6CreditHrs);
       class6CreditHrs.setBounds(80, 250, 100, 20);
      // Right column of textboxes for grade points (6 total)
       class1GradePoints = new JTextField("");
       GPAContainer.add(class1GradePoints);
       class1GradePoints.setBounds(330, 100, 100, 20);

       class2GradePoints = new JTextField("");
       GPAContainer.add(class2GradePoints);
       class2GradePoints.setBounds(330, 130, 100, 20);

       class3GradePoints = new JTextField("");
       GPAContainer.add(class3GradePoints);
       class3GradePoints.setBounds(330, 160, 100, 20);

       class4GradePoints = new JTextField("");
       GPAContainer.add(class4GradePoints);
       class4GradePoints.setBounds(330, 190, 100, 20);

       class5GradePoints = new JTextField("");
       GPAContainer.add(class5GradePoints);
       class5GradePoints.setBounds(330, 220, 100, 20);

       class6GradePoints = new JTextField("");
       GPAContainer.add(class6GradePoints);
       class6GradePoints.setBounds(330, 250, 100, 20);

      // Button for calculating the grade points
      JButton calc = new JButton("Calculate");
      GPAContainer.add(calc);
      calc.setBounds(80, 300, 100, 20);
      calc.addActionListener(this);
      // Button to clear textfields
      JButton clearButton = new JButton("Clear");
      GPAContainer.add(clearButton);
      clearButton.setBounds(200, 300, 100, 20);
      clearButton.addActionListener(this);
      
      //Items inside combobox
      String[] tempLabels = {"A","A-","B+","B","B-","C+","C","C-","D+","D","D-","F"};
     
      
      // Comboboxes for picking grade
      class1Grade = new JComboBox<>(tempLabels);
      GPAContainer.add(class1Grade);
      class1Grade.setBounds(185,92,120,40);
      class1Grade.setVisible(true);
      
      class2Grade = new JComboBox<>(tempLabels);
      GPAContainer.add(class2Grade);
      class2Grade.setBounds(185,122,120,40);
      class2Grade.setVisible(true);
      
      class3Grade = new JComboBox<>(tempLabels);
      GPAContainer.add(class3Grade);
      class3Grade.setBounds(185,152,120,40);
      class3Grade.setVisible(true);
      
      class4Grade = new JComboBox<>(tempLabels);
      GPAContainer.add(class4Grade);
      class4Grade.setBounds(185,182,120,40);
      class4Grade.setVisible(true);
      
      class5Grade = new JComboBox<>(tempLabels);
      GPAContainer.add(class5Grade);
      class5Grade.setBounds(185,212,120,40);
      class5Grade.setVisible(true);

      class6Grade = new JComboBox<>(tempLabels);
      GPAContainer.add(class6Grade);
      class6Grade.setBounds(185,242,120,40);
      class6Grade.setVisible(true);
      
   }
   public void actionPerformed(ActionEvent e) {
      Calculation calc = new Calculation();
      DecimalFormat decFormat = new DecimalFormat("0.0");
      int class1Hrs = 0;
      int class2Hrs = 0;
      int class3Hrs = 0;
      int class4Hrs = 0;
      int class5Hrs = 0;
      int class6Hrs = 0;
      if(!class1CreditHrs.getText().equals("")){
        class1Hrs = Integer.parseInt(class1CreditHrs.getText());
      }
      if(!class2CreditHrs.getText().equals("")){
        class2Hrs = Integer.parseInt(class2CreditHrs.getText());
      }
      if(!class3CreditHrs.getText().equals("")){
        class3Hrs = Integer.parseInt(class3CreditHrs.getText());
      }
      if(!class4CreditHrs.getText().equals("")){
        class4Hrs = Integer.parseInt(class4CreditHrs.getText());
      }
      if(!class5CreditHrs.getText().equals("")){
        class5Hrs = Integer.parseInt(class5CreditHrs.getText());
      }
      if(!class6CreditHrs.getText().equals("")){
        class6Hrs = Integer.parseInt(class6CreditHrs.getText());
      }
      String grade = (String)class1Grade.getSelectedItem();

           if (e.getActionCommand().equals("Calculate")) {
               double c = calc.gradePoints(Double.parseDouble(class1CreditHrs.getText()),calc.QualityPoints(grade));
               class1GradePoints.setText(""+decFormat.format(c));



               int totalCredits = calc.totalCredits(class1Hrs,class2Hrs,class3Hrs,class4Hrs,class5Hrs,class6Hrs);
               System.out.println(totalCredits);
           }

 }
   public static void main(String[] args){
   
        GPA GPAFrame = new GPA();
        GPAFrame.setTitle("GPA calculator");
        GPAFrame.setSize(450,450);
        GPAFrame.setVisible(true);
        GPAFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

