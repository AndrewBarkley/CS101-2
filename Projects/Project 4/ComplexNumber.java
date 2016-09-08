//Zachary Mosley
//CS101-02
//Project 4

import java.util.*;
/*
                  Class Algorithm
-----------------------------------------------------------------------
private double real
private double imaginary
private static int count <- 0
public static final double DEFAULT_REAL <- 0
public static final double DEFAULT_IMAGINARY <- 0
-----------------------------------------------------------------------

                  Class Data Table
Variable or Constant          Purpose
____________________          _________________________________________
real                          Double for the real aspect of the complex number
imaginary                     Double for the imaginary aspect of the complex number
count                         Int for number of complex numbers made
DEFAULT_REAL                  Default Double value for real = 0
DEFAULT-IMAGINARY             Default Double value for imaginary = 0

*/
public class ComplexNumber
{
   private double real;
   private double imaginary;
   private static int count = 0;
   public static final double DEFAULT_REAL = 0;
   public static final double DEFAULT_IMAGINARY = 0;
/*
                     Algorithm
   -----------------------------------------------------------------------
   setReal(real)
   setImaginary(imaginary)
   count++
   -----------------------------------------------------------------------

                     Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   real                          Double for the real aspect of the complex number
   imaginary                     Double for the imaginary aspect of the complex number
   count                         Int for number of complex numbers made

*/
   public ComplexNumber(double real, double imaginary)
   {
      setReal(real);
      setImaginary(imaginary);
      count++;
   }
/*
                     Algorithm
   -----------------------------------------------------------------------
   ComplexNumber(DEFAULT_REAL, DEFAULT_IMAGINARY)
   -----------------------------------------------------------------------

                     Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   DEFAULT_REAL                  Default Double value for real = 0
   DEFAULT-IMAGINARY             Default Double value for imaginary = 0

*/
   public ComplexNumber()
   {
      this(DEFAULT_REAL, DEFAULT_IMAGINARY);
   }
/*
                     Algorithm
   -----------------------------------------------------------------------
   ComplexNumber(real, DEFAULT_IMAGINARY)
   -----------------------------------------------------------------------

                     Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   real                          Double for the real aspect of the complex number
   DEFAULT-IMAGINARY             Default Double value for imaginary = 0

*/
   public ComplexNumber(double real)
   {
      this(real, DEFAULT_IMAGINARY);
   }
/*
                     Algorithm
   -----------------------------------------------------------------------
   ComplexNumber(input.getReal(), input.getImaginary())
   -----------------------------------------------------------------------

                     Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   input                         Complex number to obtain the data for the new complex number

*/
   public ComplexNumber(ComplexNumber input)
   {
      this(input.getReal(), input.getImaginary());
   }
   public double getReal()
   {
      return real;
   }
   public double getImaginary()
   {
      return imaginary;
   }
   public static int getCount()
   {
      return count;
   }
/*
                     Algorithm
   -----------------------------------------------------------------------
   object1 real <- real
   -----------------------------------------------------------------------

                     Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   class real                    Double for the real aspect of the complex number
   real                          new Double for the real aspect of the complex number

*/
   public void setReal(double real)
   {
      this.real = real;
   }
/*
                     Algorithm
   -----------------------------------------------------------------------
   object1 imaginary <- imaginary
   -----------------------------------------------------------------------

                     Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   class imaginary               Double for the imaginary aspect of the complex number
   imaginary                     new Double for the imaginary aspect of the complex number

*/
   public void setImaginary(double imaginary)
   {
      this.imaginary = imaginary;
   }
/*
                     Algorithm
   -----------------------------------------------------------------------
   real <- object1 real + object2 real
   imaginary <- object1 imaginary + object2 imaginary
   return <- new ComplexNumber(real, imaginary)
   -----------------------------------------------------------------------

                     Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   input                         Complex number to obtain the data for the new complex number
   real                          Double for the real aspect of the complex number
   imaginary                     Double for the imaginary aspect of the complex number

*/   
   public  ComplexNumber add(ComplexNumber input)
   {
      double real = getReal() + input.getReal();
      double imaginary = getImaginary() + input.getImaginary();
      return new ComplexNumber(real, imaginary);
   }
   /*
                     Algorithm
   -----------------------------------------------------------------------
   real <- object1 real - object2 real
   imaginary <- object1 imaginary - object2 imaginary
   return <- new ComplexNumber(real, imaginary)
   -----------------------------------------------------------------------

                     Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   input                         Complex number to obtain the data for the new complex number
   real                          Double for the real aspect of the complex number
   imaginary                     Double for the imaginary aspect of the complex number

*/
   public ComplexNumber subtract(ComplexNumber input)
   {
      double real = getReal() - input.getReal();
      double imaginary = getImaginary() - input.getImaginary();
      return new ComplexNumber(real, imaginary);
   }
/*
                     Algorithm
   -----------------------------------------------------------------------
   real <- object1 real * object2 real - object1 imaginary * object2 imaginary
   imaginary <- object1 real * object2 imaginary - object1 imaginary * object2 real
   return <- new ComplexNumber(real, imaginary)
   -----------------------------------------------------------------------

                     Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   input                         Complex number to obtain the data for the new complex number
   real                          Double for the real aspect of the complex number
   imaginary                     Double for the imaginary aspect of the complex number

*/
   public ComplexNumber multiply(ComplexNumber input)
   {
      double real = getReal() * input.getReal() - getImaginary() * input.getImaginary();
      double imaginary = getReal() * input.getImaginary() + getImaginary() * input.getReal();
      return new ComplexNumber(real, imaginary);
   }
/*
                     Algorithm
   -----------------------------------------------------------------------
   Scanner in = input, with a delimiter of any char except numbers, periods, or minus signs
   double real = in.nextDouble()
   double imaginary = in.nextDouble()
   return <- new ComplexNumber(real, imaginary)
   -----------------------------------------------------------------------

                     Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   input                         String containing the complex number
   in                            Scanner to read input
   real                          Double for the real aspect of the complex number
   imaginary                     Double for the imaginary aspect of the complex number

*/   
   public static ComplexNumber valueOf(String input)
   {
      Scanner in = new Scanner(input).useDelimiter("[^0-9.-]+");
      double real = in.nextDouble();
      double imaginary = in.nextDouble();
      return new ComplexNumber(real, imaginary);
   }
/*
                     Algorithm
   -----------------------------------------------------------------------
   if(real == 0 && imaginary == 0)
      return <- true
   else
      return <- false
   -----------------------------------------------------------------------

                     Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   real                          Double for the real aspect of the complex number
   imaginary                     Double for the imaginary aspect of the complex number

*/
   public boolean isZero() //true if both values are 0
   {
      if(real == 0 && imaginary == 0)
         return true;
      else
         return false;
   }
   /*
                     Algorithm
   -----------------------------------------------------------------------
   return <- real + " + " + imaginary + "i"
   -----------------------------------------------------------------------

                     Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   real                          Double for the real aspect of the complex number
   imaginary                     Double for the imaginary aspect of the complex number

*/
   public String toString() // writes out the complex number as a + bi
   {
      return real + " + " + imaginary + "i";
   }
}