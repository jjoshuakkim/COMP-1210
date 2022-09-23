import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
  * DistributedDBTest - Project_09.
  * Joshua Kim
  * Date : 11/5/20
 */
 
public class DistributedDBTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
    * testUsersCostandFactor will test.
    * if userCost, monthlyCost, getNumberOfUsers,
    * setNumberOfUsers, and getCostPeruser works.
    */
   @Test public void testUsersCostandFactor() 
   {
      DistributedDB db2 = new DistributedDB("Database Two", 
         2000.0, 7.5, 100, 12.0);
      Assert.assertEquals(1200, db2.userCost(), 0.001);
      Assert.assertEquals(3320, db2.monthlyCost(), 0.001);
      Assert.assertEquals(100, db2.getNumberOfUsers(), 0.001);
      db2.setNumberOfUsers(0);
      Assert.assertEquals(0, db2.getNumberOfUsers(), 0.001);
      Assert.assertEquals(12, db2.getCostPerUser(), 0.001);
      db2.setCostPerUser(0);
      Assert.assertEquals(0, db2.getCostPerUser(), 0.001);
      Assert.assertEquals(1.1, db2.getCostFactor(), 0.001);
   }
   
   /**
    * testToString will test if the toString().
    * works
    */
    
   @Test public void testToString()
   {
      DistributedDB db2 = new DistributedDB("Database Two", 
         2000.0, 7.5, 100, 12.0);
      Assert.assertEquals("Database Two (class DistributedDB) "
               + "Monthly Cost: $3,320.00"
               + "\nStorage: 7.500 TB"
               + "\nBase Cost: $2,000.00"
               + "\nNumber of Users: 100"
               + "\nCost per User: $12.00"
               + "\nUser Cost: $1,200.00"
               + "\nCost Factor: 1.1", db2.toString());
   }
}
