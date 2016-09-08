//In class wwork
//Zacahry Mosley
import java.util.*;

public class ScannerMath
{
   public static void main(String [] args)
   {
      Scanner in = new Scanner(System.in);
      
      int larger = Math.max(in.nextInt(), in.nextInt());
      System.out.println(larger);
      
      int smaller = Math.min(in.nextInt(), in.nextInt());
      System.out.println(smaller);
      
      int absolute1 = Math.abs(in.nextInt());
      System.out.println(absolute1);
      
      int absolute2 = Math.abs(in.nextInt());
      System.out.println(absolute2);
   }//main
}//ScannerMath