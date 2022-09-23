/**
  * OnlineTextItem - Activity_09.
  * Joshua Kim
  * Date : 11/03/20
 */
 
public abstract class OnlineTextItem extends InventoryItem
{
   /**
    * Constructor uses 2 parameter for an string and double.
    *
    * @param nameIn is a string
    * @param priceIn is a double
    */
    
   public OnlineTextItem(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
   }
   
   /**
    * calculateCost() will calculate the cost.
    * @return returns the price
    */
    
   public double calculateCost()
   {
      return price;
   }
}