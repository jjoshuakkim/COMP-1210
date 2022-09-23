import java.util.Scanner;
import java.util.ArrayList;

public class Arrays3
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
      System.out.print("From where?");
      int first = scan.nextInt();
      System.out.print("To where?");
      int last = scan.nextInt();
      
      for (int i = first; i <= last; i++)
      {
         System.out.println(numbers.get(i));
      }
   }
}