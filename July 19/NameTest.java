//Zachary Mosley

public class NameTest
{
   public static void main(String [] args)
   {
      String name = new String("Ray Thomas");
      System.out.println(name);
      int space = name.indexOf(' ');
      String firstName = name.substring(0, space);
      String lastName = name.substring(space + 1, name.length());
      String formattedName = new String(lastName + ", " + firstName);
      System.out.println(formattedName);
   }//main
}//NameTest