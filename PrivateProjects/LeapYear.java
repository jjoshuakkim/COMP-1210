import java.util.Scanner;

public class LeapYear
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      boolean quit = true;
      
      while (quit)
      {
         System.out.println("Give a year (Enter 0 to quit): ");
         int year = Integer.valueOf(scan.nextLine());
         
         if (year % 4 == 0)
         {
            if (year % 100 == 0 && year % 400 != 0)
            {
               System.out.println("This is not a leap year");
               System.out.println();
            }
            else if (year == 0)
            {
               quit = false;
            }
            else
            {
               System.out.println("This is a leap year");
               System.out.println();
            }
         }
         else
         {
            System.out.println("This is not a leap year.");
            System.out.println();
         }
      }
   }
}
         