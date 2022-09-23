import java.util.Scanner;

public class UsingStrings
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int sum = 0, count = 0;
      String longest = "";
      while (true)
      {
         String input = scan.nextLine();
         if (input.equals(""))
         {
            break;
         }
         String[] pieces = input.split(",");
          
         if (pieces[0].length() > longest.length())
         {
            longest = pieces[0];
         }
         sum += Integer.valueOf(pieces[1]);
         count++;
      }
      double average = sum / count;
      System.out.println("Average: " + average);
      System.out.println("Longest name: " + longest);
   }
}