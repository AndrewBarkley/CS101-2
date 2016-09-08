/*
To estimate home much money the beekeeper should recieve
*/

/*
Zachary Mosley
7/25/16
CS101-02
*/

import javax.swing.*;
import java.text.*;

public class BeeMoney
{

/* 
                 Algorithm
main(args)

Declare my constants (my cost values)

Ask the user to input a estimated value for # of jars sold
Obtain honeyJarsNum from JOptionPane using parseInt()
Obtain honeyCaseNum from the rint() of honeyJarsNum
Determine honeyCaseValue by multiplying honeyCaseNum by its cost constant

Ask the user to input a value for # of pounds of raw honey sold
Obtain honeyRawNum from JOptionPane using parseInt()
Determine honeyRawValue by multiplying honeyRawNum by its cost constant

Ask the user to input a value for # of pounds of honey combs sold
Obtain honeyCombNum from JOptionPane using parseInt()
Determine honeyCombValue by multiplying honeyCombNum by its cost constant

Ask the user to input a value for # of hives rented
Obtain hiveNum from JOptionPane using parseInt()
Determine hiveRentalValue by multiplying hiveNum by its cost constant

Determine totalValue by adding all other value variables

Create a pattern string for formatting my values
Use the string to create a format "money"
Print my values with their format and text to eplain what they are
              
*/

/*

                  Data Table
Variable or Constant          Purpose
____________________          _________________________________________
args                          parameter of main

honeyJarsString               String Containing ~## of jars sold
honeyJarsNum                  ~## of jars sold
honeyCaseNum                  ## of cases sold
HONEY_CASE_COST               45.36  (dollar value of honeyCase)
honeyCaseValue                honeyCaseNum * HONEY_CASE_COST

honeyRawString                String Containing ## of raw honey sold
honeyRawNum                   ## of raw honey sold
HONEY_RAW_COST                0.99   (dollar value of honeyRaw)
honeyRawValue                 honeyRawNum * HONEY_RAW_COST

honeyCombString               String Containing ~## of honey combs sold
honeyCombNum                  ## of raw comb sold
HONEY_COMB_COST               2.49   (dollar value of honeyComb)
honeyCombValue                honeyCombNum * HONEY_COMB_COST

hiveString                    String Containing ~## of hives rented
hiveNum                       ## of hives rented
HIVE_RENTAL_COST              534.99 (dollar value of hiveRental)
hiveRentalValue               HiveRentalNum * HIVE_RENTAL_COST

totalValue                    The total of all of the value variables

pattern                       String to use in formatting
money                         Format for my output values
*/

   public static void main(String [] args)
   {
      //Constants
      final double HONEY_CASE_COST = 45.36;
      final double HONEY_RAW_COST = 0.99;
      final double HONEY_COMB_COST = 2.49;
      final double HIVE_RENTAL_COST = 534.99;
      
      //Honey Cases code
      String honeyJarsString = new String(JOptionPane.showInputDialog
                  (null,"Please enter your jar estimate"));
      int honeyJarsNum = Integer.parseInt(honeyJarsString);
      int honeyCaseNum = (int)(Math.rint(honeyJarsNum / 24.0));  
      double honeyCaseValue = honeyCaseNum * HONEY_CASE_COST;
      
      //Raw Honey code
      String honeyRawString = new String(JOptionPane.showInputDialog
                  (null,"Please enter your pounds of raw honey"));
      int honeyRawNum = Integer.parseInt(honeyRawString);
      double honeyRawValue = honeyRawNum * HONEY_RAW_COST;
      
      //Honey Comb code
      String honeyCombString = new String(JOptionPane.showInputDialog
                  (null,"Please enter your pounds of honey comb"));
      int honeyCombNum = Integer.parseInt(honeyCombString);
      double honeyCombValue = honeyCombNum * HONEY_COMB_COST;
      
      //Hive Rental code
      String hiveString = new String(JOptionPane.showInputDialog
                  (null,"Please enter your number of hives rented"));
      int hiveNum = Integer.parseInt(hiveString);
      double hiveRentalValue = hiveNum * HIVE_RENTAL_COST;
      
      //Total Value code
      double totalValue = honeyCaseValue + honeyRawValue + 
                           honeyCombValue + hiveRentalValue;
                           
      //Format & Print code
      String pattern = "$#,##0.00";
      DecimalFormat money = new DecimalFormat(pattern);
      JOptionPane.showMessageDialog
                  (null,"You sold and rented: \n" + 
                         money.format(honeyCaseValue) + " worth of honey cases, \n" + 
                         money.format(honeyRawValue) + " worth of raw honey, \n" + 
                         money.format(honeyCombValue) + " worth of honey combs, and \n" + 
                         money.format(hiveRentalValue) + " worth of hives. \n" + 
                         "Totaling " + money.format(totalValue));
                         
   }//main method end
}//Template class end