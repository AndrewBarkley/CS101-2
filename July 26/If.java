public class If
{
   public static void main(String [] args)
   {
      int a = 7;
      int b = 0;
      if (b != 0 && a / b > 2)//short circuit
         System.out.println(a / b);
         
      if (b != 0 & a / b > 2)//not short circuit
         System.out.println(a / b);
   }
}