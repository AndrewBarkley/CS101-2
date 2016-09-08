//Zachary Mosley

public ShortCut
{
   public static void main(String [] args)
   {
      int a = 5;
      int b = ++a;
      a = 5;
      b = a++;
          a = 3;
          b = 4;
      int c = 5;
      int d = 6;
      int e = 7;
      int f = 8;
      
      d = ++d + a++ + ++a + --b + b-- + ++c + f-- - c-- + e++;
      //^This shit is awful^
      
      
   }//main
}//ShortCut