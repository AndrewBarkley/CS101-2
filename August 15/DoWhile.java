//Zachary Mosley

import java.util.*;

public class DoWhile
{
   public static void main(String [] args)
   {
      Scanner in = new Scanner(System.in);
      Boolean input = true;
      
      do
      {
         System.out.print("Do you want to use the app again? >");
         char letter = in.next().charAt(0);
         
         if(letter == 'n' || letter == 'N' || letter == 'y' || letter == 'Y')
         {
            input = false;
         }
      }while(input);
   }//main
}//DoWhile