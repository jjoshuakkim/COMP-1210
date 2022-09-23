/**
  * Joshua Kim
  * InvalidCategoryException - Project_11.
  * Date : 11/19/20
 */
 
public class InvalidCategoryException extends Exception
{
   /**
     * Constructor uses no 1 parameter as a string.
     * invokes the super constructor
     * @param categoryIn is a string
    */
    
   public InvalidCategoryException(String categoryIn)
   {
      super("For category: " + categoryIn);
   }
}