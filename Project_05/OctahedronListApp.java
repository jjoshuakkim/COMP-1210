import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
  * OctahedronListApp - Project_05.
  * Joshua Kim
  * Date : 9/23/20
 */
 
public class OctahedronListApp
{
   /**
     * Program prompts user to input a file.
     * Uses Octehedron and OctahedronList class to determine output
     *
     * @param args Command line arguments (not used)
     * @throws FileNotFoundException throws files that don't have anything
    */
    
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner scan = new Scanner(System.in);
      ArrayList<Octahedron> octList = new ArrayList<Octahedron>();
      
      System.out.print("Enter file name: ");
      String input = scan.nextLine();
      
      Scanner scanFile = new Scanner(new File(input));

      String octListName = scanFile.nextLine();
      while (scanFile.hasNext())
      {
         String label = scanFile.nextLine();
         String color = scanFile.nextLine();
         double edge = Double.parseDouble(scanFile.nextLine());
         
         Octahedron list = new Octahedron(label, color, edge);
         octList.add(list);
      }
      scanFile.close();
      OctahedronList lastOctList = new OctahedronList(octListName, octList);
      
      System.out.println();
      System.out.println(lastOctList);
      System.out.println();
      System.out.println(lastOctList.summaryInfo());
   }
}
      