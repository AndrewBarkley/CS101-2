//Zachary Mosley

import java.io.*;
import java.util.*;

public class ArraySize
{
   public static void main(String [] args)
   {
      int [] a = {1,2,3,4,5};
      //add 6 to the end of the array
      int [] temp = new int [a.length + 1];
      for (int i =0; i < a.length; i++)
      {
         temp[i] = a[i];
      }
      temp[temp.length - 1] = 6;
      a = temp;
      temp = null;
      
      //make array one smaller
      temp = new int [a.length - 1];
      for (int i =0; i < temp.length; i++)
      {
         temp[i] = a[i];
      }
      a = temp;
      temp = null;
   }
}