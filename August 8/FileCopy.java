//Zacahry Mosley

import java.util.*;
import java.io.*;

public class FileCopy
{
   public static void main(String [] args) throws Exception
   {
      //write code to copy a file
      //Use args to get the file name
      //input file name is in args[0], output file name is in args[1]
      String inputFileName = args[0];
      String outputFileName = args[1];
      File inFile = new File(inputFileName);
      File outFile = new File(outputFileName);
      Scanner in = new Scanner(inFile);
      PrintStream out = new PrintStream(outFile);
      
      while(in.hasNextLine())
      {
         String line = in.nextLine();
         out.println(line);
      }
   }
}