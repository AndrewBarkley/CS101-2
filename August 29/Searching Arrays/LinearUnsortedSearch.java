//Zachary mosley

public class LinearUnsortedSearch
{
   public static void main(String [] args)
   {
      int [] a = MakeArray.unsorted(10, 2, 19);
      int val = 12;
      int location = search(a, val);
      if (location == -1)
         System.out.println(val + " is not in the array");
      else
         System.out.println(val + " is at location " + location);
   }
   public static int search(int [] a, int val)
   {
      int index = -1;
      for(int i=0; i<a.length; i++)
      {
         if(a[i] == val)
            index = i;
      }
      return index;
   }
}