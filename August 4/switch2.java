//Zacahary Mosley

import java.util.*;
public class switch2
{
   public static void main(String [] args)
   {
      int score = 10;
      String grade = "U";
      
      switch(score)
      {
         case 10:
         case 9:
            grade = "A";
            break;
         case 8:
            grade = "B";
            break;
         case 7:
            grade = "C";
            break;
         case 6:
            grade = "D";
            break;
         case 5:
         case 4:
         case 3:
         case 2:
         case 1:
         case 0:
            grade = "E";
            break;
         default: System.out.print("Not viable");
      }
         System.out.print(grade);
   }
}