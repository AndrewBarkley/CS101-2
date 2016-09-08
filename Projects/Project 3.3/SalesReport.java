//Zachary Mosley
//Project 3

import java.util.*;
import java.io.*;

public class SalesReport
{  
/*
                  Main Algorithm
-----------------------------------------------------------------------
String input1FileName <-- args[0]
String input2FileName <-- args[1]
String outputFileName <-- args[2]
File inFile1 <-- input1FileName
File inFile2 <-- input2FileName
File outFile <-- outputFileName
Scanner in1  <-- inFile1
Scanner in3  <-- inFile1
PrintStream out <-- outFile

String SENTINEL <-- "quit"
String currentLine <-- in3.nextLine().toLowerCase()

int max <-- MIN_VALUE;
int min <-- MAX_VALUE;
String minName <-- "";
String maxName <-- "";

copyFiles() <-- calls a method
-----------------------------------------------------------------------

                  Class Data Table
Variable or Constant          Purpose
____________________          _________________________________________
String input1FileName         Obtains the first input file name
String input2FileName         Obtains the second input file name
String outputFileName         Obtains the output file name
File inFile1                  Registers the first input file
File inFile2                  Registers the second input file
File outFile                  Registers the output file
Scanner in1                   Reads each token in inFile1
PrintStream out               Prints to outFile

String SENTINEL               The string containing the sentinel
String currentLine            Equals each line of inFile1 to test for sentinel
Scanner in3                   Reads each line of inFile1

int max                       Equals the largest total amount sold
int min                       Equals the smallest total amount sold
String maxName                Equals the name of the person who has 'max'
String minName                Equals the name of the person who has 'min'
*/

   public static void main(String [] args) throws Exception
   {
      //Input and Output initialization
      String input1FileName = args[0];
      String input2FileName = args[1];
      String outputFileName = args[2];
      File inFile1 = new File(input1FileName);
      File inFile2 = new File(input2FileName);
      File outFile = new File(outputFileName);
      Scanner in1 = new Scanner(inFile1);
      Scanner in3 = new Scanner(inFile1);
      PrintStream out = new PrintStream(outFile);
      //To test for SENTINEL
      String SENTINEL = "quit";
      String currentLine = in3.nextLine().toLowerCase();
      //For the MIN and MAX values
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      String maxName = "";
      String minName = "";
      
      //Call method to read and  copy the data
      copyFiles(in1, in3, inFile2, out, SENTINEL, currentLine, min, minName, max, maxName);
   }//main
   
   /*
                  Main Algorithm
-----------------------------------------------------------------------
while(currentLine doesnt have the SENTINEL in it)
{
   Scanner in2 <-- inFile2
   int total <-- 0
   int amount <-- 0
   String code1 <-- in1.next()
         
   while(code1 doesn't equal the next token in inFile2)
   {
      if(in2 doesn't have a next line)
      {
         print an Error 404 message
         Exit the program
      }
   }
   String name <-- in2.nextLine().trim()
    
   out.println <-- "Salesperson: " + name
   out.println <-- "\tSales Amounts:"
   while(in1 has another int)
   {
      amount <-- in1.nextInt()
      out.println <-- "\t\t$" + amount/100 + "." + amount%100
      total <-- total + amount
   }
   out.println <-- "\tTotal Sales: $" + total/100 + "." + total%100 + "\n"
         
   if (total is less than or equal to min)
   {
      min <-- total
      minName <-- name
   }
   if (total greater than or equal to max)
   {
      max <-- total
      maxName <-- name
   }
   in1.nextLine()
   currentLine <-- in3.nextLine().toLowerCase()
}
   out.println <-- "BEST SALESPERSON"
   out.println <-- "Salesperson: " + maxName
   out.println <-- "\tSold: $" + max/100 + "." + max%100 + "\n"
   out.println <-- "WORST SALESPERSON"
   out.println <-- "Salesperson: " + minName
   out.println <-- "\tSold: $" + min/100 + "." + min%100 + "\n"
-----------------------------------------------------------------------

                  Class Data Table
Variable or Constant          Purpose
____________________          _________________________________________
File inFile2                  Registers the second input file
Scanner in1                   Reads each token in inFile1
PrintStream out               new PrintStream(outFile);
String SENTINEL               The string containing the sentinel
String currentLine            Equals each line of inFile1 to test for sentinel
Scanner in3                   Reads each line of inFile1
int max                       Equals the largest total amount sold
int min                       Equals the smallest total amount sold
String maxName                Equals the name of the person who has 'max'
String minName                Equals the name of the person who has 'min'

Scanner in2                   Reads each token in inFile2
int amount                    Equals each subvalue for each person
int total                     Equals the total amount sold for each person
String code1                  Equals the ID number in inFile1
String name                   Equals each person's name
*/
   
   public static void copyFiles(Scanner in1, Scanner in3, File inFile2, 
                                 PrintStream out, String SENTINEL, 
                                 String currentLine, int min, String minName, 
                                 int max, String maxName) throws Exception
   {
      while(!currentLine.contains(SENTINEL))
      {
         //Declaring RESETING variables
         Scanner in2 = new Scanner(inFile2);
         int total = 0;
         int amount = 0;
         String code1 = in1.next();//inFile1 ID Code
         
         //Finds the ID on inFile2 and assigns the name to a String
         while(!code1.equals(in2.next()))
         {
            if(!in2.hasNextLine())
            {
               System.out.println("ERROR 404: Name not found");
               System.exit(404);
            }
         }
         String name = in2.nextLine().trim();
         
         //PRINTING Formatted Data
         out.println("Salesperson: " + name);
         out.println("\tSales Amounts:");
         while(in1.hasNextInt())
         {
            amount = in1.nextInt();
            out.println("\t\t$" + amount/100 + "." + amount%100);
            total += amount;
         }
         out.println("\tTotal Sales: $" + total/100 + "." + total%100 + "\n");
         
         //Min and Max testing
         if (total <= min)
         {
            min = total;
            minName = name;
         }
         if (total >= max)
         {
            max = total;
            maxName = name;
         }
         //Loop Variables
         in1.nextLine();
         currentLine = in3.nextLine().toLowerCase();
      }
      //Print the best and worst sales people
      out.println("BEST SALESPERSON");
      out.println("Salesperson: " + maxName);
      out.println("\tSold: $" + max/100 + "." + max%100 + "\n");
      out.println("WORST SALESPERSON");
      out.println("Salesperson: " + minName);
      out.println("\tSold: $" + min/100 + "." + min%100 + "\n");
      
   }//copyFiles
}//SalesReport