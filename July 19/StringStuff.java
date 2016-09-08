//Zachary Mosley

public class StringStuff
{
   public static void main(String [] args)
   {
      String s = new String();
      String t = null;
      String r = t + "abc";
      
      s = "abcdef";
      System.out.println(s.length());
      System.out.println(s.charAt(2));
      System.out.println(s.charAt(0));
      System.out.println(s.charAt(s.length()-1));
      System.out.println(s.charAt(s.length()-1));
      
      s = "aBc123DeF";
      t = s.toLowerCase();
      System.out.println(t);
      t = s.toUpperCase();
      System.out.println(t);
      
      s = "A more interesting String";
      int location = s.indexOf('i');
      location = s.indexOf('i', location + 1);
      location = s.indexOf('z');
      System.out.println(location);
      
      
      
      
   }//main
}//StringStuff