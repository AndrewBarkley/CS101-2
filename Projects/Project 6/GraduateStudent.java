//Zachary Mosley
//CS101-02
//Porject 6

import java.util.*;

public class GraduateStudent extends Student
{
   protected String assistantship = "";

   public GraduateStudent(Scanner in)
   {
      type = 2;
      name = in.next();
      address = in.next();
      month = in.nextInt();
      day = in.nextInt();
      year = in.nextInt();
      date = new Date(month,day,year);
      phone = in.next();
      email = in.next();
      status = variableUpdate(in.next());
      assistantship = variableUpdate(in.next());
   }
   
   protected String variableUpdate(String in)
   {
      if(in.equals("m"))
         return "master";
      else if(in.equals("d"))
         return "doctoral";
      else if(in.equals("t"))
         return "teaching";
      else
         return "research";
   }
   
   public String toString()
   {
      return "Graduate" +
          "\n\tname: " + name +
          "\n\taddress: " + address +
          "\n\tbirth date: " + date +
          "\n\tphone number: " + phone +
          "\n\te-mail address: " + email +
          "\n\tstatus: " + status +
          "\n\tassistantship type: " + assistantship;
   }
}