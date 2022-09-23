import java.text.DecimalFormat;

/**
  * Octahedron - Project_05.
  * Joshua Kim
  * Date : 9/23/20
 */
 
public class Octahedron
{  
   private String label = "";
   private String color = "";
   private double edge = 0;
   
   /**
    * Constructor uses 2 parameters for label/color/edge.
    * Will be accessed in driver class
    *
    * @param labelLn is a string for the user
    * @param colorLn is also a string for the user
    * @param edgeLn is a double for the user
    */
    
   public Octahedron(String labelLn, String colorLn, double edgeLn)
   {
      setLabel(labelLn);
      setColor(colorLn);
      setEdge(edgeLn);
   }
   
   /**
    * getLabel will return the label string.
    * @return label will return the label
    */
    
   public String getLabel()
   {
      return label;
   }
   
   /**
    * setLabel will check if the label is valid.
    * @return isSet will return the boolean value
    * @param labelLn will check the inputed string
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
    * getColor will return the color string.
    * @return color will return the color
    */

   public String getColor()
   {
      return color;
   }
   
   /**
    * setColor will check if the color is valid.
    * @return isSet will return the boolean value
    * @param colorLn will check the inputed string
    */
    
   public boolean setColor(String colorLn)
   {
      if (colorLn != null)
      {
         color = colorLn.trim();
         return true;
      }
      return false;
   }
   
   /**
    * getEdge will return the edge string.
    * @return edge will return the edge
    */
    
   public double getEdge()
   {
      return edge;
   }
   
   /**
    * setEdge will check if the edge is valid.
    * @return isSet will return the boolean value
    * @param edgeLn will check the inputed string
    */

   public boolean setEdge(double edgeLn)
   {
      boolean isSet = false;
      if (edgeLn >= 0)
      {
         edge = edgeLn;
         isSet = true;
      }
      return isSet;
   }
   
   /**
    * surfaceArea will return the surfaceArea value.
    * @return surfaceArea will return the value
    */
    
   public double surfaceArea()
   {
      double surfaceArea = 2 * Math.sqrt(3) * Math.pow(edge, 2);
      return surfaceArea;
   }
   
   /**
    * volume will return the volume value.
    * @return volume will return the value
    */
    
   public double volume()
   {
      double volume = (Math.sqrt(2) / 3) * Math.pow(edge, 3);
      return volume;
   }
   
   /**
    * surfaceToVolumeRatio will return the ratio value.
    * @return ratio will reutn the value
    */
    
   public double surfaceToVolumeRatio()
   {
      double ratio = surfaceArea() / volume();
      return ratio;
   }
   
   /**
    * The toString method relays a string representation.
    * of object
    * @return output returns the output
    */
    
   public String toString()
   {
      DecimalFormat df = new DecimalFormat("#,##0.0###");
      
      String output = "Octahedron \"" + label + "\" is \"" + color 
         + "\" with 12 edges of length " + edge + " units."
         + "\n\tsurface area = " + df.format(surfaceArea()) + " square units."
         + "\n\tvolume = " + df.format(volume()) + " cubic units."
         + "\n\tsurface/volume ratio = " + df.format(surfaceToVolumeRatio());
         
      return output;
   }
}
       