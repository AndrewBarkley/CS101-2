//Zachary Mosley

import java.util.*;
import java.io.*;

public class PumpingInputFromFile
{
   public static void main(String [] args) throws Exception
   {
      File inFile = new File("in.txt");
      Scanner in = new Scanner(inFile);
      final int SENTINEL = 0;
      int value = in.nextInt(); //priming read
   
      while (value != SENTINEL)
      {
         System.out.println(value);
         value = in.nextInt(); // pumping read
      }
   }
}