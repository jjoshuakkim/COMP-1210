/**
  * OnlineBook - Activity_09.
  * Joshua Kim
  * Date : 11/03/20
 */
 
public class OnlineBook extends OnlineTextItem
{
   protected String author;
   
   /**
    * Constructor uses 2 parameter for an string and double.
    *
    * @param nameIn is a string
    * @param priceIn is a double
    */
    
   public OnlineBook(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   
   /**
    * setAuthor() will set the author name.
    * @param authorIn is the author name
    */
    
   public void setAuthor(String authorIn)
   {
      author = authorIn;
   }
   
   /**
    * toString returns the string representation.
    * of the method
    * @return output returns the output
    */
    
   public String toString()
   {
      return name + " - " + author + ": $" + price;
   }
}