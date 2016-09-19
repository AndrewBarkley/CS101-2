//Zachary Mosley
//CS101-02
//Project 6


public class Date
{
   private int month;
   private int day;
   private int year;
   private String date = "";
   
   public Date(int month, int day, int year)
   {
      this.month = month;
      this.day = day;
      this.year = year;
   }
   
   /*
                     compareTo Algorithm
   -----------------------------------------------------------------------
      if(year == date2.getYear())
         if(month == date2.getMonth())
            if(day == date2.getDay())
               return 0
            else if(day <= date2.getDay())
               return 1
            else
               return -1
         else if(month <= date2.getMonth())
            return 1
         else
            return -1
      else if(year <= date2.getYear())
         return 1
      else
         return -1
   -----------------------------------------------------------------------

                     compareTo Data Table
   Variable or Constant          Purpose
   ____________________          _________________________________________
   int month                     store the month
   int day                       stores the day
   int year                      stores the year
  
   */
   public int compareTo(Date date2)
   {
      if(year == date2.getYear())
      {
         if(month == date2.getMonth())
         {
            if(day == date2.getDay())
            {
               return 0;
            }
            else if(day <= date2.getDay())
               return 1;
            else
               return -1;
         }
         else if(month <= date2.getMonth())
            return 1;
         else
            return -1;
      }
      else if(year <= date2.getYear())
         return 1;
      else
         return -1;
   }
   
   public int getMonth()
   {
      return month;
   }
   public int getDay()
   {
      return day;
   }
   public int getYear()
   {
      return year;
   }
   
   public String toString()
   {
      date = "";
      switch(month)
      {
         case 1:
            date += "January ";
            break;
         case 2:
            date += "February ";
            break;
         case 3:
            date += "March ";
            break;
         case 4:
            date += "April ";
            break;
         case 5:
            date += "May ";
            break;
         case 6:
            date += "June ";
            break;
         case 7:
            date += "July ";
            break;
         case 8:
            date += "August ";
            break;
         case 9:
            date += "September ";
            break;
         case 10:
            date += "October ";
            break;
         case 11:
            date += "November ";
            break;
         default:
            date += "December ";
            break;
      } 
      date += day + ", " + year;
      return date;
      
   }
}