import java.util.Scanner;
import java.util.ArrayList;

public class LinearSearch
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      ArrayList<Integer> numbers = new ArrayList();
      System.out.println("Enter values: ");
      
      while (true)
      {
         int value = scan.nextInt();
         if (value == 0)
         {
            break;
         }
         numbers.add(value);
      }
      
      System.out.println("Search for? ");
      int search = scan.nextInt();
      
      int found = 0;
      for (int i = 0; i < numbers.size(); i++)
      {
         if (numbers.get(i) == search)
         {
            found = i;
            System.out.println(search + " is located at index " + i);
         }
      }
      if (found == 0)
      {
         System.out.println(search + " was not found.");
      }
   }
}