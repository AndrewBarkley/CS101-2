//Write a program to add 17 and 42. the print the results in an organized and well labeled manner.

//Zachary Mosley

public class AddTwoIntegers
{
   public static void main(String [] args)
   {
   /*PSEUDO CODE
      Define num1 as 17
      Define num2 as 42
      Add num1 & num2
      Format process into a string
      Print string
   */
   
   int num1 = 17;
   int num2 = 42;
   int sum = num1 + num2;
   
   String s = num1 + "+" + num2 + "=" + sum;
   
   System.out.println(s);
   }//main

}//AddTwoIntegers