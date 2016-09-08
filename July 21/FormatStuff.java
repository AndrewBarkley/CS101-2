//DecimalFormat
//Zachary Mosley
import java.text.DecimalFormat;


public class FormatStuff
{
   public static void main(String [] args)
   {
      String pattern = "$#,##0.00";
      double value = 1234567.85632;
      DecimalFormat f = new DecimalFormat(pattern);
      String pattern2 = "#,##0.0%";
      DecimalFormat f2 = new DecimalFormat(pattern2);
      double value2 = 0.2345;
      
      System.out.println(f.format(value));
      System.out.println(f2.format(value));
      System.out.println(f.format(value2));
      System.out.println(f2.format(value2));
   }//main
}//FormatStuff