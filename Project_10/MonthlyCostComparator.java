import java.util.Comparator;

/**
  * Joshua Kim
  * MonthlyCostComparator - Project_11.
  * Date : 11/19/20
 */
 
public class MonthlyCostComparator implements Comparator<DB>
{
   /**
     * Constructor uses 2 parameters.
     * @param d1 is a db object
     * @param d2 is a db object
     * @return returns the integer of compare
    */
    
   public int compare(DB d1, DB d2)
   {
      if (d1.monthlyCost() > d2.monthlyCost())
      {
         return -1;
      }
      
      else if (d1.monthlyCost() < d2.monthlyCost())
      {
         return 1;
      }
      
      else
      {
         return 0;
      }
   }
}