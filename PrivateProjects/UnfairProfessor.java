import java.util.Scanner;
import java.util.ArrayList;

public class UnfairProfessor
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      ArrayList<String> names = new ArrayList<>();
      System.out.println("Enter name then score: ");
      
      while (true)
      {
         String name = scan.nextLine();
         if (name.equals(""))
         {
            break;
         }
         String[] pieces = name.split(" ");
         int score = Integer.valueOf(pieces[1]);
         
         if (pieces[0].charAt(0) == 'a' || pieces[0].charAt(0) == 'e' || pieces[0].charAt(0) == 'i' || pieces[0].charAt(0) == 'o' || pieces[0].charAt(0) == 'u')
         {
            score = score + 5;
            if (score > 100)
            {
               score = 100;
            }
            
            pieces[1] = String.valueOf(score);
         }
         name.equals(pieces[0] + " " + pieces[1]);
         names.add(name);
      }
      for (int i = 0; i < names.size(); i++)
      {
         System.out.println(names.get(i));
      }
   }
}
         