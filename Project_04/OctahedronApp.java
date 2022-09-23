import java.util.Scanner;

/**
  * OctahedronApp - Project_04.
  * Joshua Kim
  * Date : 9/15/20
 */
 
public class OctahedronApp
{

   /**
     * Program prompts user to input label, color, edge.
     * Uses Octehedron class to determine output
     *
     * @param args Command line arguments (not used)
    */
    
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter label, color, and edge length "
         + "for an octahedron.");
      
      System.out.print("\tlabel: ");
      String label = scan.nextLine();
      
      System.out.print("\tcolor: ");
      String color = scan.nextLine();
      
      System.out.print("\tedge: ");
      double edge = scan.nextDouble();
      
      Octahedron test = new Octahedron(label, color, edge);
      if (edge < 0)
      {
         System.out.println("Error: edge must be non-negative.");
      }
      else
      {
         System.out.println();
         System.out.println(test);
      }
   }
}
      