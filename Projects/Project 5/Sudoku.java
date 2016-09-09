//Zachary Mosley

import java.util.*;
import java.io.*;

public class Sudoku
{
   //class variables
   private int [][] values = new int [9][9];
   private boolean [][] editable = new boolean [9][9];
   private boolean full;
   private int trueCount;
   
   //class methods
   
   public Sudoku()//done
   {
      for(int r=0;r<9;r++)
      {
         for(int c=0;c<9;c++)
         {
            editable[r][c] = true;
         }
      }
   }
   
   public void addInitial(int row, int coloumn, int value)//done
   {
      if(0<row && row<10 && 0<coloumn && coloumn<10 && 0<value && value<10)
      {
         values[row-1][coloumn-1] = value;
         editable[row-1][coloumn-1] = false;
      }
      else
         System.out.println("ERROR 323: One or more value(s) aren't within bounds");
   }
   
   public void addGuess(int row, int coloumn, int value)//done
   {
      if(editable[row-1][coloumn-1])
      {
         if(0<row && row<10 && 0<coloumn && coloumn<10 && 0<value && value<10)
         {
            values[row-1][coloumn-1] = value;
         }
         else
            System.out.println("ERROR 323: One or more value(s) aren't within bounds");
      }
      else
         System.out.println("ERROR 507: Cell is not editable");
   }
   
   public int getValueIn(int row, int coloumn)//done
   {
      if(0<row && row<10 && 0<coloumn && coloumn<10)
      {
         return values[row-1][coloumn-1];
      }
      else
         return 323;
   }
   
   public boolean [] getAllowedValues(int row, int coloumn)//almost done
   {
      boolean [] possible = new boolean [9];
      trueCount = 0;
      for(int i=0;i<9;i++)
      {
         possible[i] = true;
         trueCount++;
      }
      
      //row
      for(int c=0;c<9;c++)//done
      {
         if(values[row][c]>0 && c!=coloumn)
         {
            if(possible[values[row][c]-1])
            {
               possible[values[row][c]-1] = false;
               trueCount--;
            }
         }
      }
      
      //coloumn
      for(int r=0;r<9;r++)//done
      {
         if(values[r][coloumn]>0 && r!=row)
         {
            if(possible[values[r][coloumn]-1])
            {
               possible[values[r][coloumn]-1] = false;
               trueCount--;
            }
         }
      }
      
      //box
      if(row>=0 && row<=2)//Needs a better plan
      {
         if(coloumn>=0 && coloumn<=2)
         {
            for(int r=0;r<3;r++)//done
            {
               for(int c=0;c<3;c++)//done
               {
                  if(r!=row && c!=coloumn)
                  {
                     if(possible[values[row][c]-1])
                     {
                        possible[values[row][c]-1] = false;
                        trueCount--;
                     }
                  }
               }
            }
         }
      }
       
      
      return possible;
   }
   
   public boolean checkPuzzle()//done but untested
   {
      boolean [][] correct = new boolean [9][9];
      for(int r=0;r<9;r++)
      {
         for(int c=0;c<9;c++)
         {
            getAllowedValues(r,c);
            
            if(trueCount == 1)
            {
               correct[r][c] = true;
            }
               
         }
      }
      boolean allCorrect = true;
      for(int r=0;r<9;r++)
      {
         for(int c=0;c<9;c++)
         {
            if(!correct[r][c])
            {
               allCorrect = false;
            }
               
         }
      }
      return allCorrect;
   }
   
   public boolean isFull()//done
   {
      full = true;
      for(int r=0;r<9;r++)
      {
         for(int c=0;c<9;c++)
         {
            if(values[r][c] != 0)
               full = false;
         }
      }
      return full;
   }
   
   public void reset()//Unsure why, but doesnt work
   {
      for(int r=0;r<9;r++)
      {
         for(int c=0;c<9;c++)
         {
            if(editable[r][c])
               values[r][c] = 0;
         }
      }
   }
   
   public String toString()//done
   {
      String visual = "";
      for(int r=0;r<9;r++)
      {
         for(int c=0;c<9;c++)
         {
            if(values[r][c] != 0)
               visual += " " + values[r][c];
            else
               visual += " _";
            
            if(c==2 || c==5)
               visual += " |";
            if(c==8)
               visual += " \n";
         }
         if(r==2 || r==5)
            visual += "-------+-------+-------\n";
      }  
      return visual;
   }
}