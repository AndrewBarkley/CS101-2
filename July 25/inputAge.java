//Zachary Mosley

import javax.swing.*;

public class inputAge
{
   public static void main(String [] args)
   { 
      String s = new String(JOptionPane.showInputDialog(null,"Please enter your age"));
      int age = Integer.parseInt(s);
      age += 5;
      JOptionPane.showMessageDialog(null,"your age in 5 years is " + age);
      
      
   }//main
}//inputAge