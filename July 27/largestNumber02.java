//write a program to usa a scanner object to read 3 numbers 
//and print the 3 numbers, then print the largest number

//Zacahary Mosley

import java.util.*;

public class largestNumber02
{
   public static void main(String [] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int num1 = keyboard.nextInt();
      int num2 = keyboard.nextInt();
      int num3 = keyboard.nextInt();
      
            
      /*
      if (num1 <= num2)
      {
         if (num1 <= num3)
         {
            if (num3 <= num2)
            {
               System.out.print(num1 + "," + num3 + "," + num2);
            }
            else
            {
               System.out.print(num1 + "," + num2 + "," + num3);
            }
         }
         else
         {
            System.out.print(num3 + "," + num1 + "," + num2);
         }
      }
      else
      {
         if (num2 <= num3)
         {
            if (num3 <= num1)
            {
               System.out.print(num2 + "," + num3 + "," + num1);
            }
            else
            {
               System.out.print(num2 + "," + num1 + "," + num3);
            }
         }
         else
         {
            System.out.print(num3 + "," + num2 + "," + num1);
         }
      }
      */
      
      if (num1 <= num2 && num2 <= num3)
      {
         System.out.print(num1 + "," + num2 + "," + num3);
      }
      else if (num1 <= num2 && num1 <= num3 && num3 <= num2)
      {
         System.out.print(num1 + "," + num3 + "," + num2);
      }
      else if (num2 <= num1 && num1 <= num3)
      {
         System.out.print(num2 + "," + num1 + "," + num3);
      }
      else if (num2 <= num1 && num2 <= num3 && num3 <= num1)
      {
         System.out.print(num2 + "," + num3 + "," + num1);
      }
      else if (num3 <= num2 && num2 <= num1)
      {
         System.out.print(num3 + "," + num2 + "," + num1);
      }
      else if (num3 <= num2 && num3 <= num1 && num1 <= num2)
      {
         System.out.print(num3 + "," + num1 + "," + num2);
      }
   }
}