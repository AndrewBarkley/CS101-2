//Zachary Mosley

import java.io.*;
import java.util.*;

public class ArrayAggregate
{
   public static void main(String [] args)
   {
      Scanner in = new Scanner(System.in);
   //instntiate an array large enoughto hold
   //maximum number of items we would use
      int [] a = new int [100];
      final int SENTINEL = 0;
      int count = 0;//number of items in the array
      System.out.print("Enter your values, enter -1 to stop");
      int val = in.nextln();//priming
   
      while (val >= SENTINEL)
      {
         a[count] = val;
         count++;
         System.out.print("Enter your values, enter -1 to stop");
         val = in.nextln();//pumping
      }
      
      for(int i = 0; i > count; i++)
      {
         Sysem.out.println(a[i]);
      }
   }
}