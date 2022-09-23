import java.util.Scanner;

/**
  * MessageConverter - Activity_03.
  * Joshua Kim
  * Date : 9/7/20
 */
 
public class MessageConverter
{

   /**
     * Program prompts user to input a message.
     * Manipulates message based on int value
     *
     * @param args Command line arguments (not used)
    */
    
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Type in a message and press enter:\n\t> ");
      String message = scan.nextLine();
      
      String result = "";
      int outputType;
      System.out.print("\nOutput types:"
         + "\n\t0: As is "
         + "\n\t1: Trimmed"
         + "\n\t2: lower case:"
         + "\n\t3: UPPER CASE:"
         + "\n\t4: v_w_ls r_pl_c_d "
         + "\n\t5: Without first and last character"
         + "\nEnter your choice: ");
      
      outputType = Integer.parseInt(scan.nextLine());
      if (outputType == 0)
      {
         result = message;
      }
      else if (outputType == 1)
      {
         result = message.trim();
      }
      else if (outputType == 2)
      {
         result = message.toLowerCase();
      }
      else if (outputType == 3)
      {
         result = message.toUpperCase();
      }
      else if (outputType == 4)
      {
         result = message.replace('a', '_');
         result = result.replace('e', '_');
         result = result.replace('i', '_');
         result = result.replace('o', '_');
         result = result.replace('u', '_');
      }
      else if (outputType == 5)
      {
         result = message.substring(1, message.length() - 1);
      }    
      else
      {
         result = "Error: Invalid choice input.";
      }
      System.out.println("\n" + result);  
   }
}