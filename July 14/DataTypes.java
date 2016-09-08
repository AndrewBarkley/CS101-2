//

//Zachary Mosley

public class DataTypes
{
   public static void main(String  [] args)
   {
      //PRIMITIVE TYPES
      
      // not numeric
      boolean flag = true;
      flag = false;
      char quote = '\'';
      System.out.println(quote);
      
      //numeric types
      byte a = 3;
      short b = 4;
      int c = 5;
      long d = 7L;
      float e = 3.2f;
      double f = 16.3e2;
      
      //Type Casting
      b = (short)(a + b);
      a = (byte) 342;//really only 86
      
   }//main
}//DataTypes