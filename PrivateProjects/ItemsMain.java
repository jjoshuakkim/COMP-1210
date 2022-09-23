import java.util.Scanner;
import java.util.ArrayList;

public class ItemsMain
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      ArrayList<Items> items = new ArrayList<>();
      
      while (true)
      {
         System.out.println("Name: ");
         String item = scan.nextLine();
         items.add(new Items(item));
         
         if (item.isEmpty())
         {
            break;
         }
      }
      
      for (Items item : items)
      {
         System.out.println(item);
      }
   }
}