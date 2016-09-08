//Zacahary Mosley

public class SquareRoot
{
   public static void main(String [] args)
   {
      //Using loop
      double p = 5.0;
      double x = p/2.0;
      final double DELTA = 0.00001;
      while(Math.abs(x * x - p) > DELTA)
      {
         if((x*x) > p)
         {
            x = x - x/2;
         }else
         {
            x = x + x/2;
         }
      }
      System.out.println(p);
      System.out.println(x * x);
      System.out.println(x);
            
      //Cheat
      double num2 = 5.0;
      
      num2 = Math.sqrt(num2);
      
      System.out.println(num2);
      System.out.println(num2 * num2);
   }
}