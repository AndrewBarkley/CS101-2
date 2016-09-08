public class Scope
{
   public static void main(String [] args)
   {
      int a = 7;
      int b = 3;
      if (a > b)
      {
         int i = 4;
         int j = 2;
      }//Scope of i & j ends here
      
      System.out.print(i);//<cant be done because i no longer exists
      
   }//Scope of a & b ends here
}