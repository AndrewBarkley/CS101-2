//Zachary Mosley

public class MakeArray
{  
   public static int [] unsorted(int size, int small, int big)
   {
      int [] a = new int [size];
      int range = big - small + 1;
      for (int i = 0; i < a.length; i++)
      {
         a[i] = (int)(Math.random() * range + small);
      }
      return a;
   }
}