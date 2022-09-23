import java.util.Scanner;

/**
  * TimeConverter - Project_02.
  * Joshua Kim
  * Date : 8/31/20
 */
 
public class TimeConverter
{
   /**
     * Program prompts user to input x amount of seconds.
     * Converts seconds into days, hours, minutes, seconds.
     *
     * @param args Command line arguments (not used)
    */
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the raw time measurement in seconds: ");
      int seconds = scan.nextInt();
      
      if (seconds < 0)
      {
         System.out.println("Measurement must be non-negative!");
      }
      else
      {
         System.out.println();
         int days = seconds / 86400;
         int hours = (seconds % 86400) / 3600;
         int minutes = (seconds % 3600) / 60;
         int seconds2 = (seconds % 60);
         
         System.out.println("Measurement by combined days, "
            + "hours, minutes, seconds:");
         System.out.println("\tdays: " + days);
         System.out.println("\thours: " + hours);
         System.out.println("\tminutes: " + minutes);
         System.out.println("\tseconds: " + seconds2);
         
         System.out.println();
         System.out.println(seconds + " seconds = " + days + " days, " + hours 
            + " hours, " + minutes + " minutes, " + seconds2 + " seconds");
      }
   }
}