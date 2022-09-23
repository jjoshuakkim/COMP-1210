import java.util.Scanner;
import java.util.Random;

public class Arrays
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      Random rand = new Random();
      
      System.out.println("First name: ");
      String firstName = scan.nextLine();
      
      System.out.println("Last name: ");
      String lastName = scan.nextLine();
      
      System.out.println("Department: ");
      String department = scan.nextLine();
      
      String[] info = {firstName, lastName, department};
      System.out.println(info[rand.nextInt(2)] + info[rand.nextInt(2)]);
   }
}