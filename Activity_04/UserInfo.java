/**
  * UserInfo - Activity_04.
  * Joshua Kim
  * Date : 9/14/20
 */
public class UserInfo
{
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
   
   // constructor
   /**
    * Constructor uses 2 parameters for first/last name.
    * Will be accessed in driver class
    *
    * @param firstNameIn is a string for the user
    * @param lastNameIn is also a string for the user
    */
    
   public UserInfo(String firstNameIn, String lastNameIn)
   {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   
   /**
    * The toString90 method relays a string representation.
    * of object
    * @return output
    */
    
   public String toString()
   {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE)
      {
         output += "Offline";
      }
      else
      {
         output += "Online";
      }
      return output;
   }
   
   /**
    * setLocation will set our variable into.
    * the parameter the user inputs.
    * @param locationIn user sets the location here
    */
    
   public void setLocation(String locationIn)
   {
      location = locationIn;
   }
   
   /**
    * setAge will set our variable into.
    * the parameter the user inputs
    * but veries that it is greater than 0.
    * @param ageIn allows user to set age
    * @return isSet returns boolean value
    */
    
   public boolean setAge(int ageIn)
   {
      boolean isSet = false;
      if (ageIn > 0)
      {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   
   /**
    * getAge is used to return the age that.
    * the user manipulates
    * @return age returns the age that was set
    */
    
   public int getAge()
   {
      return age;
   }
   
   /**
    * getLocation is used to return the location that.
    * the user manipulates
    * @return location returns location that was set
    */
    
   public String getLocation()
   {
      return location;
   }
   
   /**
    * logOff will set that status variable.
    * into OFFLINE
    */
    
   public void logOff()
   {
      status = OFFLINE;
   }
   
   /**
    * logOff will set that status variable.
    * into OFFLINE
    */
    
   public void logOn()
   {
      status = ONLINE;
   }
}