//Zachary Mosley

public class Driver
{
   public static void main(String [] args)
   {
      Circle r = new Circle(2);//calling the constructor
      System.out.println(r.computeArea());
      System.out.println(r.computeCircuference());
      System.out.println(r.toString());
      System.out.println(r.getRadius());
   }
}