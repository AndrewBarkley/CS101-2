//Zachary Mosley

public class  BubbleSort
{
   public static void main(String [] args)
   {
      int [] a = MakeArray.unsorted(10, 3, 22);
      sort(a);
   }
   int bottom = a.length - 1;
   boolean sorted = false;
   while(!sorted)
   {
      sorted = true;
      for(int pass = 0; pass < bottom; pass++)
      {
         for(int i = 0; i < a.length - 2; i++)
         {
            if(a[i] > a[i + 1])
            {
               int temp = a[i];
               a[i] = a[i+1];
               a[i+1] = temp;
               sorted = false;
            }
         }
         bottom--;
      }
   }
}