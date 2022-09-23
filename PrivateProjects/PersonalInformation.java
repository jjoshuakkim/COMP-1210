import java.util.Scanner;
import java.util.ArrayList;

public class PersonalInformation
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      ArrayList<PersonalInformationCollection> list = new ArrayList<>();
      
      while (true)
      {
         System.out.print("First name: ");
         String first = scan.nextLine();
         if (first.isEmpty())
         {
            break;
         }
         System.out.print("Last name: ");
         String last = scan.nextLine();
         System.out.print("ID: ");
         String ID = scan.nextLine();
         
         list.add(new PersonalInformationCollection(first, last, ID));
      }
      
      System.out.println();
      for (PersonalInformationCollection people : list)
      {
         System.out.println(people);
      }
   }
}