//Scanner : Zachary Mosley
import java.util.*;

public class Names
{
   public static void main(String [] args)
   {
      String name = "Ray Thomas";
      Scanner s = new Scanner(name);
      String fName = s.next();
      String lName = s.next();
      System.out.println(lName + ", " + fName);
   }//main
}//Names