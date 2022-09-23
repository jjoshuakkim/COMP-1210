import java.util.Scanner;

public class WhileConditional
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      double sum = 0;
      double num = 0;
      double average = 0;
      int even = 0;
      int odd = 0;
      System.out.println("Give numbers: ");
      
      while (true)
      {
         int input = Integer.valueOf(scan.nextLine());
         if (input == -1)
         {
            System.out.println("Thx! Bye!");
            break;
         }
         else if (input % 2 == 0)
         {
            even++;
         }
         else if (input % 2 != 0)
         {
            odd++;
         }
         
         sum += input;
         num++;
         average = sum / num;
      }
      System.out.println("Sum: " + sum);
      System.out.println("Numbers: " + num);
      System.out.println("Average: " + average);
      System.out.println("Even: " + even);
      System.out.println("Odd: " + odd);
   }
}
         