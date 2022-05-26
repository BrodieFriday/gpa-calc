import java.text.DecimalFormat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GPA extends JFrame implements ActionListener{

   JComboBox class1Grade,class2Grade,class3Grade,class4Grade,class5Grade,class6Grade;
   JTextField class1CreditHrs,class2CreditHrs,class3CreditHrs,class4CreditHrs,class5CreditHrs,class6CreditHrs;

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
      creditHours.setBounds(90, 75, 100, 20);
      // Left column of textboxes for credit hours
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
       
       class6CreditHrs= new JTextField("");
       GPAContainer.add(class6CreditHrs);
       class6CreditHrs.setBounds(80, 250, 100, 20);
      
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
      class1Grade = new JComboBox(tempLabels);
      GPAContainer.add(class1Grade);
      class1Grade.setBounds(185,95,120,40);
      class1Grade.setVisible(true);
      
      class2Grade = new JComboBox(tempLabels);
      GPAContainer.add(class2Grade);
      class2Grade.setBounds(185,125,120,40);
      class2Grade.setVisible(true);
      
      class3Grade = new JComboBox(tempLabels);
      GPAContainer.add(class3Grade);
      class3Grade.setBounds(185,155,120,40);
      class3Grade.setVisible(true);
      
      class4Grade = new JComboBox(tempLabels);
      GPAContainer.add(class4Grade);
      class4Grade.setBounds(185,185,120,40);
      class4Grade.setVisible(true);
      
      class5Grade = new JComboBox(tempLabels);
      GPAContainer.add(class5Grade);
      class5Grade.setBounds(185,215,120,40);
      class5Grade.setVisible(true);
      
   }
   public void actionPerformed(ActionEvent e) {
      Calculation calc = new Calculation();
      DecimalFormat decFormat = new DecimalFormat("0.0");
      int class1Hrs = Integer.parseInt(class1CreditHrs.getText());
      int class2Hrs = Integer.parseInt(class2CreditHrs.getText());
      int class3Hrs = Integer.parseInt(class3CreditHrs.getText());
      int class4Hrs = Integer.parseInt(class4CreditHrs.getText());
      int class5Hrs = Integer.parseInt(class5CreditHrs.getText());
      int class6Hrs = Integer.parseInt(class6CreditHrs.getText());
      String grade = (String)class1Grade.getSelectedItem();

           if (e.getActionCommand().equals("Calculate")) {
               double c = calc.gradePoints(Double.parseDouble(class1CreditHrs.getText()),calc.QualityPoints(grade));
               class1CreditHrs.setText(""+decFormat.format(c));
               int totalCredits = calc.totalCredits(class1Hrs,class2Hrs,class3Hrs,class4Hrs,class5Hrs,class6Hrs);
               System.out.println(totalCredits);
           }

 }
   public static void main(String[] args){
   
        GPA GPAFrame = new GPA();
        GPAFrame.setTitle("GPA calculator");
        GPAFrame.setSize(420,450);
        GPAFrame.setVisible(true);
        GPAFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

