/**
  * Scores - Activity_08.
  * Joshua Kim
  * Date : 10/12/20
 */
public class Scores
{
   private int[] numbers;
   
   /**
    * Constructor uses 1 parameter for an array.
    *
    * @param numbersIn is an array
    */
    
   public Scores(int[] numbersIn)
   {
      numbers = numbersIn;
   }
   
   /**
    * findEvens will find the evens.
    * @return evens will return the array
    * of evens
    */
   public int[] findEvens()
   {
      int numberEvens = 0;
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] % 2 == 0)
         {
            numberEvens++;
         }
      }
      
      int[] evens = new int[numberEvens];
      int count = 0;
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] % 2 == 0)
         {
            evens[count] = numbers[i];
            count++;
         }
      }
            
      return evens;
   }
   
   /**
    * findOdds will find the odds.
    * @return odds will return the array
    * of odds
    */
    
   public int[] findOdds()
   {
      int numberOdds = 0;
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] % 2 != 0)
         {
            numberOdds++;
         }
      }
      
      int[] odds = new int[numberOdds];
      int count = 0;
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] % 2 != 0)
         {
            odds[count] = numbers[i];
            count++;
         }
      }
            
      return odds;
   }
   
   /**
    * calculateAverage will calculate the average.
    * @return will return the average of the elements
    */
    
   public double calculateAverage()
   {
      int sum = 0;
      for (int i = 0; i < numbers.length; i++)
      {
         sum += numbers[i];
      }
      
      return (sum / (double) numbers.length);
   }
   
   /**
    * toString returns the string representation.
    * of the method
    * @return result returns the result
    */
    
   public String toString()
   {
      String result = "";
      for (int i = 0; i < numbers.length; i++)
      {
         result += numbers[i] + "\t";
      }
      
      return result;
   }
   
   /**
    * toStringInReverse returns the string representation.
    * of the method in reverse
    * @return result returns the result
    */
    
   public String toStringInReverse()
   {
      String result = "";
      for (int i = numbers.length - 1; i >= 0; i--)
      {
         result += numbers[i] + "\t";
      }
      
      return result;
   }
}