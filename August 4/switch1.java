//Zachry Mosley

import java.util.*;
public class switch1
{
   public static void main(String [] args)
   {
      System.out.print("Enter your favorite color >");
      Scanner in = new Scanner(System.in);
      String color = in.next();
      
      switch(color.toLowerCase())
      {
         case "green":
            System.out.println("How unfortunate");
            break;
         case "blue":
            System.out.println("Awesome!");
            break;
         case "yellow":
            System.out.println("Weirdo");
            break;
         case "black":
            System.out.println("Best choice");
            break;
         case "orange":
            System.out.println("Rhymes with purple");
            break;
         default: System.out.print("Sorry that is not in our variable bank");
      }
   }
}