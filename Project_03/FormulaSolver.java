import java.util.Scanner;
import java.text.DecimalFormat;

/**
  * FormulaSolver - Project_03.
  * Joshua Kim
  * Date : 9/9/20
 */

public class FormulaSolver
{
   /**
     * Program prompts user to input x value.
     * Plugs into a formula and finds value.
     * Formats value with decimalformat
     *
     * @param args Command line arguments (not used)
    */
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#,##0.0#####");
      
      System.out.print("Enter a value for x: ");
      double x = scan.nextDouble();
      double result = (6 * Math.pow(x, 3) - 4) * Math.sqrt(
         Math.abs(7 * Math.pow(x, 3) + 5 * Math.pow(x, 2) + 3 * x + 1));
      
      System.out.println("Result: " + result);
      String result1 = Double.toString(result);
      System.out.println("# of characters to left of decimal po"
         + "int: " + result1.indexOf("."));
      System.out.println("# of characters to right of decimal po"
         + "int: " + (result1.length() - result1.indexOf(".") - 1));
         
      System.out.println("Formatted Result: " + df.format(result));
   }
}