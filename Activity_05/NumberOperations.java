/**
  * NumberOperations - Activity_05.
  * Joshua Kim
  * Date : 9/22/20
 */
 
public class NumberOperations
{
   private int number;
   
   /**
     * Constructor takes one parameter.
     * @param numberIn takes the number which
     * will be manipulated in bottom code
     */
     
   public NumberOperations(int numberIn)
   {
      number = numberIn;
   }
   
   /**
     * getValue gets the value.
     * @return number returns the get value
     */
     
   public int getValue()
   {
      return number;
   }
   
   /** oddsUnder prints the string of odd numbers.
     * @return output returns the odd numbers
     */
     
   public String oddsUnder()
   {
      String output = "";
      int i = 0;
      while (i < number)
      {
         if (i % 2 != 0)
         {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   
   /** powersTwoUnder prints the string powers of two.
     * @return output returns the powers of two
     */
     
   public String powersTwoUnder()
   {
      String output = "";
      int powers = 1;
      while (powers < number)
      {
         output += powers + "\t";
         powers = powers * 2;
      }
      
      return output;
   }
   
   /** isGreater compares if one number is greater than.
     * the other
     * @param compareNumber is the number number is compared to
     * @return 1 is less than
     */ 
     
   public int isGreater(int compareNumber)
   {
      if (number < compareNumber)
      {
         return -1;
      }
      else if (number > compareNumber)
      {
         return 1;
      }
      else
      {
         return 0;
      }
   }
   
   /** toString prints the string representation of info.
     * @return number returns the number
     */
     
   public String toString()
   {
      return number + "";
   }
}