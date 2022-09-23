import java.util.Scanner;

public class SumEven
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int evenNum = 0;
      int oddNum = 0;
      int sum =0;
      System.out.println("Enter numbers: ");
      
      while (true)
      {
         int input = Integer.valueOf(scan.nextLine());
         if (input == 0)
         {
            break;
         }
         else if (input % 2 == 0)
         {
            evenNum++;
         }
         else
         {
            oddNum++;
         }
         sum += input;
      }
      System.out.println("Even numbers: " + evenNum);
      System.out.println("Odd numbers: " + oddNum);
      System.out.println("Sum: " + sum);
   }
}
      
         