/*
Compute Gas Mileage
*/

/*
Zachary Mosley
7-25-16
CS101-02
*/

import java.util.*;

public class GasMileage
{

/*
                  Algorithm
main(args)   
create a scanner object: keyboard
ask the user to input the # of miles driven
log value as: milesDriven
ask the user to input the # of gallons used
log value as: gallonsUsed
declare milesPerGallon
milesPerGallon = milesDriven/gallonsUsed
print milesDriven
print gallonsUsed
print milesPerGallon              
*/

/*
                   Data Table
Variable or Constant          Purpose
____________________          _________________________________________
args                          parameter of main

keyboard                      scanner to register input
MilesDriven                   variable containing miles driven
gallonsUsed                   variable containing gallons used
milesPerGallon                variable containing mileage
*/

   public static void main(String [] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("please input # of miles driven: ");
      double milesDriven = keyboard.nextDouble();
      System.out.print("please input # of gallons used: ");
      double gallonsUsed = keyboard.nextDouble();
      double milesPerGallon = milesDriven/gallonsUsed;
      System.out.println("miles driven = " + milesDriven);
      System.out.println("gallons used = " + gallonsUsed);
      System.out.println("mileage = " + milesPerGallon);
   }//main method end
}//Template class end