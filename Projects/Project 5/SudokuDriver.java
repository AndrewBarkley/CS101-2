//Zachary Mosley

import java.util.*;

public class SudokuDriver
{
   public static void main(String [] args)
   {
      Sudoku s = new Sudoku();
      System.out.println(s);
      
      initialize(s);
      play(s);
   }
      
      
   public static void initialize(Sudoku s)
   {
      boolean setup = true;
      while(setup)
      {
         System.out.println("Type 'play' to start the game,\n" +
                            "type a set of three numbers to initialize a cell\n" +
                            "Ex. Row Coloumn Value) ");
                                         
         Scanner in = new Scanner(System.in);
         int row = 0;
         int coloumn = 0;
         int value = 0;
         
         
         if(in.hasNextInt())
         {
            row = in.nextInt();
            coloumn = in.nextInt();
            value = in.nextInt();
            
            s.addInitial(row,coloumn,value);
            System.out.println(s);
         }
         
         String input = in.nextLine();
            
         if(input.toLowerCase().contains("play"))
            setup = false;
         else if (input.equals(""))
         {
               //do nothing
         }
         else
            System.out.println("ERROR 503: Unknown command");
            
        System.out.println();
      }
   }   
      
   public static void play(Sudoku s)
   {  
      boolean run = true;
      while(run)
      {
         System.out.println("Type the number to doing the corresponding task:\n"+
                            "1      addGuess\n"+
                            "2      getValueIn\n"+
                            "3      getAllowedValues aka cheat\n"+
                            "4      isFull\n"+
                            "5      checkPuzzle\n"+
                            "6      reset\n"+
                            "8008   Quit");
                            
         Scanner in = new Scanner(System.in);
         int input = 0;
         if(in.hasNextInt())
            input = in.nextInt();
         int row = 0;
         int coloumn = 0;
         int value = 0;
         
         switch(input)
         {
            case 1:
               System.out.println("type a set of three numbers to make your guess\n" +
                                  "Ex. Row Coloumn Value ");
               row = in.nextInt();
               coloumn = in.nextInt();
               value = in.nextInt();
            
               s.addGuess(row,coloumn,value);
               break;
            case 2:
               System.out.println("type a set of two numbers to choose a cell\n" +
                                  "Ex. Row Coloumn ");
               row = in.nextInt();
               coloumn = in.nextInt();
            
               if(s.getValueIn(row,coloumn) == 323)
                  System.out.println("ERROR 323: One or more value(s) aren't within bounds");
               else
                  System.out.println(s.getValueIn(row,coloumn));
               break;
            case 3:
               System.out.println("type a set of two numbers to choose a cell you cheater\n" +
                                  "Ex. Row Coloumn ");
               row = in.nextInt();
               coloumn = in.nextInt();
            
               System.out.println(s.getAllowedValues(row,coloumn));
               break;
            case 4:
               System.out.println(s.isFull());
               break;
            case 5:
               System.out.println(s.checkPuzzle());
               System.out.println("Hooray :) You've won!!! Terminating game...");
               run = false;
               break;
            case 6:
               System.out.println("Puzzle is reset");
               break;
            case 8008:
               System.out.println("Quitters never win");
               run = false;
               break;
            default:
               System.out.println("That's not on the list you boob");
               break;
         }
         System.out.println();
         System.out.println(s);
      }
   }
}