import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
  * SpherocylinderTest - Project_07B.
  * Joshua Kim
  * Date : 10/22/20
 */
 
public class SpherocylinderTest 
{
   
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * labelTest will test if the getLabel().
    * and setLabel() work
    */
    
   @Test public void labelTest() 
   {
      Spherocylinder s = new Spherocylinder("Ex", 1, 1);
      s.setLabel("ExEx");
      
      Assert.assertEquals("ExEx", s.getLabel());
      Assert.assertEquals(false, s.setLabel(null));
   }
   
   /**
    * radiusTest will test if the getRadius().
    * and setRadius() work
    */
    
   @Test public void radiusTest()
   {
      Spherocylinder s = new Spherocylinder("Ex2", 1, 1);
      s.setRadius(1.2);
      
      Assert.assertEquals(1.2, s.getRadius(), 0.0001);
      Assert.assertEquals(false, s.setRadius(-100));
   }
   
   /**
    * heightTest will test if the getHeight().
    * and setHeight() work
    */
    
   @Test public void heightTest()
   {
      Spherocylinder s = new Spherocylinder("Ex3", 1, 1);
      s.setCylinderHeight(6.9);
      
      Assert.assertEquals(6.9, s.getCylinderHeight(), 0.0001);
      Assert.assertEquals(false, s.setCylinderHeight(-100));
   }
   
   /**
    * circumTest will test if the circumference().
    * works
    */
    
   @Test public void circumTest()
   {
      Spherocylinder s = new Spherocylinder("Ex4", 1, 2);
      Assert.assertEquals(2 * Math.PI * 1, s.circumference(), 0.0001);
   }
   
   /**
    * areaTest will test if the surfaceArea().
    * works
    */
    
   @Test public void areaTest()
   {
      Spherocylinder s = new Spherocylinder("Ex5", 1, 2);
      Assert.assertEquals(2 * 1 * Math.PI 
         * (2 * 1 + 2), s.surfaceArea(), 0.0001);
   }
   
   /**
    * volumeTest will test if the volume().
    * works
    */
    
   @Test public void volumeTest()
   {
      Spherocylinder s = new Spherocylinder("Ex6", 1, 2);
      Assert.assertEquals(Math.PI * Math.pow(1, 2) 
         * ((4 / (double) 3) * 1 + 2), s.volume(), 0.0001);
   }
   
   /**
    * stringTest will test if the toString().
    * works
    */
    
   @Test public void stringTest()
   {
      Spherocylinder s = new Spherocylinder("Ex6", 1, 2);
      Assert.assertTrue(s.toString().contains("\"Ex6\""));
   }
   
   /**
    * countTest will test if the resetCount().
    * and getCount() works.
    */
    
   @Test public void countTest()
   {
      Spherocylinder s = new Spherocylinder("Ex7", 1, 2);
      s.resetCount();
      Assert.assertEquals(0, s.getCount(), 0.0001);
   }
   
   /**
    * equalsTest will test if the equals().
    * works
    */
    
   @Test public void equalsTest()
   {
      Spherocylinder s = new Spherocylinder("Ex", 1, 2);
      Spherocylinder yo = new Spherocylinder("ex", 1, 2);
      Spherocylinder w = new Spherocylinder("yo mama", 1, 2);
      Spherocylinder d = new Spherocylinder("Ex", 1, 3);
      Spherocylinder j = new Spherocylinder("Ex", 2, 2);
      Assert.assertEquals(false, s.equals("Ex"));
      Assert.assertEquals(false, s.equals(d));
      Assert.assertEquals(false, s.equals(j));
      Assert.assertEquals(false, s.equals(w));
      Assert.assertEquals(true, s.equals(yo));
   }

   /**
    * hashTest will test if the hashCode().
    * works
    */
    
   @Test public void hashTest()
   {
      Spherocylinder s = new Spherocylinder("Ex9", 1, 2);
      Assert.assertEquals(0, s.hashCode(), 0.0001);
   }
   
   /**
    * compareToTest1 will test whether.
    * compareTo works when values are equal
    */
    
   @Test public void compareToTest1()
   {
      Spherocylinder s = new Spherocylinder("Ex10", 1, 2);    
      Spherocylinder s2 = new Spherocylinder("Ex11", 1, 2);
      
      Assert.assertEquals(0, s.compareTo(s2));
   }
   
   /**
    * compareToTest1 will test whether.
    * compareTo works when 1st value is less than 2nd
    */
    
   @Test public void compareToTest2()
   {
      Spherocylinder s = new Spherocylinder("Ex12", 1, 2);    
      Spherocylinder s2 = new Spherocylinder("Ex13", 1, 3);
      
      Assert.assertEquals(-1, s.compareTo(s2));
   }
   
   /**
    * compareToTest1 will test whether.
    * compareTo works when 1st value is greater than 2nd
    */
    
   @Test public void compareToTest3()
   {
      Spherocylinder s = new Spherocylinder("Ex14", 1, 3);    
      Spherocylinder s2 = new Spherocylinder("Ex15", 1, 2);
      
      Assert.assertEquals(1, s.compareTo(s2));
   }
}
