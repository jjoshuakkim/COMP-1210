import java.util.Scanner;

public class Temperature
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("How many days' temperature?");
      int days = scan.nextInt();
      
      int[] temp = new int[days];
      
      double totalTemp = 0;
      for (int i = 0; i < days; i++)
      {
         System.out.print("Day " + (i + 1) + "'s high temperature: ");
         temp[i] = scan.nextInt();
         totalTemp += temp[i];
      }
      
      double average = totalTemp / days;
      System.out.println("Average temperature: " + average);
      
      int count = 0;
      for (int i = 0; i < days; i++)
      {
         if (temp[i] > average)
         {
            count++;
         }
      }
      System.out.println(count + " days had temperature above average.");
   }
   
}
      