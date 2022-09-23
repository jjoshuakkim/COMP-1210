import java.text.DecimalFormat;

/**
  * Spherocylinder - Project_07B.
  * Joshua Kim
  * Date : 10/22/20
 */
 
public class Spherocylinder implements Comparable<Spherocylinder>
{
   private String label = "";
   private double radius = 0;
   private double height = 0;
   private static int count = 0;
   
   /**
    * Constructor uses 3 parameter for an string and 2 doubles.
    *
    * @param labelIn is a string
    * @param radiusIn is a double
    * @param heightIn is a double
    */
    
   public Spherocylinder(String labelIn, double radiusIn, double heightIn)
   {
      setLabel(labelIn);
      setRadius(radiusIn);
      setCylinderHeight(heightIn);
      count++;
   }
   
   /**
    * getLabel() will return the label created.
    * @return label returns label
    */
    
   public String getLabel()
   {
      return label;
   }
   
   /**
    * setLabel() will return the if the label is valid.
    * @param labelLn is the inputed value
    * @return if it's valid or not
    */
    
   public boolean setLabel(String labelLn)
   {
      if (labelLn != null)
      {
         label = labelLn.trim();
         return true;
      }
      return false;
   }
   
   /**
    * getRadius() will return the radius created.
    * @return radius returns radius
    */
    
   public double getRadius()
   {
      return radius;
   }
   
   /**
    * setRadius() will return the if the radius is valid.
    * @param radiusLn is the inputed value
    * @return if it's valid or not
    */
    
   public boolean setRadius(double radiusLn)
   {
      if (radiusLn >= 0)
      {
         radius = radiusLn;
         return true;
      }
      return false;
   }
   
   /**
    * getCylinderHeight() will return the height created.
    * @return height returns height
    */
    
   public double getCylinderHeight()
   {
      return height;
   }
   
   /**
    * setCylinderHeight() will return the if the height is valid.
    * @param heightLn is the inputed value
    * @return if it's valid or not
    */
    
   public boolean setCylinderHeight(double heightLn)
   {
      if (heightLn >= 0)
      {
         height = heightLn;
         return true;
      }
      return false;
   }
   
   /**
    * circumference() will return the circumference created.
    * @return returns the circumference
    */
    
   public double circumference()
   {
      return Math.PI * radius * 2;
   }
   
   /**
    * surfaceArea() will return the surface area created.
    * @return returns the surface area
    */
    
   public double surfaceArea()
   {
      return 2 * radius * Math.PI * (2 * radius + height);
   }
   
   /**
    * volume() will return the volume created.
    * @return returns the volume
    */
    
   public double volume()
   {
      return Math.PI * Math.pow(radius, 2) 
         * ((4 / (double) 3) * radius + height);
   }
   
   /**
    * toString returns the string representation.
    * of the method
    * @return output returns the output
    */
    
   public String toString()
   {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "";
      output += "Spherocylinder \"" + getLabel() + "\" with radius "
         + getRadius() + " and cylinder height " 
         + getCylinderHeight() + " has: \n\t"
         + "circumference = " + df.format(circumference()) + " units \n\t"
         + "surface area = " + df.format(surfaceArea()) + " square units \n\t"
         + "volume = " + df.format(volume()) + " cubic units";
         
      return output;
   }
   
   /**
    * getCount() will return the count.
    * static because only accesses count
    * @return count returns count
    */
    
   public static int getCount()
   {
      return count;
   }
   
   /**
    * resetCount will reset the count.
    * static because only accesses count
    */
    
   public static void resetCount()
   {
      count = 0;
   }
   
   /**
    * equals() will return the if the object is valid.
    * @param obj is the inputed value
    * @return if it's valid or not
    */
    
   public boolean equals(Object obj)
   {
      if (!(obj instanceof Spherocylinder))
      {
         return false;
      }
      else
      {
         Spherocylinder d = (Spherocylinder) obj;
         return (label.equalsIgnoreCase(d.getLabel())
            && Math.abs(radius - d.getRadius()) < 0.00001
            && Math.abs(height - d.getCylinderHeight())
               < 0.00001);
      }
   }
   
   /**
    * hashCode() will return the hash code.
    * @return 0 just returns 0
    */
    
   public int hashCode()
   {
      return 0;
   }
   
   /** 
    * compareTo will compare 2 values.
    * @param obj is the obj being compared to
    * @return will return whatever I assigned
    * it to whether it was equal, less than,
    * or greater than.
    */
    
   public int compareTo(Spherocylinder obj)
   {
      if (this.volume() < obj.volume())
      {
         return -1;
      }
      else if (this.volume() > obj.volume())
      {
         return 1;
      }
      else
      {
         return 0;
      }
   }
}
