import java.util.ArrayList;
import java.util.Scanner;

public class WarEagle
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      ArrayList<Integer> numbers = new ArrayList<>();
      
      System.out.println("Enter numbers: ");
      
      int start = 0;
      while (start == 0)
      {
         String value = scan.nextLine();
         if (value.equals("End"))
         {
            break;
         }
         int value2 = Integer.valueOf(value);
         numbers.add(value2);
      }
      
      for (int i = 0; i < numbers.size(); i++)
      {
         System.out.print(numbers.get(i) + " ");
      }
      
      for (int j = 0; j < numbers.size(); j++)
      {
         int least = numbers.get(j);
         for (int k = 0; k < numbers.size(); k++)
         {
            if (numbers.get(k) < least)
            {
               least = numbers.get(k);
               numbers.get(k) = numbers.get(j);
               numbers.get(j) = least;
            }
         }
      }
   }
}
      
      
      
      