//Zachary Mosley

import java.io.*;
import java.util.*;

public class ArrayCopy
{
   public static void main(String [] args)
   {
      int [] a = {1,2,3,4,5};
      //copy a reference into b
      int [] b = a;
      b[2] = 17;
      
      //copy a into c
      int [] c = new int [a.length];
      for(int i = 0; i < a.length; i++)
      {
         c[i] = a[i];
      }
      
      
      //are the arrays equal
      boolean isEqual = true;
      for(int i = 0; i < a.length && isEqual; i++)
      {
         if(a[i] != c[i])
            isEqual = false;
      }
      System.out.println(isEqual);
   }
}