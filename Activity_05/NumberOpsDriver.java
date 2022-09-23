import java.util.Scanner;
import java.util.ArrayList;

/**
 * Demonstrates the NumberOperations class.
 * NumberOpsDriver - Activity_05.
 * Joshua Kim
 * Date : 9/22/20
 */
public class NumberOpsDriver {

   /**
    * Reads a set of positive numbers from the user until the user enters 0.
	 * Prints odds under and powers of 2 under for each number.
	 *
    * @param args - Standard commandline arguments
    */
   public static void main(String[] args) {
   	
      Scanner in = new Scanner(System.in);
      
      // declare and instantiate ArrayList with generic type <NumberOperations>
      ArrayList<NumberOperations> numOpsList = 
         new ArrayList<NumberOperations>();
      
      // prompt user for set of numbers
      System.out.println("Enter a list of positive integers separated "
                        + "with a space followed by 0:");
      int input = in.nextInt();
      while (input != 0)
      {
         numOpsList.add(new NumberOperations(input));
         input = in.nextInt();
      }
   
      // get first user input using in.nextInt()
   
      // add a while loop as described below: 
   	// while the input is not equal to 0 
         // add a new NumberOperations object to numOpsList based on user input
         // get the next user input using in.nextInt()
      
      int index = 0;
      while (index < numOpsList.size()) {
         NumberOperations num = numOpsList.get(index);
         System.out.println("For: " + num);
         System.out.println("\tOdds under: " + num.oddsUnder());
         System.out.println("\tPowers of 2 under:\t" + num.powersTwoUnder());
      	// add print statement for odds under num
      	// add print statement for powers of 2 under num
            
         index++;
      }
   }
}