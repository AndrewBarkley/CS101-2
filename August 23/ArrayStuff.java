//Zachary Mosley

public class ArrayStuff
{
   public static void main(String [] args)
   {
      //array declaratin
      //type [] identifier
      int [] a;
      double [] b;
      char [] c;
      boolean [] d;
      String [] e;
      
      //alternate declaration syntax
      //type identifier []
      byte f [];
      
      //instantiating arrays
      //identifier = new type [int_expresion]
      a = new int [10];
      b = new double [12 / 2];
      c = new char [1 + 3];
      d = new boolean [2 * 4];
      
      //populating arrays
      b[0] = 3.2;
      b[1] = 2*b[0];
      
      String [] s = {"Jan", "Feb", "Mar"};
      
      for(int i = 0; i < a.length; i++)
      {
         a[i] = (i+1)*(i+1);
      }
      
      for(int i = 0; i < a.length; i++)
      {
         System.out.println(a[i]);
      }
   }
}