import java.util.Scanner;

public class ClassAverage
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("What grade do you want (A, B, C, D, F)?");
      while (true)
      {
         String grade = scan.nextLine();
         System.out.println("Enter your first semester average: ");
         double first = scan.nextDouble();
         System.out.println("Enter your second semester average: ");
         double second = scan.nextDouble();
         
         if (grade.equals("A"))
         {
            double gradeNeeded = average(first, second) * 100 * 50;
            System.out.println("You need a " + gradeNeeded + " lol");
         }
      }
   }
   public static double average(double first, double second)
   {
      averageCalc = (first + second) / 2;
      return averageCalc;
   }
}
            