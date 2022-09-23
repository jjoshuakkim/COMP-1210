import java.util.Scanner;
import java.util.ArrayList;

public class Arrays7
{
   public static void main(String[] args)
   {
      ArrayList<Integer> numbers = new ArrayList<>();
      numbers.add(0);
      numbers.add(8);
      numbers.add(9);
      
      System.out.println(sum(numbers));
   }
   
   public static int sum(ArrayList<Integer> numbers)
   {
      int sum = 0;
      for (int number : numbers)
      {
         sum += number;
      }
      return sum;
   }
}