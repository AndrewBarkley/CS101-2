//Zachary Mosley

import javax.swing.*;

public class inputSalary
{
   public static void main(String [] args)
   {
      String s = new String(JOptionPane.showInputDialog(null,"Please enter your wage"));
      double wage = Double.parseDouble(s);
      wage *= 1.3;
      JOptionPane.showMessageDialog(null,"your new wage is " + wage);
      
      
   }//main
}//inputAge