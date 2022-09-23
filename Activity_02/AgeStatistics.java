import java.util.Scanner;

/**
  * AgeStatistics - Activity_02.
  * Joshua Kim
  * Date : 8/28/20
 */

public class AgeStatistics {
   /**
     * Program prompts user to input name, age, and gender.
     * Calculates heart rate based on gender
     *
     * @param args Command line arguments (not used)
    */
   public static void main(String[] args) {
   
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter your name: ");
      String name = scan.nextLine();
      
      System.out.print("Enter your age in years: ");
      int age = scan.nextInt();
      
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      int gender = scan.nextInt();
      
      System.out.println("\tYour age in minutes is "
         + age * 525600 + " minutes.");
      System.out.println("\tYour age in centuries is " 
         + (double) age / 100 + " centuries.");
      
      if (gender == 1)
      {
         System.out.println("Your max heart rate is " 
            + (209 - (0.7 * age)) + " beats per minute.");
      }
      else
      {
         System.out.println("Your max heart rate is " 
            + (214 - (0.8 * age)) + " beats per minute.");
      }
   }
}