import java.util.Scanner;

public class GiftPrice
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Price: ");
      double price = Double.valueOf(scan.nextLine());
      
      if (price < 5000)
      {
         System.out.println("No tax");
      }
      else if (price >= 5000 && price <= 25000)
      {
         double tax = 100 + (price - 5000) * 0.08;
         System.out.println("Tax: " + tax);
      }
      else if (price >= 25000 && price <= 55000)
      {
         double tax = 1700 + (price - 25000) * 0.1;
         System.out.println("Tax: " + tax);
      }
      else if (price >= 55000 && price <= 200000)
      {
         double tax = 4700 + (price - 55000) * 0.12;
         System.out.println("Tax: " + tax);
      }
      else if (price >= 200000 && price <= 1000000)
      {
         double tax = 22100 + (price - 200000) * 0.15;
         System.out.println("Tax: " + tax);
      }
      else if (price >= 1000000)
      {
         double tax = 142100 + (price - 1000000) * 0.17;
         System.out.println("Tax: " + tax);
      }
   }
}