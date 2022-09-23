import java.util.Scanner;
import java.util.ArrayList;

public class Arrays4
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      ArrayList<Integer> numbers = new ArrayList<>();
      
      System.out.println("Enter numbers: ");
      while (true)
      {
         int value = scan.nextInt();
         if (value == -1)
         {
            break;
         }
         else
         {
            numbers.add(value);
         }
      }
      int largest = numbers.get(0);
      for (int i = 0; i < numbers.size(); i++)
      {
         int number = numbers.get(i);
         if (numbers.get(i) > largest)
         {
            largest = number;
         }
      }
      System.out.println("The largest number is " + largest);
   }
}