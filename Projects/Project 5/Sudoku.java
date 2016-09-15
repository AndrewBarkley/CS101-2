//Zachary Mosley

import java.util.*;
import java.io.*;

   /*
                     Class Algorithm
   -----------------------------------------------------------------------
   int [][] values = new int [9][9]
   boolean [][] editable = new boolean [9][9]
   boolean full
   int trueCount
   -----------------------------------------------------------------------

                     Class Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   int [][] values               array to keep track of Sudoku values
   boolean [][] editable         array to keep track of which values are editable
   boolean full                  keeps track if the puzzle is full
   int trueCount                 keeps track of th number of possible values for one cell

   */

public class Sudoku
{
   private int [][] values = new int [9][9];
   private boolean [][] editable = new boolean [9][9];
   private boolean full;
   private int trueCount;
   
   /*
                     Sudoku constructor Algorithm
   -----------------------------------------------------------------------
   for(int r=0;r<9;r++)
         for(int c=0;c<9;c++)
            editable[r][c] <- true
   -----------------------------------------------------------------------

                     Sudoku constructor Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   boolean [][] editable         array to keep track of which values are editable

   */
   public Sudoku()
   {
      for(int r=0;r<9;r++)
      {
         for(int c=0;c<9;c++)
         {
            editable[r][c] = true;
         }
      }
   }
   
   /*
                     addInitial Algorithm
   -----------------------------------------------------------------------
   if(0<row<10 && 0<coloumn<10 && 0<value<10)
      values[row-1][coloumn-1] <- value
      editable[row-1][coloumn-1] <- false
   else
      print <- ERROR message
   -----------------------------------------------------------------------

                     addInitial Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   int row                       determines which row to changes
   int coloumn                   determines what coloumn to change
   int value                     determines what to change the cell to
   values[][]                    array to keep track of Sudoku values
   editable[][]                  array to keep track of which values are editable

   */
   public void addInitial(int row, int coloumn, int value)
   {
      if(0<row && row<10 && 0<coloumn && coloumn<10 && 0<value && value<10)
      {
         values[row-1][coloumn-1] = value;
         editable[row-1][coloumn-1] = false;
      }
      else
         System.out.println("ERROR 323: One or more value(s) aren't within bounds");
   }
   
   /*
                     addGuess Algorithm
   -----------------------------------------------------------------------
   if(editable[row-1][coloumn-1])
      if(0<row<10 && 0<coloumn<10 && 0<value<10)
         values[row-1][coloumn-1] <- value
      else
         print <- ERROR message
   else
      print <- ERROR message
   -----------------------------------------------------------------------

                     addGuess Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   int row                       determines which row to changes
   int coloumn                   determines what coloumn to change
   int value                     determines what to change the cell to
   values[][]                    array to keep track of Sudoku values
   editable[][]                  array to keep track of which values are editable

   */
   public void addGuess(int row, int coloumn, int value)
   {
      boolean [] possible = getAllowedValues(row,coloumn);
      if(editable[row-1][coloumn-1])
      {
         if(0<row && row<10 && 0<coloumn && coloumn<10 && 0<value && value<10)
         {
            if(possible[value-1])
               values[row-1][coloumn-1] = value;
            else
               System.out.println("ERROR 707: New value conflicts with and another cell");
         }
         else
            System.out.println("ERROR 323: One or more value(s) aren't within bounds");
      }
      else
         System.out.println("ERROR 507: Cell is not editable");
   }

   public int getValueIn(int row, int coloumn)
   {
      if(0<row && row<10 && 0<coloumn && coloumn<10)
      {
         return values[row-1][coloumn-1];
      }
      else
         return 323;
   }
   
   /*
                     getAllowedValues Algorithm
   -----------------------------------------------------------------------
      row--
      coloumn--
      boolean [] possible <- new boolean [9]
      trueCount <- 0
      for(int i=0;i<9;i++)
         possible[i] <- true
         trueCount++
      
      //row
      for(int c <- 0;c<9;c++)
         if(values[row][c]>0 && c!=coloumn)
            if(possible[values[row][c]-1])
               possible[values[row][c]-1] <- false
               trueCount--
      
      //coloumn
      for(int r <- 0;r<9;r++)
         if(values[r][coloumn]>0 && r!=row)
            if(possible[values[r][coloumn]-1])
               possible[values[r][coloumn]-1] <- false
               trueCount--
               
      //box
      int box <- getBox(row,coloumn)
      int rowI
      int coloumnI
      switch(box)
         case 1:
            rowI <- 0
            coloumnI <- 0 
            break
         case 2:
            rowI <- 0
            coloumnI <- 3 
            break
         case 3:
            rowI <- 0
            coloumnI <- 6 
            break
         case 4:
            rowI <- 3
            coloumnI <- 0 
            break
         case 5:
            rowI <- 3
            coloumnI <- 3
            break
         case 6:
            rowI <- 3
            coloumnI <- 6
            break
         case 7:
            rowI <- 6
            coloumnI <- 0
            break
         case 8:
            rowI <- 6
            coloumnI <- 3
            break
         default:
            rowI <- 6
            coloumnI <- 6
            break
      
      for(int r <- rowI;r<(rowI+3);r++)
         for(int c <- coloumnI;c<(coloumnI+3);c++)
            if(values[r][c]!=0)
               if(r!=row && c!=coloumn)
                  if(possible[values[r][c]-1])
                     possible[values[r][c]-1] <- false
                     trueCount--
       
      return <- possible
   -----------------------------------------------------------------------

                     getAllowedValues Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   int row                       determines the cell's row
   int coloumn                   determines the cell's coloumn
   int rowI                      the upper row of the cell's box
   int coloumnI                  the left most coloumn of the cell's box
   int trueCount                 counts the number of possible values for a cell
   values[][]                    array to keep track of Sudoku values
   possible[][]                  array to keep track of the cell's possible values
   editable[][]                  array to keep track of which values are editable
   String output                 String verion of possible[][]

   */
   public boolean [] getAllowedValues(int row, int coloumn)
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
       
      return possible;
   }
   
   /*
                     checkCorrect Algorithm
   -----------------------------------------------------------------------
   if(isFull())
      boolean allCorrect = true
      for(int r <- 1;r<=9;r++)
         for(int c <- 1;c<=9;c++)
            getAllowedValues(r,c)
            if(trueCount != 1)
               allCorrect <- false
      return <- allCorrect
   return <- false
   -----------------------------------------------------------------------

                     checkCorrect Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   boolean allCorrect            True if puzzle is correct
   int trueCount                 counts the number of possible values for a cell

   */
   public boolean checkCorrect()
   {
      if(isFull())
      {
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
      }
      return false;
   }
   
   /*
                     isFull Algorithm
   -----------------------------------------------------------------------
      full <- true;
      for(int r <- 0;r<9;r++)
         for(int c <- 0;c<9;c++)
            if(values[r][c] != 0)
               full <- false
      return <- full
   -----------------------------------------------------------------------

                     isFull Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   int full                      keeps tracks if the puzzle is full
   values[][]                    array to keep track of Sudoku values

   */
   public boolean isFull()
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
   
   /*
                     reset Algorithm
   -----------------------------------------------------------------------
      for(int r <- 0;r<9;r++)
         for(int c <- 0;c<9;c++)
            if(editable[r][c])
               values[r][c] <- 0
   -----------------------------------------------------------------------

                     reset Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   values[][]                    array to keep track of Sudoku values
   editable[][]                  array to keep track of which values are editable

   */
   public void reset()
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
   
   /*
                     toString Algorithm
   -----------------------------------------------------------------------
      String visual <- ""
      for(int r <- 0;r<9;r++)
         for(int c <- 0;c<9;c++)
            if(values[r][c] != 0)
               visual += " " + values[r][c]
            else
               visual += " _"
            if(c==2 or c==5)
               visual += " |"
            if(c==8)
               visual += " \n"
         if(r==2 or r==5)
            visual += "-------+-------+-------\n"
      return <- visual
   -----------------------------------------------------------------------

                     toString Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   values[][]                    array to keep track of Sudoku values
   String visual                 turns the values[][] into a String to print

   */
   public String toString()
   {
      String visual = "";
      for(int r=0;r<9;r++)
      {
         for(int c=0;c<9;c++)
         {
            if(values[r][c] != 0)
               visual += " " + values[r][c];
            else
               visual += "  ";
            
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

   /*
                     toString Algorithm
   -----------------------------------------------------------------------
      int box <- 0
      if(row>=0 && row<=2)
         if(coloumn>=0 && coloumn<=2)
            box <- 1
         if(coloumn>=3 && coloumn<=5)
            box <- 2
         if(coloumn>=6 && coloumn<=8)
            box <- 3
      if(row>=3 && row<=5)
         if(coloumn>=0 && coloumn<=2)
            box <- 4
         if(coloumn>=3 && coloumn<=5)
            box <- 5
         if(coloumn>=6 && coloumn<=8)
            box <- 6
      if(row>=6 && row<=8)
         if(coloumn>=0 && coloumn<=2)
            box <- 6
         if(coloumn>=3 && coloumn<=5)
            box <- 7
         if(coloumn>=6 && coloumn<=8)
            box <- 8
      return <- box
   -----------------------------------------------------------------------

                     toString Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   int row                       determines which row to changes
   int coloumn                   determines what coloumn to change
   int box                       value to keep track of which box the cell is in

   */
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
   
   /*
                     checkPuzzle Algorithm
   -----------------------------------------------------------------------
      boolean allCorrect = true
      for(int r <- 0;r<9;r++)
         for(int c <- 0;c<9;c++)
            boolean [] possible = getAllowedValues(r+1,c+1)
            if(values[r][c]!=0)
               if(possible[values[r][c]-1] == false)
                  allCorrect <- false
      return <- allCorrect
   -----------------------------------------------------------------------

                     checkPuzzle Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   boolean allCorrect            True if puzzle is accurate
   possible[][]                  array to keep track of the cell's possible values

   */
   public boolean checkPuzzle()
   {
      boolean allCorrect = true;
      for(int r=0;r<9;r++)
      {
         for(int c=0;c<9;c++)
         {
            boolean [] possible = getAllowedValues(r+1,c+1);
            if(values[r][c]!=0)
            {
               if(!possible[values[r][c]-1])
               {
                  allCorrect = false;
               }
            }
         }
      }
      return allCorrect;
   }
}
