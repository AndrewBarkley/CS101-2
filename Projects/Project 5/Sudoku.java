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
   
   public String getAllowedValues(int row, int coloumn)//done
   {
      row--;
      coloumn--;
      
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
      int box = getBox(row,coloumn);
      int rowI;
      int coloumnI;
      switch(box)
      {
         case 1:
            rowI=0;
            coloumnI=0; 
            break;
         case 2:
            rowI=0;
            coloumnI=3; 
            break;
         case 3:
            rowI=0;
            coloumnI=6; 
            break;
         case 4:
            rowI=3;
            coloumnI=0; 
            break;
         case 5:
            rowI=3;
            coloumnI=3;
            break;
         case 6:
            rowI=3;
            coloumnI=6;
            break;
         case 7:
            rowI=6;
            coloumnI=0;
            break;
         case 8:
            rowI=6;
            coloumnI=3;
            break;
         default:
            rowI=6;
            coloumnI=6;
            break;
      }
      
      for(int r=rowI;r<(rowI+3);r++)//done
      {
         for(int c=coloumnI;c<(coloumnI+3);c++)//done
         {
            if(values[r][c]!=0)
            {
               if(r!=row && c!=coloumn)
               {
                  if(possible[values[r][c]-1])
                  {
                     possible[values[r][c]-1] = false;
                     trueCount--;
                  }
               }
            }
         }
      }
       
      String output = "";
      for(int i=1;i<=9;i++)
      {
         output += (i) + "." + possible[i-1] + ", ";
      }
       
      return output;
   }
   
   public boolean checkPuzzle()//done
   {
      //if(isFull())
      //{
         boolean allCorrect = true;
         for(int r=1;r<=9;r++)
         {
            for(int c=1;c<=9;c++)
            {
               getAllowedValues(r,c);
            
               if(trueCount != 1)
               {
                  allCorrect = false;
               }
               
            }
         }
         return allCorrect;
      //}
      //return false;
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

   public int getBox(int row, int coloumn)
   {
      int box = 0;
      if(row>=0 && row<=2)
      {
         if(coloumn>=0 && coloumn<=2)
         {
            box = 1;
         }
         if(coloumn>=3 && coloumn<=5)
         {
            box = 2;
         }
         if(coloumn>=6 && coloumn<=8)
         {
            box = 3;
         }
      }
      if(row>=3 && row<=5)
      {
         if(coloumn>=0 && coloumn<=2)
         {
            box = 4;
         }
         if(coloumn>=3 && coloumn<=5)
         {
            box = 5;
         }
         if(coloumn>=6 && coloumn<=8)
         {
            box = 6;
         }
      }
      if(row>=6 && row<=8)
      {
         if(coloumn>=0 && coloumn<=2)
         {
            box = 6;
         }
         if(coloumn>=3 && coloumn<=5)
         {
            box = 7;
         }
         if(coloumn>=6 && coloumn<=8)
         {
            box = 8;
         }
      }
      return box;
   }
}