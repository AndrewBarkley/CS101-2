//Zachary mosley

public class LinearSortedSearch
{
   public static void main(String [] args)
   {
      int [] a = MakeArray.sorted(10, 2, 19);
      int val = 12;
      int location = search(a, val);
      if (location == -1)
         System.out.println(val + " is not in the array");
      else
         System.out.println(val + " is at location " + location);
   }
   public static int search(int [] a, int val)
   {
      int smallIndex = 0;
      int bigIndex = a.length - 1;
      while (smallIndex <= bigIndex)
      {
         int midIndex = (smallIndex + bigIndex)/2;
         if (a[midIndex] == val) return midIndex;
         else if (a[midIndex] > val) bigIndex = midIndex - 1;
         else smallIndex = midIndex + 1;
      }
      return -1;
   }
}