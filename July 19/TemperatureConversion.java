/* Temperature Conversion
   Anderson, Franceschi
   Zachary Mosley
*/

public class TemperatureConversion
{
   public static void main( String [] args )
   {
      //***** 1. declare any constants here
	      

      //***** 2.  declare temperature in Fahrenheit as an int 
	      int Temp = 46;
	  		int Remainder = Temp % 2;
      //***** 3. calculate equivalent Celsius temperature	
	      Temp = (int)((Temp - 32) * 0.556);
	  	   
      //***** 4. output the temperature in Celsius
	      System.out.println(
                  "the temperature is " + Temp + "Celsius");								  
      //***** 5. convert Celsius temperature back to Fahrenheit
		   Temp = (int)(Temp * 1.8 + 32);
			
         if (Remainder < 1)
            {
               Temp += 2;
            }else
            {
               Temp += 1;
            }
      //***** 6. output Fahrenheit temperature to check correctness 
		   System.out.println(
                  "the temperature is " + Temp + "Fahrenheit");
                  
   }
} 