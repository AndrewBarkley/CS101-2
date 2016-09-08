//Project 2
//Zachary Mosley

/* 
                  Class Algorithm
-----------------------------------------------------------------------
   declare boolean var1IsNum <- true
   declare boolean var2IsNum <- true
   declare string operator
   declare int operand1
   declare int operand2
   declare int tokens <- 0
   declare int tokenNum <- 0      
-----------------------------------------------------------------------

                  Class Data Table
Variable or Constant          Purpose
____________________          _________________________________________
args                          parameter of main

var1isNum                     Boolean that will equal true if the first token is a number
var2isNum                     Boolean that will equal true if the first token is a number
operator                      String that will equal the token that is the operator
operand1                      Int that will equal the token that is the first operand
operand2                      Int that will equal the token that is the first operand
tokens                        Int that will equal the number of tokens
tokenNum                      Int that will equal the number of tokens that are numbers
*/

import java.util.*;

public class Calculator2
{
   static Boolean var1IsNum = true;
   static Boolean var2IsNum = true;
   static String operator;
   static int operand1;
   static int operand2;
   static int tokens = 0;
   static int tokenNum = 0;
   
   /* 
                  main Algorithm
   -----------------------------------------------------------------------
   print "Please input your variables >"
   Scanner in <-- System.in
   String inputLine <-- in
   Scanner one <-- inputLine
   Scanner two <-- inputLine
   Scanner three <-- inputLine
   Scanner four <-- inputLine
   Scanner five <-- inputLine
   tokens <-- tokenCount(one)
   tokenNum <-- numCount(five)
   
   if tokens equals 3 and tokenNum equals 2...
      operator <-- findingOperator(two)
      operand1 <-- findingOperand1(three)
      operand2 <-- findingOperand2(four)
      int result
      
      switch(operator)
         case +
            result <-- operand1 + operand2
            print "operand1 + operand2 = result"
         case -
            result <-- operand1 - operand2
            print "operand1 - operand2 = result"
         case *
            result <-- operand1 * operand2
            print "operand1 * operand2 = result"
         case /
            if operand2 != 0...
               result <-- operand1 / operand2
               print "operand1 / operand2 = result"
            else...
               print "you cant divide by zero"
         case %
            if operand2 != 0...
               result <-- operand1 % operand2
               print "operand1 % operand2 = result"
            else...
               print "you cant divide by zero"
         case ^
            result <-- operand1 ^ operand2
            print "operand1^operand2 = result"
         default
            print "your operator is invalid
   else...
      print "Your inputs are invalid"
      
      
   -----------------------------------------------------------------------
   
                  main Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   args                          parameter of main

   in                            Scanner that will read System.in
   inputLine                     String that will equal Scanner in
   one                           Scanner that will read inputLine
   two                           Scanner that will read inputLine
   three                         Scanner that will read inputLine
   four                          Scanner that will read inputLine
   five                          Scanner that will read inputLine
   tokens                        Int that equals the number of tokens
   tokenNum                      Int that equals the number of tokens that are numbers
   result                        Int that equals the answer of the equation 
                                 completed by operator, operand1, & operand2
   
   */
   public static void main(String [] args)
   {
      System.out.print("Please enter your three variables >");
      
      Scanner in = new Scanner(System.in);
      String inputLine = in.nextLine();
      Scanner one = new Scanner(inputLine);
      Scanner two = new Scanner(inputLine);
      Scanner three = new Scanner(inputLine);
      Scanner four = new Scanner(inputLine);
      Scanner five = new Scanner(inputLine);
      tokens = tokenCount(one);
      tokenNum = numCount(five);
      
      if (tokens == 3 && tokenNum == 2)
      {
         operator = findingOperator(two);
         operand1 = findingOperand1(three);
         operand2 = findingOperand2(four);
         int result;
      
         switch(operator)
         {
            case "+":
               result = operand1 + operand2;
               System.out.print(operand1 + " + " + operand2 + " = " + result);
               break;
            case "-":
               result = operand1 - operand2;
               System.out.print(operand1 + " - " + operand2 + " = " + result);
               break;
            case "*":
               result = operand1 * operand2;
               System.out.print(operand1 + " * " + operand2 + " = " + result);
               break;
            case "/":
               if (operand2 == 0)
               {
                  System.out.print("You can't divide by 0");
               }
               else
               {
                  result = operand1 / operand2;
                  System.out.print(operand1 + " / " + operand2 + " = " + result);
               }
               break;
            case "%":
               if (operand2 == 0)
               {
                  System.out.print("You can't divide by 0, even if it is to find the modulus.");
               }
               else
               {
                  result = operand1 % operand2;
                  System.out.print(operand1 + " % " + operand2 + " = " + result);
               }
               break;
            case "^":
               result = (int)(Math.pow(operand1, operand2));
               System.out.print(operand1 + "^" + operand2 + " = " + result);
               break;
            default:
               System.out.print("Operator does not compute");
         
         
         }  
      }
      else
      {
         System.out.print("Wrong number of variables entered");
      }
   }//main
 
    /* 
                  tokenCount Algorithm
   -----------------------------------------------------------------------
   if one.hasNext equals true
      tokens++
   if one.hasNext equals true
      tokens++ 
   if one.hasNext equals true
      tokens++ 
   if one.hasNext equals true
      tokens++ 
   return tokens
   -----------------------------------------------------------------------
   
                  tokenCount Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   args                          parameter of main
   
   one                           Scanner that will read inputLine       
   tokens                        Int that equals the number of tokens
   */
   public static int tokenCount(Scanner one)
   {
      if (one.hasNext() == true)
      {
         one.next();
         tokens++;
      }
      if (one.hasNext() == true)
      {
         one.next();
         tokens++;
      }
      if (one.hasNext() == true)
      {
         one.next();
         tokens++;
      }
      if (one.hasNext() == true)
      {
         one.next();
         tokens++;
      }
      return tokens;
   }//tokenCount
   
   /* 
                   numCount Algorithm
   -----------------------------------------------------------------------
   if five.hasNextInt equals true
      tokenNum++
   five.next
   if five.hasNextInt equals true
      tokenNum++
   five.next
   if five.hasNextInt equals true
      tokenNum++
   return tokenNum
   -----------------------------------------------------------------------
        
                   numCount Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   args                          parameter of main
   
   five                          Scanner that will read inputLine       
   tokenNum                      Int that equals the number of tokens that are numbers
   */
   public static int numCount(Scanner five)
   {
      if (five.hasNextInt() == true)
      {
         tokenNum++;
      }
      five.next();
      if (five.hasNextInt() == true)
      {
         tokenNum++;
      }
      five.next();
      if (five.hasNextInt() == true)
      {
         tokenNum++;
      }
      return tokenNum;
   }//numCount
   
   /* 
                  findingOperator Algorithm
   -----------------------------------------------------------------------
   String test <-- two.next
   Switch(test)
      case "all of the possible operator symbols"
         var1IsNum <-- false
         return test
      default
         test <-- two.next
   Switch(test)
      case "all of the possible operator symbols"
         var2IsNum <-- false
         return test
      default
         test <-- two.next
         return test
   -----------------------------------------------------------------------
   
                  findingOperator Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   args                          parameter of main
   
   two                           Scanner that will read inputLine       
   test                          String that equals each token indivdually
   var1IsNum                     Boolean that equals true if the first token is a number
   var2IsNum                     Boolean that equals true if the second token is a number
   */
   public static String findingOperator(Scanner two)
   {
      String test = two.next();
      switch(test)
      {
         case "+":
         case "-":
         case "*":
         case "/":
         case "%":
         case "^":
            var1IsNum = false;
            return test;
         default:
            test = two.next();
      }
      switch(test)
      {
         case "+":
         case "-":
         case "*":
         case "/":
         case "%":
         case "^":
            var2IsNum = false;   
            return test;
         default:
            test = two.next();
            return test;
      }
   
   }//findingOperator
   
   /* 
                  findingOperand1 Algorithm
   -----------------------------------------------------------------------
   If var1IsNum equals true then...
      operand1 <-- three.nextInt()
      return operand1
   Else...
      three skips the first token
      operand1 <-- three.nextInt()
      return operand1
   -----------------------------------------------------------------------
   
                  findingOperand1 Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   args                          parameter of main
   
   three                         Scanner that will read inputLine       
   var1IsNum                     Boolean that equals true if the first token is a number
   operand1                      Int that equals the first token that is an Int
   var2IsNum                     Boolean that equals true if the second token is a number
   */
   public static int findingOperand1(Scanner three)
   {
      if (var1IsNum == true)
      {
         operand1 = three.nextInt();
         return operand1;
      }
      else
      {
         var2IsNum = false;
         three.next();
         operand1 = three.nextInt();
         return operand1;
      }
   }//findingOperand1
   
   /* 
                  findingOperand2 Algorithm
   -----------------------------------------------------------------------
   Scanner four skips the first token
   If var2IsNum equals true then...
      operand2 <-- four.nextInt
      return operand2
   Else...
      four skips the second token
      operand2 <-- four.nextInt
      return operand2     
   -----------------------------------------------------------------------
   
                  findingOperand2 Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   args                          parameter of main
   
   four                          Scanner that will read inputLine       
   var2IsNum                     Boolean that equals true if the 2nd token is an unused number
   operand2                      Int that equals the second token that is an Int
   */
   public static int findingOperand2(Scanner four)
   {
      four.next();
      if (var2IsNum == true)
      {
         operand2 = four.nextInt();
         return operand2;
      }
      else
      {
         four.next();
         operand2 = four.nextInt();
         return operand2;
      }
   }//findingOperand2
}//Calculator