import java.util.Scanner;
import java.util.ArrayList;

public class TelevisionProgramMain
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      ArrayList<TelevisionProgram> list = new ArrayList<>();
      
      while (true)
      {
         System.out.print("Name: ");
         String name = scan.nextLine();
         if (name.isEmpty())
         {
            break;
         }
         System.out.print("Duration: ");
         int duration = Integer.valueOf(scan.nextLine());
         
         list.add(new TelevisionProgram(name, duration));
      }
      
      System.out.print("Program's maximum duration: ");
      int max = scan.nextInt();
      
      for (TelevisionProgram names : list)
      {
         if (names.getDuration() <= max)
         {
            System.out.println(names);
         }
      }
   }
}