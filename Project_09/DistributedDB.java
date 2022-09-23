import java.text.DecimalFormat;

/**
  * Joshua Kim
  * DistributedDB - Project_09.
  * Date : 11/05/20
 */
 
public class DistributedDB extends DB
{
   protected int users;
   protected double costUser;
   
   /**
     * COST_FACTOR is a constant.
     * static bc it is used in a static method
    */
    
   public static final double COST_FACTOR = 1.1;
   
   /**
     * Constructor uses 5 parameter for a string and 3 doubles and 1 int.
     * @param nameIn is a string
     * @param costIn is a double
     * @param tBIn is a double
     * @param usersIn is an int
     * @param costUserIn is a double
    */
    
   public DistributedDB(String nameIn, double costIn, 
      double tBIn, int usersIn, double costUserIn)
   {
      super(nameIn, costIn, tBIn);
      users = usersIn;
      costUser = costUserIn;
   }
   
   /**
     * getNumberOfUsers() gets the number of users.
     * @return users returns users
    */
    
   public int getNumberOfUsers()
   {
      return users;
   }
   
   /**
     * setNumberOfUsers() sets the number of users.
     * @param usersIn is the set users
    */
    
   public void setNumberOfUsers(int usersIn)
   {
      users = usersIn;
   }
   
   /**
     * getCostPerUser() gets the cost per user.
     * @return costUser returns cost per user
    */
    
   public double getCostPerUser()
   {
      return costUser;
   }
   
   /**
     * setCostPerUser() sets the cost per user.
     * @param costUserIn is the set cost per user
    */
    
   public void setCostPerUser(double costUserIn)
   {
      costUser = costUserIn;
   }
   
   /**
     * userCost() returns the total user cost.
     * @return returns the total user cost
    */
    
   public double userCost()
   {
      return users * costUser;
   }
   
   /**
     * getCostFactor() gets the cost factor.
     * @return COST_FACTOR returns the cost factor
    */
    
   public double getCostFactor()
   {
      return COST_FACTOR;
   }
   
   /**
     * monthlyCost() gets the monthly cost.
     * @return creturns the monthly cost
    */
    
   public double monthlyCost()
   {
      return cost + userCost() * DistributedDB.COST_FACTOR;
   }
   
   /**
     * toString() is a string represetation.
     * of the method
     * @return is the returned output
    */
    
   public String toString()
   {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      
      return super.toString() + "\nNumber of Users: " + users
         + "\nCost per User: " + df.format(costUser)
         + "\nUser Cost: " + df.format(userCost())
         + "\nCost Factor: " + getCostFactor();
   }
}