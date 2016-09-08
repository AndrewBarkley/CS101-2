//reads all Ints in  file assuming there are only Ints and find the:
//partial sums,
//partial products
//max value
//min value
//average(as a double)
//export to a file
//Zachary Mosley

import java.util.*;
import java.io.*;

public class FileCopy2
{
   public static void main(String [] args) throws Exception
   {
      String inputFileName = args[0];
      String outputFileName = args[1];
      File inFile = new File(inputFileName);
      File outFile = new File(outputFileName);
      Scanner in1 = new Scanner(inFile);
      Scanner in2 = new Scanner(inFile);
      Scanner in3 = new Scanner(inFile);
      Scanner in4 = new Scanner(inFile);
      Scanner in5 = new Scanner(inFile);
      PrintStream out = new PrintStream(outFile);
      
      int sum = 0;
      int product = 1;
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      double average = 0;
      int tokenNum = 0;
   
      out.println("Sums");
      while (in1.hasNextInt())
      {
         int value = in1.nextInt(); //priming read
         sum += value;
         out.println(sum);
      }
      out.println("\nProducts");
      while (in2.hasNextInt())
      {
         int value = in2.nextInt(); //priming read
         product *= value;
         out.println(product);
      }
      out.println("\nMax");
      while (in3.hasNextInt())
      {
         int value = in3.nextInt(); //priming read
         max = Math.max(max, value);
      }
      out.println(max);
      out.println("\nMin");
      while (in4.hasNextInt())
      {
         int value = in4.nextInt(); //priming read
         min = Math.min(min, value);
      }
      out.println(min);
      out.println("\nAverage");
      while (in5.hasNextInt())
      {
         int value = in5.nextInt(); //priming read
         average += value;
         tokenNum++;
      }
      out.println(average/tokenNum);
   }   
}