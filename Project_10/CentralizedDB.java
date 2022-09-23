import java.text.DecimalFormat;

/**
  * Joshua Kim
  * CentralizedDB - Project_11.
  * Date : 11/19/20
 */
 
public class CentralizedDB extends DB
{
   private double license;
   
   /**
     * Constructor uses 4 parameter for a string and 3 doubles.
     * @param nameIn is a string
     * @param costIn is a double
     * @param tBIn is a double
     * @param licenseIn is a double
    */
    
   public CentralizedDB(String nameIn, double costIn, 
      double tBIn, double licenseIn)
   {
      super(nameIn, costIn, tBIn);
      license = licenseIn;
   }
   
   /**
     * getLicense() gets the license.
     * @return license returns license
    */
    
   public double getLicense()
   {
      return license;
   }
   
   /**
     * setLicense() sets the license.
     * @param licenseIn is the set license
    */
    
   public void setLicense(double licenseIn)
   {
      license = licenseIn;
   }
   
   /**
     * monthlyCost() sets the monthlyCost.
     * @return the monthly cost
    */
    
   public double monthlyCost()
   {
      return cost + license;
   }
   
   /**
     * toString() is a string represetation.
     * of the method
     * @return is the returned output
    */
    
   public String toString()
   {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      return super.toString() + "\nLicense: " + df.format(license);
   }
}