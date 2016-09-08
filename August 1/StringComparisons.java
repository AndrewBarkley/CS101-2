//Zachary Mosley

public class StringComparisons
{
   public static void main(String [] args)
   {
      String s = "abc";
      String t = new String(s);
      if (s == t)
      {
         System.out.println("equal");
      }
      else
      {
         System.out.println("inequal");
      }
      
      if (s.equals(t))
      {
         System.out.println("equal");
      }
      else
      {
         System.out.println("inequal");
      }
      
      int x = "abc".compareTo("abc");
      System.out.println(x);
      x = "abc".compareTo("azc");
      System.out.println(x);
      x = "azc".compareTo("abc");
      System.out.println(x);
      x = "ab".compareTo("abc");
      System.out.println(x);
      x = "abcd".compareTo("abc");
      System.out.println(x);
   } 
}