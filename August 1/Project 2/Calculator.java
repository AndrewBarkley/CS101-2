//Project 2
//Zachary Mosley

import java.util.*;

public class Calculator
{
   static Scanner input = new Scanner(System.in);
   static String var = input.next();
   static Boolean varIsNum = true;
   static String var1 = input.next();
   static Boolean var1IsNum = true;
   static String var2 = input.next();
   static Boolean var2IsNum = true;
   static String operator;
   static int operand1;
   static int operand2;
   
   //Math Method
   public static void main(String [] args)
   {
      operator = findingOperator();
      operand1 = findingOperand1();
      operand2 = findingOperand2();
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
            result = operand1 / operand2;
            System.out.print(operand1 + " / " + operand2 + " = " + result);
            break;
         case "%":
            result = operand1 % operand2;
            System.out.print(operand1 + " % " + operand2 + " = " + result);
            break;
         case "^":
            result = (int)(Math.pow(operand1, operand2));
            System.out.print(operand1 + "^" + operand2 + " = " + result);
            break;
         default:
            System.out.print("Operator does not compute");
      
      
      }  
   }//main
      
 //Finding the Operator Method
   public static String findingOperator()
   {
      String test = var;
      switch(test)
      {
         case "+":
         case "-":
         case "*":
         case "/":
         case "%":
         case "^":
            varIsNum = false;
            return test;
         default:
            test = var1;
      }
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
            var2IsNum = false;
            test = var2;
            return test;
      }
   
   }//findingOperator
 //Finding Operand1 Method
   public static int findingOperand1()
   {
      if (varIsNum == true)
      {
         operand1 = Integer.parseInt(var);
         return operand1;
      }
      else
      {
         var1IsNum = false;
         operand1 = Integer.parseInt(var1);
         return operand1;
      }
   }
//Finding Operand2 Method
   public static int findingOperand2()
   {
      if (var1IsNum == true)
      {
         operand2 = Integer.parseInt(var1);
         return operand2;
      }
      else
      {
         operand2 = Integer.parseInt(var2);
         return operand2;
      }
   }
}//Calculator