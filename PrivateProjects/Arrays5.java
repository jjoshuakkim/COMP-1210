import java.util.Scanner;
import java.util.ArrayList;

public class Arrays5
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      ArrayList<Integer> numbers = new ArrayList<>();
      
      System.out.println("Enter numbers: ");
      double sum = 0;
      double count = 0;
      
      while (true)
      {
         int value = scan.nextInt();
         if (value == -1)
         {
            break;
         }
         else
         {
            sum += value;
            count++;
         }
      }
      double average = sum / count;
      System.out.println("Average: " + average);
   }
}