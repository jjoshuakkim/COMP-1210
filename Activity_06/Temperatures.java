import java.util.ArrayList;

/**
  * Temperatures - Activity_06.
  * Joshua Kim
  * Date : 9/29/20
 */
 
public class Temperatures
{
   private ArrayList<Integer> temperatures;
   
   /**
    * Constructor uses 1 parameter for an ArrayList.
    * Will be accessed in driver class
    *
    * @param temperaturesIn is an ArrayList
    */
    
   public Temperatures(ArrayList<Integer> temperaturesIn)
   {
      temperatures = temperaturesIn;
   }
   
   /**
    * getLowTemp will return the lowest temperature.
    * @return low will return the lowest temperature
    */
    
   public int getLowTemp()
   {
      if (temperatures.isEmpty())
      {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++)
      {
         if (temperatures.get(i) < low)
         {
            low = temperatures.get(i);
         }
      }
      return low;
   }
   
   /**
    * getHighTemp will return the highest temperature.
    * @return high return the highest temperature
    */
    
   public int getHighTemp()
   {
      if (temperatures.isEmpty())
      {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer current : temperatures)
      {
         if (current > high)
         {
            high = current;
         }
      }
      return high;
   }
   
   /**
    * lowerMinimum will return the lowest temperature.
    * when comparing with the inputed temperature
    * @param lowIn will take in an inputed value
    * @return lowIn will return the lowest temperature
    */
    
   public int lowerMinimum(int lowIn)
   {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   
   /**
    * higherMaximum will return the highest temperature.
    * when comparing with the inputed temperature
    * @param highIn will take in an inputed value
    * @return highIn will return the highest temperature
    */
    
   public int higherMaximum(int highIn)
   {
      return highIn < getHighTemp() ? highIn : getHighTemp();
   }
   
   /**
    * toString() will return the String representation.
    * of the object.
    * @return will return the temperatures
    * and low and high temperatures
    */
    
   public String toString()
   {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
}