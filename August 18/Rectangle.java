//Zachary Mosley

public class Rectangle
{
   //Instnce Variables
   private int length;
   private int width;
   
   //Class constants
   public static final int DEFAULT_LENGTH = 1;
   public static final int DEFAULT_WIDTH = 2;
   
   //Constructors
   public Rectangle()
   {
      setLength(DEFAULT_LENGTH);
      setWidth(DEFAULT_WIDTH);
   }
   
   public Rectangle(int length, int width)
   {
      setLength(length);
      setWidth(width);
   }
   
   //Mutator Methods
   public void setLength(int len)
   {
      if(len >= 0)
         length = len;
   }
   public void setWidth(int wid)
   {
      if(wid >= 0)
         width = wid;
   }
   
   //Accessor Methods
   public int getLength()
   {
      return length;
   }
   public int getWidth()
   {
      return width;
   }
   
   //Methods
   public int computeArea()
   {
      return length * width;
   }
   public int computePerimeter()
   {
      return 2 * length + 2 * width;
   }
   public String toString()
   {
      return "Rectangle with:\n\tlength:" + length + "\n\twidth:" + width;
   }
}