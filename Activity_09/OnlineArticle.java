/**
  * OnlineArticle - Activity_09.
  * Joshua Kim
  * Date : 11/03/20
 */
 
public class OnlineArticle extends OnlineTextItem
{
   private int wordCount;
   
   /**
    * Constructor uses 2 parameter for an string and double.
    *
    * @param nameIn is a string
    * @param priceIn is a double
    */
    
   public OnlineArticle(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   
   /**
    * setWordCount() will set the word count.
    * @param wordCountIn is the word count
    */
    
   public void setWordCount(int wordCountIn)
   {
      wordCount = wordCountIn;
   }
}