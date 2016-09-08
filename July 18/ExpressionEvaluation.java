//

//Zacahry Mosley

public class ExpressionEvaluation
{
   public static void main(String [] args)
   {
      int x = -17;
      int y = 32;
      System.out.println(
      5 * +x + + - + - + - + y / 4);
    //5 * x + -y / 4;   
      System.out.println(
      6 + 9 / 2 % 3 + 2 / 4.0 - 5 / 4);
    //6 + (9 / 2) % 3 + (2 / 4.0) - (5 / 4)
    //6 + 4 % 3 + 0.5 - 1
    //6 + 1 + 0.5 - 1
      System.out.println(
      3 + 4 / 2.0 - 17 / 18 + 21 % 3);
    //3 + 2.0 - 0 + 0
    //5.0
      System.out.println(
      6 * 3 + 7 / 2 - 4 + 1 + "Java" + 8 * 3 + 4 % 3);
    //18 + 3 - 4 + 1 + "Java" + 24 + 1 
    // ^Normal math^ ^        ^    ^
    //               No longer addition
      System.out.println(
      6 * 3 + 7 / 2 - 4 + 1 + "Java" + 8 * 3 - 4 % 3);
    //No longer works because - cant be applied to strings
      System.out.println(
      6 * 3 + 7 / 2 - 4 + 1 + "Java" + (8 * 3 + 4 % 3));
    //18Java25
      
      
   }//main
}//ExpressionEvaluation