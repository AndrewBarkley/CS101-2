//Zachary Mosley

public class Circle
{
   private double radius;

//Constants
   public static final double DEFAULT_RADIUS = 1;

//Constructor Method
   public Circle()
   {
      setRadius(DEFAULT_RADIUS);
   }
   public Circle(double radius)
   {
      setRadius(radius);
   }
   
//Mutator Methods
   public void setRadius(double rad)
   {
      if(rad >= 0)
         radius = rad;
   }
   
//Accessor Methods
   public double getRadius()
   {
      return radius;
   }
   
   //Methods
   public double computeArea()
   {
      return Math.PI * radius * radius;
   }
   public double computeCircuference()
   {
      return 2* Math.PI * radius;
   }
}