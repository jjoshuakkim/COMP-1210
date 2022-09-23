import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
  * HeterogeneousDBTest - Project_09.
  * Joshua Kim
  * Date : 11/5/20
 */
public class HeterogeneousDBTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * testCostFactorAndMonthlyCost will test.
    * if getCostFactor and monthlyCost works
    */
    
   @Test public void testCostFactorAndMonthlyCost() 
   {
      HeterogeneousDB db3 = new HeterogeneousDB("Database Three", 
         2000, 7.5, 100, 14.0);
      Assert.assertEquals(1.3, db3.getCostFactor(), 0.001);
      Assert.assertEquals(3820, db3.monthlyCost(), 0.001);
   }
}
