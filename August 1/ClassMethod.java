//Zachary Mosley

public class ClassMethod
{
   public static void main(String [] args)
   {
      int x = 5;
      print(x);
      System.out.println();
      
      int y = add(x, x*3);
      print(y);
      System.out.println();
   }//main
   public static void print(int val)
   {
      System.out.print(val);
   }//print
   private static int add(int a, int b)
   {
      return a + b;
   }
}