import java.util.Scanner;
import java.util.ArrayList;

public class APTest
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      ArrayList<String> list = new ArrayList<>();
      list.add("Geometric series");
      list.add("P-series");
      list.add("Alternating series test");
      list.add("Ratio test");
      list.add("Approximations");
      list.add("Euler's method");
      list.add("Logistic growth");
      list.add("Improper integrals");
      list.add("Integration by parts");
      list.add("Partial fractions");
      list.add("Arc length");
      
      System.out.println("Which have you complete?");
      
      while (true)
      {
         String input = scan.nextLine();
         if (list.contains(input))
         {
            list.remove(input);
         }
         if (input.equals("done"))
         {
            break;
         }
         System.out.println(list);
      }
      System.out.println();
      System.out.println("Make sure to study frqs!");
   }
}
      
      
      
      