//Zachary Mosley

import java.io.*;
import java.util.*;

public class Aggregate
{
   public static void main(String [] args)
   {
      int [] a = {1,21,13,4,25,6,17,8,9,10};
      int sum = sumArray(a);
      System.out.println(sum);
      
      int product = arrayProduct(a);
      System.out.println(product);
      
      int max = arrayMax(a);
      System.out.println(max);
      
      int min = arrayMin(a, 2, 7);
      System.out.println(min);
      
   }
   public static int sumArray(int [] a)
   {
      int sum = 0;
      for(int i = 0; i < 10; i++)
      {
         sum += a[i];
      }
      return sum;
   }
   public static int arrayProduct(int [] a)
   {
      int product = 1;
      for(int i = 0; i < 10; i++)
      {
         product *= a[i];
      }
      return product;
   }
   public static int arrayMax(int [] a)
   {
      int max = Integer.MIN_VALUE;
      for(int i = 0; i < 10; i++)
      {
         if(max <= a[i])
            max = a[i];
      }
      return max;
   }
   public static int arrayMin(int [] a, int first, int last)
   {
      int min = Integer.MAX_VALUE;
      for(int i = first; i < last; i++)
      {
         if(min >= a[i])
            min = a[i];
      }
      return min;
   }
}
