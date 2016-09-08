//Zachary Mosley

public class CallByVaue
{
   public static void main(String [] args)
   {
      int x = 7;
      incX(x);
      System.out.println(x);
      incX(7+3);
      System.out.println(7+3);
      A a = new A(42);
      incX(a);
      make17(a);
      
   }
   
   public static void make17(A a)
   {
      a = new A(17);
   }
   
   public static void incX(A a)
   {
      a.incX();
   }
}

