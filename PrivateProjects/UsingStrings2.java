import java.util.Scanner;

public class UsingStrings2
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      while (true)
      {
         String input = scan.nextLine();
         String[] pieces = input.split(" ");
         for (int i = 0; i < pieces.length; i++)
         {
            System.out.println(pieces[i]);
         }
         if (input.equals(""))
         {
            break;
         }
      }
   }
}