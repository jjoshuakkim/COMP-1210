import java.util.Scanner;
import java.util.ArrayList;

public class Arrays6
{
   public static void printNumbersInRange(ArrayList<Integer> numbers, int upperBound, int lowerBound)
   {
      for (int number : numbers)
      {
         if (number < upperBound && number > lowerBound)
         {
            System.out.println(number);
         }
      }
   }
   
   public static void main(String[] args)
   {
      ArrayList<Integer> numbers = new ArrayList<>();
      
      numbers.add(1);
      numbers.add(2);
      numbers.add(6);
      numbers.add(3);
      numbers.add(4);
      
      printNumbersInRange(numbers, 5, 2);
   }
}