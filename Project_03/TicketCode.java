import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

/**
  * TicketCode - Project_03.
  * Joshua Kim
  * Date : 9/9/20
 */

public class TicketCode
{
   /**
     * Program prompts user to input ticket code.
     * Determines date, time, section, row, seat,
     * Price, discount, cost, and prize number.
     *
     * @param args Command line arguments (not used)
    */
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#.00");
      Random rand = new Random();
      
      System.out.print("Enter ticket code: ");
      String code1 = scan.nextLine();
      String code = code1.trim();
      
      String price = code.substring(0, 5);
      String discount = code.substring(5, 7);
      String time = code.substring(7, 11);
      String date = code.substring(11, 19);
      String section = code.substring(19, 21);
      String row = code.substring(21, 23);
      String seat = code.substring(23, 25);
      
      double price1 = Double.parseDouble(price);
      double discount1 = Double.parseDouble(discount);
      double cost = (price1 * 0.01) - (discount1 * 0.01 * (price1 * 0.01));
      int prize = rand.nextInt(998) + 1;
      
      if (code.length() < 26)
      {
         System.out.println();
         System.out.println("Invalid ticket code.");
         System.out.println("Ticket code must have at least 26 characters.");
      }
      else
      {
         String description = code.substring(25, code.length());
         String month = code.substring(11, 13);
         String day = code.substring(13, 15);
         String year = code.substring(15, 19);
         
         String hour = code.substring(7, 9);
         String minute = code.substring(9, 11);
         
         String dollar = code.substring(0, 3);
         String cent = code.substring(3, 5);
         
         System.out.println();
         System.out.println("Description: " + description + "   Date: " 
            + (month + "/" + day + "/" + year) 
            + "   Time: " + (hour + ":" + minute));
         System.out.println("Section: " + section 
            + "   Row: " + row + "   Seat: " + seat);
         System.out.println("Price: " + ("$" + dollar + "." + cent) 
            + "   Discount: " + discount + "%   Cost: $" + df.format(cost));
         System.out.println("Prize Number: " + prize);
      }
   }
}