import java.util.Scanner;

/**
  * ExpressionResult - Project_02.
  * Joshua Kim
  * Date : 8/31/20
 */
 
public class ExpressionResult
{

   /**
     * Program prompts user to input x, y, and z value.
     * Calculates value by plugging into a set equation
     *
     * @param args Command line arguments (not used)
    */
    
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("result = (x - 1.1) (2y + 2.2) (4z + 4.4) / xyz");
      
      System.out.print("\tx = ");
      double x = scan.nextDouble();
      
      System.out.print("\ty = ");
      double y = scan.nextDouble();
      
      System.out.print("\tz = ");
      double z = scan.nextDouble();
      
      double result = ((x - 1.1) * (2 * y + 2.2) * (4 * z + 4.4)) / (x * y * z);
      if (x == 0 || y == 0 || z == 0)
      {
         System.out.println("result is \"undefined\"");
      }
      else
      {
         System.out.println("result = " + result);
      }
   }
}