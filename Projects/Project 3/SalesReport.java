//Zachary Mosley
//Project 3

import java.util.*;
import java.io.*;

public class SalesReport
{
   public static void main(String [] args) throws Exception
   {
      String input1FileName = args[0];
      String input2FileName = args[1];
      String outputFileName = args[2];
      File inFile1 = new File(input1FileName);
      File inFile2 = new File(input2FileName);
      File outFile = new File(outputFileName);
      Scanner in1 = new Scanner(inFile1);
      PrintStream out = new PrintStream(outFile);
      String SENTINEL = "quit";
      
      copyFiles(in1, inFile2, out, SENTINEL);
   }//main
   
   public static void copyFiles(Scanner in1, File inFile2, PrintStream out, String SENTINEL) throws Exception
   {
      while(in1.hasNextLine())
      {
         //Declaring RESETING variables
         Scanner in2 = new Scanner(inFile2);//resets every time
         int total = 0;
         int amount;
         
         String code1 = in1.next();//Loop Variable
         
         while(!code1.equals(in2.next()))//Finds the ID on file 2 and assigns the name to a String
         {
            in2.next();
         }
         String name = in2.next();
         
         //PRINTING
         //maybe put in if statement for boolean incase theres no name
         out.println("Salesperson: " + name);
         out.println("\tSales Amounts:");
         while(in1.hasNextInt())
         {
            amount = in1.nextInt();
            out.println("\t\t$" + amount/100 + "." + amount%100);
            total += amount;
         }
         out.println("\tTotal Sales: $" + total/100 + "." + total%100 + "\n");
         
         
         in1.nextLine();//moves to next set of data
      }
   }//copyFiles
}//SalesReport