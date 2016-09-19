//Zachary Mosley
//CS101-02
//Porject 6

import java.util.*;

public class UndergraduateStudent extends Student
{
   
   public UndergraduateStudent(Scanner in)
   {
      type = 1;
      name = in.next();
      address = in.next();
      phone = in.next();
      email = in.next();
      month = in.nextInt();
      day = in.nextInt();
      year = in.nextInt();
      date = new Date(month,day,year);
      status = statusUpdate(in.next());
   }
   
   private String statusUpdate(String in)
   {
      if(in.equals("f"))
         return "freshman";
      else if(in.equals("s"))
         return "sophomore";
      else if(in.equals("j"))
         return "junior";
      else
         return "senior";
   }
   
   public String toString()
   {
      return "Undergraduate" +
          "\n\tname: " + name +
          "\n\taddress: " + address +
          "\n\tphone number: " + phone +
          "\n\te-mail address: " + email +
          "\n\tbirth date: " + date +
          "\n\tstatus: " + status;
   }
}