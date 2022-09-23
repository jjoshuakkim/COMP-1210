import java.util.Scanner;

public class Shift
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int[] numbers = {1, 2, 3, 4, 5, 6, 7};
      
      for (int i = 0; i < numbers.length; i++)
      {
         System.out.print(numbers[i] + " ");
      }
      
      System.out.println();
      System.out.println("Shift?" );
      int shift = scan.nextInt();
      int[] array = new int[numbers.length];
      
      int start = 0;
      for (int j = 0; j < numbers.length; j++)
      {
         if (numbers.length + shift - j >= numbers.length)
         {
            array[start] = numbers[j];
            start++;
         }
         else
         {
            array[start] = numbers[numbers.length + shift - j];
         }
      }
      
      for (int k = 0; k < numbers.length; k++)
      {
         System.out.print(array[k] + " ");
      }
   }
}