//Zachary Mosley
//CS101-02
//Project 6

import java.util.*;

public class Staff extends Employee
{
   protected String supervisor = "";
   
   public Staff(Scanner in)
   {
      type = 3;
      name = in.next();
      address = in.next();
      title = in.next();
      phone = in.next();
      email = in.next();
      office = in.next();
      salary = in.nextDouble();
      month = in.nextInt();
      day = in.nextInt();
      year = in.nextInt();
      date = new Date(month,day,year);
      supervisor = in.next();
   }
   
   public String toString()
   {
      return "Staff" +
          "\n\tname: " + name +
          "\n\taddress: " + address +
          "\n\ttitle: " + title +
          "\n\tphone number: " + phone +          
          "\n\te-mail address: " + email +
          "\n\toffice: " + office +
          "\n\tsalary: " + salary +
          "\n\thiring date: " + date +
          "\n\tsupervisor name: " + supervisor;
   }
}