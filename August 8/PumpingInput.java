//zacharyMosley

import java.util.*;
import java.io.*;

public class PumpingInput
{
   public static void main(String [] args)
   {
      Scanner in = new Scanner(System.in);
      final int SENTINEL = 0;
      System.out.print("Enter value, " + SENTINEL + " to stop >");
      int value = in.nextInt(); //priming read
   
      while (value != SENTINEL)
      {
         System.out.println(value);
         System.out.print("Enter value, " + SENTINEL + " to stop >");
         value = in.nextInt(); // pumping read
      }
      System.out.println("input complete");
   }
}