//Zachary Mosley

import java.util.*;

public class Tree1
{
//get size from user and add the stars to each line with correct spacing
   public static void main(String [] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter a size >");
      int size = in.nextInt();
      
      for(int row = 1; row <= size; row++)
      {
         for(int spaces = size; spaces > row; spaces--)
         {
            System.out.print(" ");
         }
         for(int columns = 1; columns <= row; columns++)
         {
            System.out.print("* ");
         }
         System.out.println();
      }
   }
}