import java.text.DecimalFormat;

/**
  * SpherocylinderList - Project_08.
  * Joshua Kim
  * Date : 10/30/20
 */
 
public class SpherocylinderList
{
   private String name;
   private Spherocylinder[] array;
   private int num;
   
   /**
    * Constructor uses 3 parameter for an string, int, and array.
    *
    * @param nameIn is a string
    * @param arrayIn is an array
    * @param numIn is an int
    */
    
   public SpherocylinderList(String nameIn, Spherocylinder[] arrayIn, int numIn)
   {
      name = nameIn;
      array = arrayIn;
      num = numIn;
   }
   
   /**
    * getName() will return the name created.
    * @return name returns name
    */
    
   public String getName()
   {
      return name;
   }
   
   /**
    * numberOfSpherocylinders() will return the number created.
    * @return num returns num
    */
    
   public int numberOfSpherocylinders()
   {
      return num;
   }
   
   /**
    * totalSurfaceArea calculates the total surface area.
    * @return result will return the total surface area
    */
    
   public double totalSurfaceArea()
   {
      int index = 0;
      double result = 0;
      while (index < num)
      {
         Spherocylinder area = array[index];
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
      while (index < num)
      {
         Spherocylinder volume = array[index];
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
      while (index < num)
      {    
         Spherocylinder average = array[index];
         av = totalSurfaceArea() / num;
         
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
      while (index < num)
      {
         Spherocylinder average = array[index];
         av = totalVolume() / num;
         
         index++;
      }
      return av;
   }
   
   /**
    * toString() will return the summary info.
    * @return output returns the summary info
    */
    
   public String toString()
   {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      
      String output = "";
      output += "----- Summary for " + name + " -----"
         + "\nNumber of Spherocylinders: " + num
         + "\nTotal Surface Area: " + df.format(totalSurfaceArea())
         + "\nTotal Volume: " + df.format(totalVolume())
         + "\nAverage Surface Area: " + df.format(averageSurfaceArea())
         + "\nAverage Volume: " + df.format(averageVolume());
      
      return output;
   }
   
   /**
    * getList() will return the list created.
    * @return array returns array
    */
    
   public Spherocylinder[] getList()
   {
      return array;
   }
   
   /**
    * addSpherocylinder makes a new spherocylinder object.
    * takes 3 parameters
    * @param label is the label
    * @param radius is the radius
    * @param height is the height
    */

   public void addSpherocylinder(String label, double radius, double height)
   {
      Spherocylinder newSph = new Spherocylinder(label, radius, height);
      array[num] = newSph; 
      num++; 
   }
   
   /**
    * findSpherocylinder will find the requested spherocylinder.
    * @param label is the label trying to be found
    * @return null returns nothing
    */

   public Spherocylinder findSpherocylinder(String label)
   {
      for (int i = 0; i < num; i++)
      {
         if (array[i].getLabel().equalsIgnoreCase(label))
         {
            return array[i];
         }
      }
      return null;
   }
   
   /**
    * deleteSpherocylinder will delete the requested spherocylinder.
    * @param label is the label trying to be deleted
    * @return null returns nothing
    */
    
   public Spherocylinder deleteSpherocylinder(String label)
   {
      Spherocylinder temp = null;
      for (int i = 0; i < num; i++)
      {  
         if (label.equalsIgnoreCase(array[i].getLabel()))
         {
            temp = array[i];
            for (int j = i; j < num - 1; j++)
            {
               array[j] = array[j + 1];
            }
            array[num - 1] = null;
            num--;
            return temp;
         }
      }
      return null;
   }  
   
   /**
    * editSpherocylinder will edit the requested spherocylinder.
    * @param label is the label of the object we are editing
    * @param radius is the radius we are editing
    * @param height is the height we are editing
    * @return null returns nothing
    */
    
   public boolean editSpherocylinder(String label, double radius, double height)
   {
      for (int i = 0; i < num; i++)
      {
         if (array[i].getLabel().equalsIgnoreCase(label))
         {
            array[i].setRadius(radius);
            array[i].setCylinderHeight(height);
            return true;
         }
      }
      return false;
   }
   
   /**
    * findSpherocylinderWithLargestVolume will.
    * find the requested spherocylinder
    * with largest volume
    * @return array[0] returns largest spherocylinder
    */
   public Spherocylinder findSpherocylinderWithLargestVolume()
   {
      double largest = 0;
      Spherocylinder fake = new Spherocylinder("", 0, 0);
      if (num != 0)
      {
         for (int i = 0; i < num; i++)
         {
            if (largest < array[i].volume())
            {
               largest = array[i].volume();
               fake = array[i];
            }
         }
         return fake;
      }
      return null;
   }
}