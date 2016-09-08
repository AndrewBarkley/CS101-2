//Scanner : Zachary Mosley
import java.util.*;

public class InputScan
{
   public static void main(String [] args)
   {
      Scanner in = new Scanner(System.in);
      /*
      String fName = in.next();
      String lName = in.next();
      System.out.println(lName + ", " + fName);
      */
      String token = in.next();
      int i = in.nextInt();
      String line = in.nextLine();//Skips to the end of the current line
      line = in.nextLine();//Skips to the end
      double d = in.nextDouble();
   }//main
}//Names