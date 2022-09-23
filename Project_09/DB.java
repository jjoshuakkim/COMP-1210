import java.text.DecimalFormat;

/**
  * Joshua Kim
  * DB - Project_09.
  * Date : 11/05/20
 */
 
public abstract class DB implements Comparable<DB>
{
   protected String name;
   protected double cost;
   protected double tB;
   protected static int count = 0;
   
   /**
     * Constructor uses 3 parameter for a string and 2 doubles.
     * @param nameIn is a string
     * @param costIn is a double
     * @param tBIn is a double
    */
     
   public DB(String nameIn, double costIn, double tBIn)
   {
      name = nameIn;
      cost = costIn;
      tB = tBIn;
      count++;
   }
   
   /**
     * getName() gets the name.
     * @return name returns name
    */
    
   public String getName()
   {
      return name;
   }
   
   /**
     * setName() sets the name.
     * @param nameIn is the set name
    */
    
   public void setName(String nameIn)
   {
      name = nameIn;
   }
   
   /**
     * getBaseCost() gets the cost.
     * @return cost returns cost
    */
    
   public double getBaseCost()
   {
      return cost;
   }
   
   /**
     * setBaseCost() sets the cost.
     * @param costIn is the set cost
    */
    
   public void setBaseCost(double costIn)
   {
      cost = costIn;
   }
   
   /**
     * getDbStorage() gets the storage.
     * @return tB returns tB
    */
    
   public double getDbStorage()
   {
      return tB;
   }
   
   /**
     * setDbStorage() sets the storage.
     * @param tBIn is the set storage
    */
    
   public void setDbStorage(double tBIn)
   {
      tB = tBIn;
   }
   
   /**
     * getCount() gets the Count.
     * @return count returns count
    */
    
   public static int getCount()
   {
      return count;
   }
   
   /**
     * resetCount() resets the count.
    */
    
   public static void resetCount()
   {
      count = 0;
   }
   
   /**
     * toString() is a string represetation.
     * of the method
     * @return is the returned output
    */
    
   public String toString()
   {
      DecimalFormat df = new DecimalFormat("0.000");
      DecimalFormat df2 = new DecimalFormat("$#,##0.00");
      
      return name + " (" + this.getClass() + ") Monthly Cost: " 
         + df2.format(monthlyCost())
         + "\nStorage: " + df.format(tB) + " TB"
         + "\nBase Cost: " + df2.format(cost);
   }
   
   /**
     * monthlyCost() sets the monthlyCost.
     * abstract since it doesn't have a body
     * @return the monthly cost
    */
    
   public abstract double monthlyCost();
   
   public int compareTo(DB exObj)
   {
      return getName().toLowerCase().compareTo(exObj.getName().toLowerCase());
   }
}
   
   