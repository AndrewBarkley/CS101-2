//Zachary Mosley

public class Alphabet
{
   public static void main(String [] args)
   {
      char letter = 'a';
      
      for(int row = 1; row <= 26; row++)
      {
         char letter2 = 'a';
         for(int i = 2; i <= row;i++)
         {
            letter2++;
         }
         
         for(int columns = 26; columns >= row; columns--)
         {
            System.out.print("" + letter + letter2 + " ");
            letter2 += 1;
         }
         letter += 1;
         System.out.println();
      }
   }
}