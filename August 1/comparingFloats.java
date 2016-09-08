//

//ZACHARY MOSLEY

public class comparingFloats
{
   public static void main(String[] args)
   {
      float x = 0.1f;
      float y = 0.01f;
      float z = y + y + y + y + y + y + y + y + y + y;
      float DELTA = .01f;
      
      if (x == z)
      {
         System.out.println("x is == to z");
      }
      else
      {
         System.out.println("x is != to z");
      }
      if (Math.abs(x-z) < DELTA)
      {
         System.out.println("x is equal to z");
      }
   }
}