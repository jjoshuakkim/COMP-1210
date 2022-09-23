/**
  * ItemsListApp - Activity_10.
  * Joshua Kim
  * Date : 11/10/20
 */
 
public class InventoryListApp
{

   /**  	
      * Drive class to direct the output.  	
      * manipulated using the child methods
      *
      * @param args Command line arguments (not used)
     */
     
   public static void main(String[] args)
   { 
      InventoryItem.setTaxRate(0.05);
      ItemsList myItems = new ItemsList();
      
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      
      System.out.println(myItems);
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   }
}