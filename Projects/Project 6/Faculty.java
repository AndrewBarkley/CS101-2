//Zachary Mosley
//CS101-02
//Project 6

import java.util.*;

public class Faculty extends Employee
{
   protected String hours = "";

   public Faculty(Scanner in)
   {
      type = 4;
      name = in.next();
      address = in.next();
      phone = in.next();
      email = in.next();
      office = in.next();
      salary = in.nextDouble();
      month = in.nextInt();
      day = in.nextInt();
      year = in.nextInt();
      date = new Date(month,day,year);
      title = in.next();
      hours = in.next();
   }
   
   public String toString()
   {
      return "Faculty" +
          "\n\tname: " + name +
          "\n\taddress: " + address +
          "\n\tphone number: " + phone +          
          "\n\te-mail address: " + email +
          "\n\toffice: " + office +
          "\n\tsalary: " + salary +
          "\n\thiring date: " + date +
          "\n\ttitle: " + title +
          "\n\toffice hours: " + hours;
   }
}