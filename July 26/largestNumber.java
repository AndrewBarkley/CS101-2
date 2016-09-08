//write a program to usa a scanner object to read 3 numbers 
//and print the 3 numbers, then print the largest number

//Zacahary Mosley

import java.util.*;

public class largestNumber
{
   public static void main(String [] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int num1 = keyboard.nextInt();
      int num2 = keyboard.nextInt();
      int num3 = keyboard.nextInt();
      
      //THIS IS SHITTY CODING, DON'T DO THIS IN REAL PROGRAMS
      
      System.out.println(num1 + "," + num2 + "," + num3);
      
      if (num1 > num2)
      {
         if (num1 > num3)
         {
            System.out.print("the largest number is " + num1);
         }
         else
         {
            System.out.print("the largest number is " + num3);
         }
      }
      else
      {
         if (num2 > num3)
         {
            System.out.print("the largest number is " + num2);
         }
         else
         {
            System.out.print("the largest number is " + num3);
         }
      }
   }
}