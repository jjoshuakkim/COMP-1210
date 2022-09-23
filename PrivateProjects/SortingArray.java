import java.util.Scanner;

public class SortingArray
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int[] array = {2, 6, 1, 2, 7, 4, 3};
      
      for (int k = 0; k < array.length; k++)
      {
         System.out.print(array[k] + " ");
      }     
      int start = 0;
      
      for (int i = 0; i < array.length; i++)
      {
         for (int j = i + 1; j < array.length; j++)
         {
            if (array[i] > array[j])
            {
               start = array[i];
               array[i] = array[j];
               array[j] = start;
            }
          }
       }
       
       System.out.println();
       for (int h = 0; h < array.length; h++)
       {
         System.out.print(array[h] + " ");
       }
    }
}