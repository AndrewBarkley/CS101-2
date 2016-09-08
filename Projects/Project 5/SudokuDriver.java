//Zachary Mosley

import java.util.*;

public class SudokuDriver
{
   public static void main(String [] args)
   {
      Sudoku s = new Sudoku();
      System.out.println(s);
      
      //below is tested and works
      s.addInitial(1,1,5);
      System.out.println(s);
      s.addInitial(3,5,7);
      System.out.println(s);
      s.addInitial(7,3,3);
      System.out.println(s);
      System.out.println(s.getValueIn(7,3));
      System.out.println(s);
      s.addGuess(7,3,7);
      System.out.println(s);
      s.addGuess(7,8,1);
      System.out.println(s);
      
      s.reset();
      System.out.println(s);
   }
}