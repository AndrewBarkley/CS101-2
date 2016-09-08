//Zachary Mosley

public class  SelectionSort
{
   public static void main(String [] args)
   {
      int [] a = MakeArray.unsorted(10, 4, 22);
      sort(a);
   }
   public static void sort(int [] a)
   {
      for(int select = 0; select < a.length; select++)
      {
         int minIndex = findMinIndex(a, select);
         swap(a, minIndex, select);
      }
   }
   public static int findMinIndex(int [] a, int select)
   {
      int min = Integer.MAX_VALUE;
      int index = select;
      for(int i = select; i < a.length; i++)
      {
         if(min >= a[i])
         {
            min = a[i];
            index = i; 
         }
      }
      return index;
   }
   public static void swap(int[] a, int minIndex, int select)
   {
      int temp = a[select];
      a[select] = a[minIndex];
      a[minIndex] = temp;
   }
}