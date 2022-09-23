import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListProject
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      ArrayList<Integer> numbers = new ArrayList<>();
      
      System.out.println("Enter numbers: ");
      while (true)
      {
         int value = scan.nextInt();
         if (value > 0 || value < 0)
         {
            numbers.add(value);
         }
         else
         {
            break;
         }
      }
      
      greatest(numbers);
   }
   
   public static void greatest(ArrayList<Integer> list)
   {
      int greatest = list.get(0);
      for (int i = 0; i < list.size(); i++)
      {
         int j = list.get(i);
         if (j > greatest)
         {
            greatest = j;
         }
      }
      System.out.println("Greatest number: " + greatest);
      System.out.println("Index: " + list.indexOf(greatest));
   }
}