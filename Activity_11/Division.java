/**
  * Joshua Kim
  * Division - Activity_11.
  * Date : 11/17/20
 */
 
public class Division
{
   /**
     * intDivide() gets the division of integers.
     * @param numerator is the numerator
     * @param denominator is the denominator
     * @return returns the result
    */
    
   public static int intDivide(int numerator, int denominator)
   {
      try
      {
         return numerator / denominator;
      }
      
      catch (ArithmeticException e)
      {
         return 0;
      }
   }
   
   /**
     * decimalDivide() gets the division of doubles.
     * @param numerator is the numerator
     * @param denominator is the denominator
     * @return returns the result
     * @throws IllegalArgumentException is thorwn if denominator
     * is zero.
    */
    
   public static double decimalDivide(int numerator, int denominator)
   {
      if (denominator == 0)
      {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      }
      
      return (double) numerator / (double) denominator;
   }
}