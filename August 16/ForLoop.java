//Zachary Mosley

public class ForLoop
{
   public static void main(String [] args)
   {
      for(int i = 1; i <= 10; i++)
      {
         System.out.print(i + " ");
      }
      System.out.println();
      for(int i = 10; i >= 1; i--)
      {
         System.out.print(i + " ");
      }
      System.out.println();
      for(char c = 'a'; c <= 'z'; c += 1)
      {
         System.out.print(c);
      }
      System.out.println();
   }
}