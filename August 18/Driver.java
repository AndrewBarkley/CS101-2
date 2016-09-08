//Zachary Mosley

public class Driver
{
   public static void main(String [] arga)
   {
      Rectangle r = new Rectangle(3, 2);//calling the constructor
      System.out.println(r.computeArea());
      System.out.println(r.computePerimeter());
      System.out.println(r.toString());
      System.out.println(r.getLength());
      System.out.println(r.getWidth());
      
      System.out.println();//Spacing
      
      Rectangle s = new Rectangle();//calling the default constructor
      s.setLength(-3);
      s.setWidth(4);
      System.out.println(s.computeArea());
      System.out.println(s.computePerimeter());
      System.out.println(s.toString());
      System.out.println(s.getLength());
      System.out.println(s.getWidth());
      
      Rectangle u = new Rectangle(7, 6);//calling the default constructor
      System.out.println(u.computeArea());
      System.out.println(u);
      System.out.println(u.toString());
   }
}