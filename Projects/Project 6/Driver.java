//Zachary Mosley
//CS101-02
//Project 6

import java.util.*;
import java.io.*;

public class Driver
{
   /*
                     main Algorithm
   -----------------------------------------------------------------------
      String inputFileName <- args[0]
      String outputFileName <- args[1]
      File inFile <- new File(inputFileName)
      File outFile <- new File(outputFileName)
      Scanner input <- new Scanner(inFile)
      PrintStream out <- new PrintStream(outFile)
      String echo
      while(input.hasNext())
         echo += input.nextLine() + "\n"
      Scanner in <- new Scanner(echo).useDelimiter("#|/|\n")
      boolean another <- true
      int length <- 0
      Person[] people <- new Person[100]
      for(int i <- 0; i<100; i++)
         if(another && in.next().contains("u"))
            people[i] <- new UndergraduateStudent(in)
            another <- false
         if(another && in.next().contains("g"))
            people[i] <- new GraduateStudent(in)
            another <- false
         if(another && in.next().contains("s"))
            people[i] <- new Staff(in)
            another <- false
         if(another && in.next().contains("f"))
            people[i] <- new Faculty(in)
            another <- false
         if(in.hasNext())
            another <- true
            length++
            
      //PRINTING
      out.println("Zachary Mosley\n" +
                  "CS101-02\n" +
                  "Project 6\n")
      out.println("The following is an echo of the input\n")
      out.println(echo + "\n")
      out.println("The entire database organised by name\n")
      int bottom <- length
      boolean sorted <- false
      while(!sorted)
         sorted <- true;
         for(int pass <- 0; pass < bottom; pass++)
            for(int i <- 0 i < length i++)
               if(people[i].getName().compareTo(people[i + 1].getName()) == 1)
                  Person temp <- people[i]
                  people[i] <- people[i+1]
                  people[i+1] <- temp
                  sorted <- false
            bottom--
      for(int i=0; i<=length; i++)
         if(people[i] != null)
            out.println(people[i])
            out.println()
      out.println("\nThe staff organised by hire date(oldest first)\n")
      bottom <- length
      sorted <- false
      while(!sorted)
         sorted <- true;
         for(int pass <- 0; pass < bottom; pass++)
            for(int i <- 0; i < length; i++)
               if(people[i].getDate().compareTo(people[i + 1].getDate()) == -1)
                  Person temp <- people[i]
                  people[i] <- people[i+1]
                  people[i+1] <- temp
                  sorted <- false
            bottom--
      for(int i=0; i<=length; i++)
         if(people[i] != null)
            if(people[i].getType() == 3)
               out.println(people[i])
               out.println()
      out.println("\nThe employees organised by salary(greatest first)\n")
      bottom <- length
      sorted <- false
      while(!sorted)//watch for errors
         sorted <- true;
         for(int pass <- 0; pass < bottom; pass++)
            for(int i <- 0; i < length; i++)
               if(people[i].getSalary() >= people[i + 1].getSalary())
                  Person temp <- people[i]
                  people[i] <- people[i+1]
                  people[i+1] <- temp
                  sorted <- false
            bottom--
      for(int i=0; i<=length; i++)
         if(people[i] != null)
            if(people[i].getType() == 3 || people[i].getType() == 4)
               out.println(people[i])
               out.println()
      out.println("\nThe students organised by address\n")
      //sort by name
      bottom <- length
      sorted <- false
      while(!sorted)
         sorted <- true;
         for(int pass <- 0; pass < bottom; pass++)
            for(int i <- 0; i < length; i++)
               if(people[i].getAddress().compareTo(people[i + 1].getAddress()) == 1)
                  Person temp <- people[i]
                  people[i] <- people[i+1]
                  people[i+1] <- temp
                  sorted <- false
            bottom--
      for(int i=0; i<=length; i++)
         if(people[i] != null)
            out.println(people[i])
            out.println()
   -----------------------------------------------------------------------

                     main Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   String inputFileName          to get the input args[] name
   String outputFileName         to get the output args[] name
   File inFile                   to open the file labeled by inputfileName
   File outFile                  to open the file labeled by outputfileName
   Scanner input                 reads the inFile
   PrintStream out               prints to the outFile
   String echo                   makes a copy of inFile
   boolean another               true if there is another line in echo
   int length                    length fo the array
   Person[] people               array to hold 100 Persons
   int bottom                    an editable copy of length
   boolean sorted                true if array is sorted
   Person temp                   temp Person object used to sort an array
   */
   public static void main(String [] args) throws Exception
   {
      
      String inputFileName = args[0];
      String outputFileName = args[1];
      File inFile = new File(inputFileName);
      File outFile = new File(outputFileName);
      Scanner input = new Scanner(inFile);
      PrintStream out = new PrintStream(outFile);
      String echo = "";
      while(input.hasNext())
         echo += input.nextLine() + "\n";
      Scanner in = new Scanner(echo).useDelimiter("#|/|\n");
      
      boolean another = true;
      int length = 0;
      Person[] people = new Person[100];
      
      String next = in.next();
      for(int i=0; i<100; i++)
      {
         
         if(another && next.contains("u"))
         {
            people[i] = new UndergraduateStudent(in);
            another = false;
         }
         if(another && next.contains("g"))
         {
            people[i] = new GraduateStudent(in);
            another = false;
         }
         if(another && next.contains("s"))
         {
            people[i] = new Staff(in);
            another = false;
         }
         if(another && next.contains("f"))
         {
            people[i] = new Faculty(in);
            another = false;
         }
         if(in.hasNext())
         {
            another = true;
            length++;
            next = in.next();
         }
      }
      
      //PRINTING
      out.println("Zachary Mosley\n" +
                  "CS101-02\n" +
                  "Project 6\n");
      out.println("The following is an echo of the input\n");
      out.println(echo + "\n");
      
      
      out.println("The entire database organised by name\n");
      
      //sort by name
      int bottom = length;
      boolean sorted = false;
      while(!sorted)
      {
         sorted = true;
         for(int pass = 0; pass < bottom; pass++)
         {
            for(int i = 0; i < length-pass; i++)
            {
               if(people[i].getName().compareToIgnoreCase(people[i + 1].getName()) >= 1)
               {
                  Person temp = people[i];
                  people[i] = people[i+1];
                  people[i+1] = temp;
                  sorted = false;
               }
            }
            bottom--;
         }
      }
      
      for(int i=0; i<=length; i++)
      {
         if(people[i] != null)
         {
            out.println(people[i]);
            out.println();
         }
      }
      
      out.println("\nThe staff organised by hire date(oldest first)\n");
      
      //sort by date          dates are doubled
      bottom = length;
      sorted = false;
      while(!sorted)
      {
         sorted = true;
         for(int pass = 0; pass < bottom; pass++)
         {
            for(int i = 0; i < length-pass; i++)
            {
               if(people[i].getDate().compareTo(people[i + 1].getDate()) <= -1)
               {
                  Person temp = people[i];
                  people[i] = people[i+1];
                  people[i+1] = temp;
                  sorted = false;
               }
            }
            bottom--;
         }
      }
      
      for(int i=0; i<=length; i++)
      {
         if(people[i] != null)
         {
            if(people[i].getType() == 3)
            {
               out.println(people[i]);
               out.println();
            }
         }
      }
      
      out.println("\nThe employees organised by salary(greatest first)\n");
      
      //sort by salary         dates are doubled
      bottom = length;
      sorted = false;
      while(!sorted)
      {
         sorted = true;
         for(int pass = 0; pass < bottom; pass++)
         {
            for(int i = 0; i < length-pass; i++)
            {
               if(people[i].getSalary() <= people[i + 1].getSalary())
               {
                  Person temp = people[i];
                  people[i] = people[i+1];
                  people[i+1] = temp;
                  sorted = false;
               }
            }
            bottom--;
         }
      }
   
      for(int i=0; i<=length; i++)
      {
         if(people[i] != null)
         {
            if(people[i].getType() == 3 || people[i].getType() == 4)
            {
               out.println(people[i]);
               out.println();
            }
         }
      }
   
      out.println("\nThe students organised by address\n");
      
      //sort by address dates doubled
      bottom = length;
      sorted = false;
      while(!sorted)
      {
         sorted = true;
         for(int pass = 0; pass < bottom; pass++)
         {
            for(int i = 0; i < length-pass; i++)
            {
               if(people[i].getAddress().compareTo(people[i + 1].getAddress()) >= 1)
               {
                  Person temp = people[i];
                  people[i] = people[i+1];
                  people[i+1] = temp;
                  sorted = false;
               }
            }
            bottom--;
         }
      }
      
      for(int i=0; i<=length; i++)
      {
         if(people[i] != null)
         {
            if(people[i].getType() == 1 || people[i].getType() == 2)
            {
               out.println(people[i]);
               out.println();
            }
         }
      }
     
   }
}