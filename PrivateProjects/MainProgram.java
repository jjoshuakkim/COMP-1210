import java.util.Scanner;

public class MainProgram
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("What is your first name?");
      String first = scan.nextLine();
      
      System.out.println("What is your last name?");
      String last = scan.nextLine();
      
      System.out.println("Where do you work?");
      String department = scan.nextLine();
      
      Email account = new Email(first, last, department);
     // System.out.println("Congrats! Your email is: " + address() + ". Your password is: " + password());
     
      System.out.println(account.address());
   }
}