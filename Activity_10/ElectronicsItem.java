/**
  * ElectronicsItem - Activity_09.
  * Joshua Kim
  * Date : 11/03/20
 */
 
public class ElectronicsItem extends InventoryItem
{
   protected double weight;
   
   /**
    * SHIPPING_COST is a static because it is.
    * accessed only by the static method
    */
    
   public static final double SHIPPING_COST = 1.5;
   
   /**
    * Constructor uses 3 parameter for an string and 2 doubles.
    *
    * @param nameIn is a string
    * @param priceIn is a double
    * @param weightIn is a double
    */
    
   public ElectronicsItem(String nameIn, double priceIn, double weightIn)
   {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   
   /**
    * calculateCost() will calculate the cost.
    * @return returns the price
    */
    
   public double calculateCost()
   {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}