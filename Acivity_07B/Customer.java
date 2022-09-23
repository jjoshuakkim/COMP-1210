/**
  * Customer - Activity_07B.
  * Joshua Kim
  * Date : 10/19/20
 */
 
public class Customer implements Comparable<Customer>
{
   private String name;
   private String location;
   private double balance;
   
   /**
    * Constructor uses 1 parameter for a string.
    * Will be accessed in test class
    *
    * @param nameIn is a String
    */
    
   public Customer(String nameIn)
   {
      name = nameIn;
      location = "";
      balance = 0;
   }
   
   /**
    * setLocation will set the location.
    * @param locationIn is the location
    */
    
   public void setLocation(String locationIn)
   {
      location = locationIn;
   }
   
   /**
    * setLocation will set the location.
    * @param city is the city
    * @param state is the state
    */
    
   public void setLocation(String city, String state)
   {  
      location = city + ", " + state;
   }
   
   /**
    * changeBalance will change the balance.
    * @param amount is the amount that will change
    */
    
   public void changeBalance(double amount)
   {
      balance += amount;
   }
   
   /**
    * getLocation will get location.
    * @return location returns location
    */
    
   public String getLocation()
   {
      return location;
   }
   
   /**
    * getBalance will get balance.
    * @return balance returns balance
    */
    
   public double getBalance()
   {
      return balance;
   }
   
   /**
    * toString will return string representation.
    * of the method
    * @return returns the output
    */
    
   public String toString()
   {
      return name + "\n" + location + "\n" + "$" + balance;
   }
   
   /** 
    * compareTo will compare 2 values.
    * @param obj is the obj being compared to
    * @return will return whatever I assigned
    * it to whether it was equal, less than,
    * or greater than.
    */
    
   public int compareTo(Customer obj)
   {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001)
      {
         return 0;
      }
      else if (this.balance < obj.getBalance())
      {
         return -1;
      }
      else
      {
         return 1;
      }
   }
}