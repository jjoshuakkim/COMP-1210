import java.util.Scanner;

public class Arrays8
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int[] numbers = {1, 2, 3, 4, 5};
      
      for (int i = 0; i < numbers.length; i++)
      {
         System.out.print(numbers[i] + " ");
      }
      
      System.out.println();
      System.out.println("Shift: ");
      int shift = scan.nextInt();
      
      if (shift < 0)
      {
         for (int j = 0; j < numbers.length; j++)
         {
            System.out.print(numbers[j + shift]);
         }
      }
      else
      {
         for (int j = 0; j < numbers.length; j++)
         {
            System.out.print(numbers[j + shift]);
         }
      }
   }
}