/**
  * InventoryApp - Activity_09.
  * Joshua Kim
  * Date : 11/03/20
 */
 
public class InventoryApp
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
      
      InventoryItem item1 = new InventoryItem("Oil change kit", 39);
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 80, 1.8);
      OnlineArticle item3 = new OnlineArticle("Java news", 8.50);
      item3.setWordCount(700);
      OnlineBook item4 = new OnlineBook("Java for noobs", 13.37);
      item4.setAuthor("L. G. Jones");
      
      System.out.println(item1);
      System.out.println(item2);
      System.out.println(item3);
      System.out.println(item4);
   }
}