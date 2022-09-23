import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

/**
  * Joshua Kim
  * DBList - Project_10.
  * Date : 11/12/20
 */
 
public class DBList
{
   private DB[] objectsDB;
   private String[] records;
   
   /**
     * Constructor uses no parameters.
     * sets the count for both arrays
    */
    
   public DBList()
   {
      objectsDB = new DB[0];
      records = new String[0];
   }
   
   /**
     * getDBArray() gets the array.
     * @return objectsDB returns the DBarray
    */
    
   public DB[] getDBArray()
   {
      return objectsDB;
   }
   
   /**
     * getInvalidRecordsArray() gets the array.
     * @return records returns the Invalidarray
    */
    
   public String[] getInvalidRecordsArray()
   {
      return records;
   }
   
   /**
     * addDB() adds a db object to the list.
     * @param dBobj is the db objects
    */
    
   public void addDB(DB dBobj)
   {
      objectsDB = Arrays.copyOf(objectsDB, objectsDB.length + 1);
      objectsDB[objectsDB.length - 1] = dBobj;
   }
   
   /**
     * addInvalidRecord() adds a record object.
     * to the list
     * @param recObj is the record object
    */
    
   public void addInvalidRecord(String recObj)
   {
      records = Arrays.copyOf(records, records.length + 1);
      records[records.length - 1] = recObj;
   }
   
   /**
     * readFile will read the file printed.
     * @param fileName is the file you input
     * @throws FileNotFoundException throws empty files
    */
    
   public void readFile(String fileName) throws FileNotFoundException
   {
      Scanner scanFile = new Scanner(new File(fileName));
      
      String name, skip;
      double cost, tB, license, costUser;
      int users;
      
      while (scanFile.hasNext())
      {
         String line = scanFile.nextLine();
         Scanner scan = new Scanner(line);
         scan.useDelimiter(",");
            
         char code = line.charAt(0);
         switch (code)
         {
            case 'C':
               try
               {
                  skip = scan.next();
                  name = scan.next();
                  cost = Double.parseDouble(scan.next());                
                  tB = Double.parseDouble(scan.next());
                  license = Double.parseDouble(scan.next());
                  CentralizedDB dbC = new CentralizedDB(
                     name, cost, tB, license);
                  addDB(dbC);
               }
               
               catch (NumberFormatException e)
               {
                  String result = line + "\n" + e;
                  addInvalidRecord(result);
               }
               
               catch (NoSuchElementException e)
               {
                  String result = line + "\n" + e + ": For missing input data";
                  addInvalidRecord(result);
               }
               
               break;
            
            case 'D':
               try
               {
                  skip = scan.next();
                  name = scan.next();
                  cost = Double.parseDouble(scan.next());
                  tB = Double.parseDouble(scan.next());
                  users = Integer.parseInt(scan.next());
                  costUser = Double.parseDouble(scan.next());
                  DistributedDB dbD = new DistributedDB(
                     name, cost, tB, users, costUser);
                  addDB(dbD);
               }
               
               catch (NumberFormatException e)
               {
                  String result = line + "\n" + e;
                  addInvalidRecord(result);
               }
               
               catch (NoSuchElementException e)
               {
                  String result = line + "\n" + e + ": For missing input data";
                  addInvalidRecord(result);
               }
                  
               break;
                  
            case 'H':
               try
               {
                  skip = scan.next();
                  name = scan.next();
                  cost = Double.parseDouble(scan.next());
                  tB = Double.parseDouble(scan.next());
                  users = Integer.parseInt(scan.next());
                  costUser = Double.parseDouble(scan.next());
                  HomogeneousDB dbH = new HomogeneousDB(
                     name, cost, tB, users, costUser);
                  addDB(dbH);
               }
                
               catch (NumberFormatException e)
               {
                  String result = line + "\n" + e;
                  addInvalidRecord(result);
               }
               
               catch (NoSuchElementException e)
               {
                  String result = line + "\n" + e + ": For missing input data";
                  addInvalidRecord(result);
               }
               
               break;
                  
            case 'E':
               try
               {
                  skip = scan.next();
                  name = scan.next();
                  cost = Double.parseDouble(scan.next());
                  tB = Double.parseDouble(scan.next());
                  users = Integer.parseInt(scan.next());
                  costUser = Double.parseDouble(scan.next());
                  HeterogeneousDB dbE = new HeterogeneousDB(
                     name, cost, tB, users, costUser);
                  addDB(dbE);
               }
               
               catch (NumberFormatException e)
               {
                  String result = line + "\n" + e;
                  addInvalidRecord(result);
               }
               
               catch (NoSuchElementException e)
               {
                  String result = line + "\n" + e + ": For missing input data";
                  addInvalidRecord(result);
               }
                  
               break;
               
            default:
               if (code != 'C' || code != 'D' || code != 'H' || code != 'E')
               {
                  InvalidCategoryException e = 
                     new InvalidCategoryException(String.valueOf(code));
                  String result = line + "\n" + e;
                  addInvalidRecord(result);
               }
               break;
         }
      }
   }
   
   /**
     * generateReport() generates the normal.
     * report 
     * @return output returns the normal report
    */
    
   public String generateReport()
   {
      String output = "-------------------------------"
                     + "\nMonthly Database Report"
                     + "\n-------------------------------\n";
      for (int i = 0; i < objectsDB.length; i++)
      {
         output += objectsDB[i].toString() + "\n\n";
      }
      
      return output;
   }
   
   /**
     * generateReport() generates the report.
     * by name 
     * @return output retuns the name report
    */
    
   public String generateReportByName()
   {
      Arrays.sort(getDBArray());
      String output = "-----------------------------------------"
                     + "\nMonthly Database Report (by Name)"
                     + "\n-----------------------------------------\n";
      
      for (int i = 0; i < objectsDB.length; i++)
      {
         output += objectsDB[i] + "\n\n";
      }
      
      return output;
   }
   
   /**
     * generateReport() generates the report.
     * by monthly cost 
     * @return output returns the monthly cost report
    */
    
   public String generateReportByMonthlyCost()
   {
      DB[] sortCost = objectsDB;
      Arrays.sort(sortCost, new MonthlyCostComparator());
      String output = "-------------------------------------------------"
                     + "\nMonthly Database Report (by Monthly Cost)"
                     + "\n-------------------------------------------------\n";
                     
      for (int i = 0; i < objectsDB.length; i++)
      {
         output += sortCost[i] + "\n\n";
      }
      
      return output;
   }
   
   /**
     * generateInvalidRecordsReport() generates the report.
     * by of invalid records
     * @return output returns the invalid records report
    */
    
   public String generateInvalidRecordsReport()
   {
      String output = "----------------------"
                     + "\nInvalid Records Report\n"
                     + "----------------------\n";
      for (int i = 0; i < records.length; i++)
      {
         output += records[i] + "\n\n";
      }
      
      return output;
   }
}
   