import java.util.Scanner;

public class UsingStrings
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("String: ");
      String string = scan.nextLine();
      
      System.out.print(string + string + string);
   }
}