import java.util.Scanner;
import java.util.ArrayList;

public class Arrays1
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      ArrayList<String> names = new ArrayList<>();
      
      System.out.println("Input elements: ");
      while (true)
      {
         String var1 = scan.nextLine();
         if (var1.equals(""))
         {
            break;
         }
         else
         {
            names.add(var1);
         }
      }
      int size = names.size();
      System.out.println(names.get(0));
      System.out.println(names.get(size - 1));
   }
}