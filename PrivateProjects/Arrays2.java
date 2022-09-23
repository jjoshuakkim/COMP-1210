import java.util.Scanner;
import java.util.ArrayList;

public class Arrays2
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
      for (int i = 0; i < numbers.size(); i++)
      {
         System.out.println(numbers.get(i));
      }
   }
}