//zacharyMosley

import java.util.*;
import java.io.*;

public class PumpingInput2
{
   public static void main(String [] args)
   {
      Scanner in = new Scanner(System.in);
      final int SENTINEL = 0;
      System.out.print("Enter value, " + SENTINEL + " to stop >");
      int value = in.nextInt(); //priming read
      int value2 = 0;
   
      while (value != SENTINEL)
      {
         value2 += value;
         System.out.println(value2);
         System.out.print("Enter value, " + SENTINEL + " to stop >");
         value = in.nextInt(); // pumping read
      }
      System.out.println("Total: " + value2);
   }
}