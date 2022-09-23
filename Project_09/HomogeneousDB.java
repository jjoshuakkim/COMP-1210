/**
  * Joshua Kim
  * HomogeneousDB - Project_09.
  * Date : 11/05/20
 */
 
public class HomogeneousDB extends DistributedDB
{

   /**
     * COST_FACTOR is a constant.
     * static bc it is used in a static method
    */
    
   public static final double COST_FACTOR = 1.2;
   
   /**
     * Constructor uses 5 parameter for a string and 3 doubles and 1 int.
     * @param nameIn is a string
     * @param costIn is a double
     * @param tBIn is a double
     * @param usersIn is an int
     * @param costUserIn is a double
    */
    
   public HomogeneousDB(String nameIn, double costIn, 
      double tBIn, int usersIn, double costUserIn)
   {
      super(nameIn, costIn, tBIn, usersIn, costUserIn);
   }
   
   /**
     * getCostFactor() gets the cost factor.
     * @return COST_FACTOR returns the cost factor
    */
    
   public double getCostFactor()
   {
      return HomogeneousDB.COST_FACTOR;
   }
   
   /**
     * monthlyCost() gets the monthly cost.
     * @return creturns the monthly cost
    */
    
   public double monthlyCost()
   {
      return cost + userCost() * HomogeneousDB.COST_FACTOR;
   }
}