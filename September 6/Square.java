//Zachary Mosley

public class Square extends Rectangle
{
   //a square has four equal sides
   //Square inherits demensions from Rectangle,
   //no instance variable needed if length and 
   //width are equal, the side is represeted by either
   
   public Square(int side)
   {
      super(side, side);
   }
   
   //inherit computeArea()
   
   //inherit toString()
   //toString isn't specific enough
   public String toString()
   {
      return "Square with side " + length;
   }
   
}