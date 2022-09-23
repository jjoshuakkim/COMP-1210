import java.util.Scanner;

public class Vowels
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String str = scan.nextLine();
      
      int vowels = 0;
      for (int i = 0; i < str.length(); i++)
      {
         if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
         {
            vowels++;
         }
      }
      System.out.println("Numbers of vowels: " + vowels);
   }
}