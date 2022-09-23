import java.util.Scanner;
import java.util.ArrayList;

public class BookMain
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      ArrayList<Book> list = new ArrayList<>();
      
      while (true)
      {
         System.out.print("Title: ");
         String title = scan.nextLine();
         if (title.isEmpty())
         {
            break;
         }
         
         System.out.print("Page number: ");
         String number = scan.nextLine();
         System.out.print("Publication date: ");
         String year = scan.nextLine();
         
         list.add(new Book(title, number, year));
      }
      
      System.out.print("What would you like to be printed? ");
      String response = scan.nextLine();
      
      if (response.equalsIgnoreCase("everything"))
      {
         for (Book names : list)
         {
            System.out.println(names);
         }
      }
      else if (response.equalsIgnoreCase("title"))
      {
         for (Book names : list)
         {
            System.out.println(names.title());
         }
      }
   }
}