import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class WordsInSentence
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      ArrayList<Integer> numbers = new ArrayList<>();
      
      System.out.println("Enter numbers: ");
      while (true)
      {
         String number = scan.nextLine();
         if (number.equals(""))
         {
            break;
         }
         
         numbers.add(Integer.valueOf(number));
      }
      for (int a = 0; a < numbers.size(); a++)
      {
         System.out.print(numbers.get(a) + " ");
      }
      
      System.out.println();
      for (int i = 0; i < numbers.size(); i++)
      {
         for (int j = 1 + i; j < numbers.size(); j++)
         {
            if (numbers.get(i) < numbers.get(j))
            {
               Collections.swap(numbers, i, j);
            }
         }
      }
      
      for (int k = 0; k < numbers.size(); k++)
      {
         System.out.print(numbers.get(k) + " ");
      }
   }
}