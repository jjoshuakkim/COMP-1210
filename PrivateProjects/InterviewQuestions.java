import java.util.Scanner;

public class InterviewQuestions
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int[] numbers = {2, 1, 2, 3, 4, 5, 6, 7, 7, 5, 4, 3, 3, 3};
      
      for (int i = 0; i < numbers.length; i++)
      {
         for (int j = i + 1; j < numbers.length; j++)
         {
            if (numbers[j] == numbers[i])
            {
               System.out.print(numbers[i]);
            }
         }
      }
   }
}