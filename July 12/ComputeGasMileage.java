//Write a program to compute gas mileage. Note that # of gallons, miles, and mileage aren't integers.

//Zachary Mosley

public class ComputeGasMileage
{
   public static void main(String [] args)
   {
   /*PSEUDO CODE
      Define gallons as x
      Define miles as y
      Divide miles by gallons
      Format process into a string
      Print string
   */
   
   double gallons = 13.5;
   double miles = 428.1;
   double mileage = miles / gallons;
   
   String s = miles + "miles / " + gallons 
               + "gallons = " + mileage + "mpg";
   
   System.out.println(s);
   }//main

}//AddTwoIntegers