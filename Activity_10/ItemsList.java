/**
  * ItemsList - Activity_10.
  * Joshua Kim
  * Date : 11/10/20
 */
 
public class ItemsList
{
   private InventoryItem[] inventory;
   private int count;
   
   /**
    * Constructor uses no parameters.
    * sets inventory and count
    */
    
   public ItemsList()
   {
      inventory = new InventoryItem[20];
      count = 0;
   }
   
   /**
    * addItem() will add inventory item.
    * @param itemIn is an inventory item
    */
    
   public void addItem(InventoryItem itemIn)
   {
      inventory[count] = itemIn;
      count++;
   }
   
   /**
    * calculateTotal() will calculate the total.
    * @return total returns the price
    * @param electronicsSubcharge is an electronics charge
    */
    
   public double calculateTotal(double electronicsSubcharge)
   {
      double total = 0;
      for (int i = 0; i < count; i++)
      {
         if (inventory[i] instanceof ElectronicsItem)
         {
            total += inventory[i].calculateCost() + electronicsSubcharge;
         }
         
         else
         {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }
   
   /**
    * toString returns the string representation.
    * of the method
    * @return output returns the output
    */
    
   public String toString()
   {
      String output = "All inventory:\n\n";
      for (int i = 0; i < count; i++)
      {
         output += inventory[i] + "\n";
      }
      
      return output;
   }
}