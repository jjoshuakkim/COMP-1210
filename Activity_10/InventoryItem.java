/**
  * InventoryItem - Activity_09.
  * Joshua Kim
  * Date : 11/03/20
 */
 
public class InventoryItem
{
   protected String name;
   protected double price;
   private static double taxRate = 0;
   
   /**
    * Constructor uses 2 parameter for an string and double.
    *
    * @param nameIn is a string
    * @param priceIn is a double
    */
    
   public InventoryItem(String nameIn, double priceIn)
   {
      name = nameIn;
      price = priceIn;
   }
   
   /**
    * getName() will return the name created.
    * @return name returns name
    */
    
   public String getName()
   {
      return name;
   }
   
   /**
    * calculateCost() will calculate the cost.
    * @return returns the price
    */
    
   public double calculateCost()
   {
      return price * (1 + taxRate);
   }
   
   /**
    * setTaxRate() will set the tax rate.
    * static since it accesses the static variable
    * @param taxRateIn is the tax rate
    */
    
   public static void setTaxRate(double taxRateIn)
   {
      taxRate = taxRateIn;
   }
   
   /**
    * toString returns the string representation.
    * of the method
    * @return output returns the output
    */
    
   public String toString()
   {
      return name + ": $" +  calculateCost();
   }
}