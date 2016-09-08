//Zachary Mosley

import java.util.*;
import java.io.*;

public class Sudoku
{
   //class variables
   private int [][] values = new int [9][9];
   private boolean [][] editable = new boolean [9][9];
   private boolean full;
   
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
   
   public void addInitial(int row, int coloumn, int value)//kinda done
   {
      values[row][coloumn] = value;
      editable[row][coloumn] = false;
   }
   
   public void addGuess(int row, int coloumn, int value)//kinda done
   {
      if(editable[row][coloumn])
         values[row][coloumn] = value;
   }
   
   public int getValueIn(int row, int coloumn)//done
   {
      return values[row][coloumn];
   }
   
   public boolean getAllowedValues(int row, int coloumn)//edit
   {
      return true;
   }
   
   public boolean checkPuzzle()//edit
   {
      return true;
   }
   
   public boolean isFull()//done
   {
      full = false;
      for(int r=0;r<9;r++)
      {
         for(int c=0;c<9;c++)
         {
            if(values[r][c] != 0)
               full = true;
         }
      }
      return full;
   }
   
   public void reset()//done
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
   
   public String toString()//thank god it's kinda done
   {
      return " "+values[0][0]+" "+values[0][1]+" "+values[0][2]+" |"+//line 0
             " "+values[0][3]+" "+values[0][4]+" "+values[0][5]+" |"+
             " "+values[0][6]+" "+values[0][7]+" "+values[0][8]+" \n"+  
             " "+values[1][0]+" "+values[1][1]+" "+values[1][2]+" |"+//line 1
             " "+values[1][3]+" "+values[1][4]+" "+values[1][5]+" |"+
             " "+values[1][6]+" "+values[1][7]+" "+values[1][8]+" \n"+
             " "+values[2][0]+" "+values[2][1]+" "+values[2][2]+" |"+//line 2
             " "+values[2][3]+" "+values[2][4]+" "+values[2][5]+" |"+
             " "+values[2][6]+" "+values[2][7]+" "+values[2][8]+" \n"+ 
             "-------+-------+-------\n" + 
             " "+values[3][0]+" "+values[3][1]+" "+values[3][2]+" |"+//line 3
             " "+values[3][3]+" "+values[3][4]+" "+values[3][5]+" |"+
             " "+values[3][6]+" "+values[3][7]+" "+values[3][8]+" \n"+  
             " "+values[4][0]+" "+values[4][1]+" "+values[4][2]+" |"+//line 4
             " "+values[4][3]+" "+values[4][4]+" "+values[4][5]+" |"+
             " "+values[4][6]+" "+values[4][7]+" "+values[4][8]+" \n"+
             " "+values[5][0]+" "+values[5][1]+" "+values[5][2]+" |"+//line 5
             " "+values[5][3]+" "+values[5][4]+" "+values[5][5]+" |"+
             " "+values[5][6]+" "+values[5][7]+" "+values[5][8]+" \n"+
             "-------+-------+-------\n" +
             " "+values[6][0]+" "+values[6][1]+" "+values[6][2]+" |"+//line 6
             " "+values[6][3]+" "+values[6][4]+" "+values[6][5]+" |"+
             " "+values[6][6]+" "+values[6][7]+" "+values[6][8]+" \n"+  
             " "+values[7][0]+" "+values[7][1]+" "+values[7][2]+" |"+//line 7
             " "+values[7][3]+" "+values[7][4]+" "+values[7][5]+" |"+
             " "+values[7][6]+" "+values[7][7]+" "+values[7][8]+" \n"+
             " "+values[8][0]+" "+values[8][1]+" "+values[8][2]+" |"+//line 8
             " "+values[8][3]+" "+values[8][4]+" "+values[8][5]+" |"+
             " "+values[8][6]+" "+values[8][7]+" "+values[8][8]+" \n";
   }
}