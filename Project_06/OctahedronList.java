import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
  * OctahedronList - Project_05.
  * Joshua Kim
  * Date : 9/23/20
 */
 
public class OctahedronList
{
   private String list;
   private ArrayList<Octahedron> octahedronObjects 
      = new ArrayList<Octahedron>();
   
   /**
    * Constructor uses 2 parameters for list name and arraylist.
    * Will be accessed in driver class
    *
    * @param listIn is the list name
    * @param octahedronObjectsIn is the arrayList
    */
    
   public OctahedronList(String listIn, 
      ArrayList<Octahedron> octahedronObjectsIn)
   {
      list = listIn;
      octahedronObjects = octahedronObjectsIn;
   }
   
   /**
    * getName will return list name.
    * @return list will return list name
    */
    
   public String getName()
   {
      return list;
   }
   
   /**
    * numberOfOperations return the arraylist size.
    * @return octahedronObjects.size() returns size of arraylist
    */
    
   public int numberOfOctahedrons()
   {
      return octahedronObjects.size();
   }
   
   /**
    * totalSurfaceArea calculates the total surface area.
    * @return result will return the total surface area
    */
    
   public double totalSurfaceArea()
   {
      int index = 0;
      double result = 0;
      while (index < octahedronObjects.size())
      {
         Octahedron area = octahedronObjects.get(index);
         result += area.surfaceArea();
         index++;
      }
      return result;
   }
   
   /**
    * totalVolume calculates the total volume.
    * @return result will return the total volume
    */
    
   public double totalVolume()
   {
      int index = 0;
      double result = 0;
      while (index < octahedronObjects.size())
      {
         Octahedron volume = octahedronObjects.get(index);
         result += volume.volume();
         index++;
      }
      return result;
   }
   
   /**
    * averageSurfaceArea calculates the average surface area.
    * @return av will return the average surface area
    */
    
   public double averageSurfaceArea()
   {
      int index = 0;
      double av = 0;
      while (index < octahedronObjects.size())
      {
         Octahedron average = octahedronObjects.get(index);
         av = totalSurfaceArea() / octahedronObjects.size();
         
         index++;
      }
      return av;
   }
   
   /**
    * averageVolume calculates the average volume.
    * @return av will return the average volume
    */
    
   public double averageVolume()
   {
      int index = 0;
      double av = 0;
      while (index < octahedronObjects.size())
      {
         Octahedron average = octahedronObjects.get(index);
         av = totalVolume() / octahedronObjects.size();
         
         index++;
      }
      return av;
   }
   
   /**
    * averageSurfaceToVolumeRatio calculates the average ratio.
    * @return av will return the average ratio
    */
    
   public double averageSurfaceToVolumeRatio()
   {
      int index = 0;
      double result = 0;
      double av = 0;
      while (index < octahedronObjects.size())
      {
         Octahedron average = octahedronObjects.get(index);
         result += average.surfaceToVolumeRatio();
         av = result / octahedronObjects.size();
         
         index++;
      }
      return av;
   }
   
   /**
    * The toString method relays a string representation.
    * of object
    * @return output returns the output
    */
    
   public String toString()
   {
      int index = 0;
      String output = "";
      
      while (index < octahedronObjects.size())
      {
         output += "\n" + octahedronObjects.get(index).toString() + "\n";
         index++;
      }
      
      String list1 = list + output;
      return list + "\n" + output;
   }
   
   /**
    * summaryInfo will return the summary info.
    * @return output returns the summary info
    */
    
   public String summaryInfo()
   {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      
      String output = "";
      output += "----- Summary for " + list + " -----"
         + "\nNumber of Octahedrons: " + octahedronObjects.size()
         + "\nTotal Surface Area: " + df.format(totalSurfaceArea())
         + "\nTotal Volume: " + df.format(totalVolume())
         + "\nAverage Surface Area: " + df.format(averageSurfaceArea())
         + "\nAverage Volume: " + df.format(averageVolume())
         + "\nAverage Surface/Volume Ratio: " 
            + df.format(averageSurfaceToVolumeRatio());
      
      return output;
   }
   
   /**
    * getList() returns the list.
    * @return octahedronObject returns the list
    */
    
   public ArrayList<Octahedron> getList()
   {
      return octahedronObjects;
   }
   
   /**
    * readFile reads the file and returns the string.
    * representation of the output
    * @return octList2 returns the output
    * @param fileNameIn is the name of the file
    * @throws FileNotFoundException discards empty files
    */
    
   public OctahedronList readFile(String fileNameIn) 
      throws FileNotFoundException
   {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      ArrayList<Octahedron> octList = new ArrayList<>();
      
      list = scanFile.nextLine();
      while (scanFile.hasNext())
      {
         String label = scanFile.nextLine();
         String color = scanFile.nextLine();
         double edge = Double.parseDouble(scanFile.nextLine());
         
         Octahedron list2 = new Octahedron(label, color, edge);
         octahedronObjects.add(list2);
      }
      
      OctahedronList octList2 = new OctahedronList(list, octahedronObjects);
      return octList2;
   }     
   
   /**
    * addOctahedron makes a new octahedron object.
    * takes 3 parameters
    * @param labelNO is the label
    * @param colorNO is the color
    * @param edgeNO is the edge
    */

   public void addOctahedron(String labelNO, String colorNO, double edgeNO)
   {
      Octahedron newList = new Octahedron(labelNO, colorNO, edgeNO);
      octahedronObjects.add(newList);
   }
   
   /**
    * findOctahedron will find the requested octahedron.
    * @param label is the label trying to be found
    * @return null returns nothing
    */

   public Octahedron findOctahedron(String label)
   {
      for (int i = 0; i < octahedronObjects.size(); i++)
      {
         if (octahedronObjects.get(i).getLabel().equalsIgnoreCase(label))
         {
            return octahedronObjects.get(i);
         }
      }
      return null;
   }
   
   /**
    * deleteOctahedron will delete the requested octahedron.
    * @param label is the label trying to be deleted
    * @return null returns nothing
    */
    
   public Octahedron deleteOctahedron(String label)
   {
      for (int i = 0; i < octahedronObjects.size(); i++)
      {  
         if (octahedronObjects.get(i).getLabel().equalsIgnoreCase(label))
         {
            return octahedronObjects.remove(i);
         }
      }
      return null;
   }  
   
   /**
    * findOctahedron will edit the requested octahedron.
    * @param label is the label of the object we are editing
    * @param color is the color we are editing
    * @param edge is the edge we are editing
    * @return null returns nothing
    */
    
   public Octahedron editOctahedron(String label, String color, double edge)
   {
      for (int i = 0; i < octahedronObjects.size(); i++)
      {
         if (octahedronObjects.get(i).getLabel().equalsIgnoreCase(label))
         {
            octahedronObjects.get(i).setColor(color);
            octahedronObjects.get(i).setEdge(edge);
            return octahedronObjects.get(i);
         }
      }
      return null;
   }
}