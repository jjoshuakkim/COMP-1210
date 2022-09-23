import java.util.Scanner;

public class NumOfString
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      while (true)
      {
         String input = scan.nextLine();
         if (input.equals("end"))
         {
            break;
         }
         
         int number = Integer.valueOf(input);
         System.out.println(number * number * number);
      }
   }
}