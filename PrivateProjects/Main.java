import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Statistics statistics = new Statistics();
      Statistics statisticsOdd = new Statistics();
      Statistics statisticsEven = new Statistics();
      statistics.addNumber(3);
      statistics.addNumber(3);
      statistics.addNumber(3);
      statistics.addNumber(3);
      
      System.out.println("Count: " + statistics.getCount());
      System.out.println("Sum: " + statistics.sum());
      System.out.println("Average: " + statistics.average()); 
      
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter numbers: ");
      
      while (true)
      {
         int number = scan.nextInt();
         statistics.addNumber(number);
         if (number == -1)
         {
            break;
         }
         
         if (number % 2 == 0)
         {
            statisticsEven.addNumber(number);
         }
         else
         {
            statisticsOdd.addNumber(number);
         }
      }
      System.out.println("Sum: " + statistics.sum());
      System.out.println("Sum of odd: " + statisticsOdd.sum());
      System.out.println("Sum of even: " + statisticsEven.sum());
   }
}