import java.util.Scanner;

public class Loops
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      double number = 0;
      double numCount = 0;
      while (true)
      {
         System.out.println("Give a number (0 to quit): ");
         double value = Double.valueOf(scan.nextLine());
         
         if (value > 0 || value < 0)
         {
            number += 1;
            numCount += value;
         }
         else
         {
            break;
         }
      }
      double average = numCount / number;
      System.out.println("Average of the numbers: " + average);
   }
}