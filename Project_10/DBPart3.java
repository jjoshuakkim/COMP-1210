import java.io.FileNotFoundException;
import java.io.IOException;

/**
  * Joshua Kim
  * DBPart3 - Project_11.
  * Date : 11/19/20
 */

public class DBPart3
{
   /**
     * Prints report normally, by name, and by monthly.
     * cost
     * @param args not used
     * @throws FileNotFoundException throws empty files
    */
    
   public static void main(String[] args)
   {
      String fileName = "";
      if (args.length != 0)
      {
         try
         {
            DBList db1 = new DBList();
            fileName = args[0];
            db1.readFile(fileName);
         
            System.out.print(db1.generateReport());
            System.out.print(db1.generateReportByName());
            System.out.print(db1.generateReportByMonthlyCost());
            System.out.print(db1.generateInvalidRecordsReport());
         }
         
         catch (IOException e)
         {
            System.out.println("*** Attempted to read file: " 
               + fileName + " (No such file or directory)");
         }
      }
      
      else
      {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      }
   }
}