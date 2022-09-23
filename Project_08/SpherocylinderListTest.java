import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
  * SpherocylinderListTest - Project_08.
  * Joshua Kim
  * Date : 10/30/20
 */
 
public class SpherocylinderListTest 
{
   private Spherocylinder[] hello = new Spherocylinder[10];
   private int size = 0;

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * testGetName will test if the getName().
    * and numberOfSpherocylinders() work
    */
    
   @Test public void testGetName() 
   {
      SpherocylinderList wassup = new SpherocylinderList("gg", hello, 3);
      Assert.assertEquals(wassup.getName(), "gg");
      Assert.assertEquals(wassup.numberOfSpherocylinders(), 3);
   }
   
   /**
    * testGetList will test if the getList().
    * works
    */
    
   @Test public void testGetList()
   {
      Spherocylinder[] sph = new Spherocylinder[10];
      SpherocylinderList ex = new SpherocylinderList("Ex", sph, 0);
      
      Assert.assertArrayEquals(sph, ex.getList());
   }
   
   /**
    * testGetNum will test if the numberOfSpherocylinders().
    * is 0 if empty
    */
    
   @Test public void testGetNum()
   {
      Spherocylinder[] sph = new Spherocylinder[10];
      SpherocylinderList ex = new SpherocylinderList("Ex", sph, 0);
      Assert.assertEquals(ex.numberOfSpherocylinders(), 0);
   }
   
   /**
    * testTotalArea will test if the totalSurfaceArea().
    * works
    */
    
   @Test public void testTotalArea()
   {
      Spherocylinder[] sph = new Spherocylinder[10];
      Spherocylinder example1 = 
         new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder example2 = 
         new Spherocylinder(" Medium Example ", 10.8, 10.1);
      Spherocylinder example3 = 
         new Spherocylinder("Large Example", 98.32, 99.0);
      sph[0] = example1;
      sph[1] = example2;
      sph[2] = example3;
      
      SpherocylinderList test = new SpherocylinderList("test", sph, 3);
      
      Assert.assertEquals(184790.426, test.totalSurfaceArea(), 0.001);
   }
   
   /**
    * testTotalArea will test if the totalSurfaceArea().
    * is 0 if empty
    */
    
   @Test public void testTotalArea2()
   {
      Spherocylinder[] sph = new Spherocylinder[10];
      SpherocylinderList test = new SpherocylinderList("test", sph, 0);
      Assert.assertEquals(0, test.totalSurfaceArea(), 0.001);
   }
   
   /**
    * testTotalVolume will test if the totalVolume().
    * works
    */
    
   @Test public void testTotalVolume()
   {
      Spherocylinder[] sph = new Spherocylinder[10];
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder example2 = 
         new Spherocylinder(" Medium Example ", 10.8, 10.1);
      Spherocylinder example3 = 
         new Spherocylinder("Large Example", 98.32, 99.0);
      sph[0] = example1;
      sph[1] = example2;
      sph[2] = example3;
      
      SpherocylinderList test = new SpherocylinderList("test", sph, 3);
      
      Assert.assertEquals(6996733.041, test.totalVolume(), 0.001);
   }
   
   /**
    * testTotalVolume2 will test if the totalVolume().
    * is 0 if empty
    */
    
   @Test public void testTotalVolume2()
   {
      Spherocylinder[] sph = new Spherocylinder[10];
      SpherocylinderList test = new SpherocylinderList("test", sph, 0);
      Assert.assertEquals(0, test.totalVolume(), 0.001);
   }
   
   /**
    * testAverageVolume will test if the totalVolume().
    * works
    */
    
   @Test public void testAverageVolume()
   {
      Spherocylinder[] sph = new Spherocylinder[10];
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder example2 = 
         new Spherocylinder(" Medium Example ", 10.8, 10.1);
      Spherocylinder example3 = 
         new Spherocylinder("Large Example", 98.32, 99.0);
      sph[0] = example1;
      sph[1] = example2;
      sph[2] = example3;
      
      SpherocylinderList test = new SpherocylinderList("test", sph, 3);
      
      Assert.assertEquals(2332244.347, test.averageVolume(), 0.001);
   }
   
   /**
    * testAverageVolume2 will test if the averageVolume().
    * is 0 if empty
    */
    
   @Test public void testAverageVolume2()
   {
      Spherocylinder[] sph = new Spherocylinder[10];
      SpherocylinderList test = new SpherocylinderList("test", sph, 0);
      Assert.assertEquals(0, test.averageVolume(), 0.001);
   }
   
   /**
    * testAverageArea will test if the averageSurfaceArea().
    * works
    */
    
   @Test public void testAverageArea()
   {
      Spherocylinder[] sph = new Spherocylinder[10]; 
      SpherocylinderList test = new SpherocylinderList("test", sph, 0);
      test.addSpherocylinder("Small Example", 0.5, 0.25);
      test.addSpherocylinder(" Medium Example ", 10.8, 10.1);
      test.addSpherocylinder("Large Example", 98.32, 99.0);
      
      Assert.assertEquals(61596.809, test.averageSurfaceArea(), 0.001);
   }
   
   /**
    * testAverageArea will test if the averageSurfaceArea().
    * is 0 if empty
    */
    
   @Test public void testAverageArea2()
   {
      Spherocylinder[] sph = new Spherocylinder[10];
      SpherocylinderList test = new SpherocylinderList("test", sph, 0);
      Assert.assertEquals(0, test.averageSurfaceArea(), 0.001);
   }
   
   /**
    * testToString will test if the toString().
    * works
    */
    
   @Test public void testToString()
   {
      Spherocylinder[] sph = new Spherocylinder[10];
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder example2 = 
         new Spherocylinder(" Medium Example ", 10.8, 10.1);
      Spherocylinder example3 = 
         new Spherocylinder("Large Example", 98.32, 99.0);
      sph[0] = example1;
      sph[1] = example2;
      sph[2] = example3;
      
      SpherocylinderList test = new SpherocylinderList("test", sph, 3);
      Assert.assertEquals("----- Summary for test -----"
                     + "\nNumber of Spherocylinders: 3"
                     + "\nTotal Surface Area: 184,790.426"
                     + "\nTotal Volume: 6,996,733.041"
                     + "\nAverage Surface Area: 61,596.809"
                     + "\nAverage Volume: 2,332,244.347", test.toString());
   }
   
   /**
    * testFindSpherocylinder will test if the findSpherocylinder().
    * works
    */
    
   @Test public void testFindSpherocylinder()
   {
      Spherocylinder[] sph = new Spherocylinder[10];
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder example2 = 
         new Spherocylinder(" Medium Example ", 10.8, 10.1);
      Spherocylinder example3 = 
         new Spherocylinder("Large Example", 98.32, 99.0);
      sph[0] = example1;
      sph[1] = example2;
      sph[2] = example3;
      Spherocylinder[] fakeTest = {example1, example2, example3};
      
      SpherocylinderList test = new SpherocylinderList("test", sph, 3);
      Assert.assertEquals(example1, test.findSpherocylinder("Small Example"));
         
      Assert.assertEquals(null, test.findSpherocylinder("bruh"));
   }
   
   /**
    * testDeleteSpherocylinder will test if the deleteSpherocylinder().
    * works
    */
    
   @Test public void testDeleteSpherocylinder()
   {
      Spherocylinder[] sph = new Spherocylinder[10];
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder example2 = 
         new Spherocylinder(" Medium Example ", 10.8, 10.1);
      Spherocylinder example3 = 
         new Spherocylinder("Large Example", 98.32, 99.0);
      sph[0] = example1;
      sph[1] = example2;
      sph[2] = example3;
      Spherocylinder[] fakeTest = {example1, example2, example3};
      
      SpherocylinderList test = new SpherocylinderList("test", sph, 3);
      Assert.assertEquals(example1, test.deleteSpherocylinder("Small Example"));
         
      Assert.assertEquals(null, test.deleteSpherocylinder("bruh"));
   }
   
   /**
    * testEditSpherocylinder will test if the editSpherocylinder().
    * works
    */
    
   @Test public void testEditSpherocylinder()
   {
      Spherocylinder[] sph = new Spherocylinder[10];
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder example2 = 
         new Spherocylinder(" Medium Example ", 10.8, 10.1);
      Spherocylinder example3 = 
         new Spherocylinder("Large Example", 98.32, 99.0);
      sph[0] = example1;
      sph[1] = example2;
      sph[2] = example3;
      
      SpherocylinderList test = new SpherocylinderList("test", sph, 3);
      Assert.assertEquals(true, test.editSpherocylinder("Small Example", 1, 1));
      Assert.assertEquals(false, test.editSpherocylinder("bruh", 1, 1));
   }
   
   /**
    * testFindSpherocylinderWithLargestVolumeTest will test if. 
    * the findSpherocylinderWithLargestVolumeTest
    * works
    */
    
   @Test public void testFindSpherocylinderWithLargestVolumeTest()
   {
      Spherocylinder[] sph = new Spherocylinder[10];
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder example2 = 
         new Spherocylinder(" Medium Example ", 10.8, 10.1);
      Spherocylinder example3 = 
         new Spherocylinder("Large Example", 98.32, 99.0);
      sph[0] = example1;
      sph[1] = example2;
      sph[2] = example3;
      Spherocylinder[] fakeTest = {example2, example1, example3};
      
      SpherocylinderList test = new SpherocylinderList("test", fakeTest, 3);
      Assert.assertEquals(example3, test.findSpherocylinderWithLargestVolume());
   }
   
   /**
    * testFindSpherocylinderWithLargestVolumeTest will test if. 
    * the findSpherocylinderWithLargestVolumeTest
    * works if it returns null
    */
    
   @Test public void testFindSpherocylinderWithLargestVolumeTest4()
   {
      Spherocylinder[] sph = new Spherocylinder[10];
      SpherocylinderList test = new SpherocylinderList("test", sph, 0);
      Assert.assertEquals(null, test.findSpherocylinderWithLargestVolume());
   }
}