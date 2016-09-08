//Zachary Mosley

public class Circle
{
   private int radius;

//Constants
   public static final int DEFAULT_RADIUS = 1;

//Constructor Method
   public Circle()
   {
      setRadius(DEFAULT_RADIUS);
   }
   public Circle(int radius)
   {
      setRadius(radius);
   }
   
//Mutator Methods
   public void setRadius(int rad)
   {
      if(rad >= 0)
         radius = rad;
   }
   
//Accessor Methods
   public int getRadius()
   {
      return radius;
   }
   
   //Methods
   public int computeArea()
   {
      return Math.PI * radius * radius;
   }
   public int computeCircuference()
   {
      return 2* Math.PI * radius;
   }
}