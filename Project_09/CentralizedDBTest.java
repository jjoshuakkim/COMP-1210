import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
  * CentralizedDBTest - Project_09.
  * Joshua Kim
  * Date : 11/5/20
 */
 
public class CentralizedDBTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
    * testGetName will test if the getName().
    * and setName() work
    */
    
   @Test public void testGetName() 
   {
      CentralizedDB test = new CentralizedDB("hello", 1, 1, 1);
      Assert.assertEquals("hello", test.getName());
      test.setName("bye");
      Assert.assertEquals("bye", test.getName());
   }
   
   /**
    * testGetBaseCostAndStorageAndCount will test.
    * if getCost, setCost, getDbStorage, setDbStorage
    * getCount, and resetCount work.
    */
    
   @Test public void testGetBaseCostAndStorageAndCount()
   {
      CentralizedDB test = new CentralizedDB("hello", 1, 2, 3);
      Assert.assertEquals(1, test.getBaseCost(), 0.001);
      test.setBaseCost(2);
      Assert.assertEquals(2, test.getBaseCost(), 0.001);
      Assert.assertEquals(2, test.getDbStorage(), 0.001);
      test.setDbStorage(3);
      Assert.assertEquals(3, test.getDbStorage(), 0.001);
      Assert.assertEquals(2, test.getCount(), 0.001);
      test.resetCount();
      Assert.assertEquals(0, test.getCount(), 0.001);
   }
   
   /**
    * testToString will test if the toString().
    * works
    */
    
   @Test public void testToString()
   {
      CentralizedDB db1 = new CentralizedDB("Database One", 
         1200.0, 5.00, 1500.0);
      Assert.assertEquals("Database One (class Cen"
            + "tralizedDB) Monthly Cost: $2,700.00"
            + "\nStorage: 5.000 TB"
            + "\nBase Cost: $1,200.00"
            + "\nLicense: $1,500.00", db1.toString());
   }
   
   /**
    * testMonthlyCost will test if the monthlyCost().
    * works
    */
    
   @Test public void testMonthlyCost()
   {
      CentralizedDB db1 = new CentralizedDB("Database One", 
         1200.0, 5.00, 1500.0);
      Assert.assertEquals(2700, db1.monthlyCost(), 0.001);
   }
   
   /**
    * testLicense will test if the getLicense().
    * and setLicense() works
    */
    
   @Test public void testLicense()
   {
      CentralizedDB db1 = new CentralizedDB("Database One", 
         1200.0, 5.00, 1500.0);
      Assert.assertEquals(1500, db1.getLicense(), 0.001);
      db1.setLicense(0);
      Assert.assertEquals(0, db1.getLicense(), 0.001);
   }
}
