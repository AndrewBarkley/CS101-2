//Zachary Mosley
//CS101
//Project 5

import java.util.*;

public class SudokuDriver
{
   /*
                     main Algorithm
   -----------------------------------------------------------------------
   Sudoku puzzle = new Sudoku()
   print <- puzzle
   initialize(puzzle)
   play(puzzle)
   -----------------------------------------------------------------------

                     main Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   Sudoku puzzle                 Creates the Sudoku object dubbed puzzle

   */
   public static void main(String [] args)
   {
      Sudoku puzzle = new Sudoku();
      System.out.println(puzzle);
      
      initialize(puzzle);
      play(puzzle);
   }
   /*
                     initialize Algorithm
   -----------------------------------------------------------------------
      boolean setup <- true
      while(setup)
         print <- instructions                         
         Scanner in <- keyboard
         int row <- 0
         int coloumn <- 0
         int value <- 0
         if(in.hasNextInt())
            row <- in.nextInt()
            coloumn <- in.nextInt()
            value <- in.nextInt()
            s.addInitial(row,coloumn,value)
            print <- s 
         String input <- in.nextLine()
         if(input.toLowerCase().contains("play"))
            setup <- false
         else if (input.equals(""))
               //empty, only here to prevent false error messages
         else
            print <- "ERROR 503: Unknown command"
            
         print <- "" //to skip a line
   -----------------------------------------------------------------------

                     initialize Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   boolean setup                 used in the while statement to keep initialize running
   Scanner in                    gets keyboard input
   int row                       determines which row to changes
   int coloumn                   determines what coloumn to change
   int value                     determines what to change the cell to
   String input                  converts in to a string to be tested

   */   
   public static void initialize(Sudoku puzzle)
   {
      boolean setup = true;
      while(setup)
      {
         System.out.println("Type 'play' to start the game,\n" +
                            "type a set of three numbers to initialize a cell\n" +
                            "Ex. Row Coloumn Value ");
                                         
         Scanner in = new Scanner(System.in);
         int row = 0;
         int coloumn = 0;
         int value = 0;
         
         
         if(in.hasNextInt())
         {
            row = in.nextInt();
            coloumn = in.nextInt();
            value = in.nextInt();
            
            puzzle.addInitial(row,coloumn,value);
            System.out.println(puzzle);
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
   /*
                     play Algorithm
   -----------------------------------------------------------------------
      boolean run <- true
      while(run)
         print <- instructions             
         Scanner in <- keyboard
         int input <- 0
         if(in.hasNextInt())
            input <- in.nextInt()
         int row <- 0
         int coloumn <- 0
         int value <- 0
         
         switch(input)
            case1:
               print <- puzzle
               break;
            case 2:
               print <- instructions
               row <- in.nextInt()
               coloumn <- in.nextInt()
               value <- in.nextInt()
               puzzle.addGuess(row,coloumn,value)
               break
            case 3:
               print <- instructions
               row <- in.nextInt()
               coloumn <- in.nextInt()
            
               if(puzzle.getValueIn(row,coloumn) <- 323)
                  print <- ERROR message
               else
                  print <- puzzle.getValueIn(row,coloumn))
               break
            case 4:
               print <- instructions
               row <- in.nextInt()
               coloumn <- in.nextInt()
               String output = "";
               for(int i <- 1;i<=9;i++)
                  output += (i) + "." + possible[i-1] + ", ";
               System.out.println(output);
               break
            case 5:
               print <- puzzle.isFull())
               break
            case 6:
               print <- "Sorry but you're not quite there"
               break
            case 7:
               puzzle.reset()
               print <- "Puzzle is reset"
               break
            case 8008:
               print <- "Quitters never win"
               run <- false
               break
            default:
               print <- ERROR message
               break
         }
         print <- empty line
         if(puzzle.checkPuzzle())
            print <- "Hooray :) You've won!!! Terminating game..."
            run <- false
            print <- puzzle
      
   -----------------------------------------------------------------------

                     play Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   boolean run                   used in the while statement to keep initialize running
   Scanner in                    gets keyboard input
   int input                     String for switch containg operators choice
   int row                       determines which row to changes
   int coloumn                   determines what coloumn to change
   int value                     determines what to change the cell to

   */       
   public static void play(Sudoku puzzle)
   {  
      boolean run = true;
      while(run)
      {
         System.out.println("Type the number to doing the corresponding task:\n"+
                            "1      printPuzzle\n"+
                            "2      addGuess\n"+
                            "3      getValueIn\n"+
                            "4      getAllowedValues aka cheat\n"+
                            "5      isFull\n"+
                            "6      checkPuzzle\n"+
                            "7      reset\n"+
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
               System.out.println(puzzle);
               break;
            case 2:
               System.out.println("type a set of three numbers to make your guess\n" +
                                  "Ex. Row Coloumn Value ");
               row = in.nextInt();
               coloumn = in.nextInt();
               value = in.nextInt();
            
               puzzle.addGuess(row,coloumn,value);
               break;
            case 3:
               System.out.println("type a set of two numbers to choose a cell\n" +
                                  "Ex. Row Coloumn ");
               row = in.nextInt();
               coloumn = in.nextInt();
            
               if(puzzle.getValueIn(row,coloumn) == 323)
                  System.out.println("ERROR 323: One or more value(s) " +
                                     "aren't within bounds");
               else
                  System.out.println(puzzle.getValueIn(row,coloumn));
               break;
            case 4:
               System.out.println("Type a set of two numbers to " +
                                  "choose a cell you cheater\n" +
                                  "Ex. Row Coloumn ");
               row = in.nextInt();
               coloumn = in.nextInt();
               boolean [] possible = puzzle.getAllowedValues(row,coloumn);
               
               String output = "";
               for(int i=1;i<=9;i++)
               {
                  output += (i) + "." + possible[i-1] + ", ";
               }
               System.out.println(output);
               break;
            case 5:
               System.out.println(puzzle.isFull());
               break;
            case 6:
               System.out.println("Sorry but you're not quite there");
               break;
            case 7:
               puzzle.reset();
               System.out.println("Puzzle is reset");
               break;
            case 8008:
               System.out.println("Quitters never win");
               run = false;
               break;
            default:
               System.out.println("ERROR 503: Unknown command");
               break;
         }
         System.out.println();
         if(puzzle.checkPuzzle())
         {
            System.out.println("Hooray :) You've won!!! Terminating game...");
            run = false;
            System.out.println(puzzle);
         }
      }
   }
}