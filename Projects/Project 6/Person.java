//Zachary Mosley
//CS101-02
//Project 6

public class Person
{
   protected int type = 0;
   protected String name = "";
   protected String address = "";
   protected String phone = "";
   protected String email = "";
   protected int month = 0;
   protected int day = 0;
   protected int year = 0;
   protected Date date;
   protected double salary = 0.0;
   
   protected String getName()
   {
      return name;
   }
   protected Date getDate()
   {
      return date;
   }
   protected int getType()
   {
      return type;
   }
   protected String getAddress()
   {
      return address;
   }
   protected double getSalary()
   {
      return salary;
   }
}