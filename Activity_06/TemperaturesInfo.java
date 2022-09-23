import java.util.Scanner;
import java.util.ArrayList;

/**
  * TemperaturesInfo - Acivity_06.
  * Joshua Kim
  * Date : 9/29/20
 */
 
public class TemperaturesInfo
{

   /**
     * Program prompts user to input temperature values.
     * Uses temperatures to determine output
     *
     * @param args Command line arguments (not used)
    */
    
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      ArrayList<Integer> tempList = new ArrayList<>();
      
      String tempInput;
      do
      {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = scan.nextLine().trim();
         if (!tempInput.equals(""))
         {
            tempList.add(Integer.parseInt(tempInput));
         } 
      } while (!tempInput.equals(""));
      
      Temperatures temp = new Temperatures(tempList);
      char choice = 'E';
      do
      {
         System.out.print("Enter choice - [L]ow temp, "
            + "[H]igh temp, [P]rint, [E]nd: ");
         choice = scan.nextLine().toUpperCase().charAt(0);
         switch (choice)
         {
            case 'L':
               System.out.println("\tLow is " + temp.getLowTemp());
               break;
            case 'H':
               System.out.println("\tHigh is " + temp.getHighTemp());
               break;
            case 'P':
               System.out.println(temp);
               break;
            case 'E':
               System.out.println("\tDone");
               break;
            default:
               System.out.println("\tInvalid choice!");
         }
      } while (choice != 'E');
   }
}
            
         

            