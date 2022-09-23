import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

/**
  * OctahedronListMenuApp - Project_06.
  * Joshua Kim
  * Date : 9/30/20
 */
 
public class OctahedronListMenuApp
{

   /**
     * Program prompts user to input a case which will.
     * be manipulated in the octahedronList class
     * depending on what the user inputs
     *
     * @param args Command line arguments (not used)
     * @throws FileNotFoundException discards empty files
    */
    
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner scan = new Scanner(System.in);
      ArrayList<Octahedron> list = new ArrayList<>();
      String octName = "*** no list name assigned ***";
      OctahedronList octList = new OctahedronList(octName, list);
      String input = "";
      String label = "";
      String color = "";
      double edge = 0;
      
      System.out.println("Octahedron List System Menu "
         + "\nR - Read File and Create Octahedron List"
         + "\nP - Print Octahedron List"
         + "\nS - Print Summary"
         + "\nA - Add Octahedron"
         + "\nD - Delete Octahedron"
         + "\nF - Find Octahedron"
         + "\nE - Edit Octahedron"
         + "\nQ - Quit");
      
      char code = 'Q';
      do
      {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine().toUpperCase().charAt(0);
      
         switch (code)
         {
            case 'R':
               System.out.print("\tFile Name: ");
               input = scan.nextLine();
               
               octList = octList.readFile(input);
               System.out.println("\tFile read in and Octahedron List created");
               System.out.println();
               
               break;
               
            case 'P':
               System.out.println(octList);
               
               break;
               
            case 'S':
               System.out.println();
               System.out.println(octList.summaryInfo());
               System.out.println();
               
               break;
            
            case 'A':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tColor: ");
               color = scan.nextLine();
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(scan.nextLine());
               
               octList.addOctahedron(label, color, edge);
               System.out.println("*** Octahedron added***");
               
               System.out.println();
               
               break;
            
            case 'D':
               System.out.print("\tLabel: ");
               String label2 = scan.nextLine();
               
               if (octList.findOctahedron(label2) != null)
               {
                  Octahedron octa = octList.deleteOctahedron(label2);
                  label2 = octa.getLabel();
                  System.out.println("\t\"" + label2 + "\" deleted\n");
               }
               else
               {
                  System.out.println("\t\"" + label2 + "\" not found\n");
               }
               break;
            
            case 'F':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               if (octList.findOctahedron(label) != null)
               {
                  System.out.println(octList.findOctahedron(label) + "\n");
               }
               else
               {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
            
            case 'E':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tColor: ");
               color = scan.nextLine();
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(scan.nextLine());
               
               if (octList.findOctahedron(label) != null)
               {
                  Octahedron octa1 = octList.findOctahedron(label);
                  label = octa1.getLabel();
                  octList.editOctahedron(label, color, edge);
                  System.out.println("\t\"" + label + "\" successfully edited");
                  System.out.println();
               }
               else
               {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
               
            case 'Q':
               break;
               
            default:
               System.out.println("\t*** invalid code ***");
               System.out.println();
               break;
               
         }       
      } while (code != 'Q');
   }
}      