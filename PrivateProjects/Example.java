public class Example 
{ 
   public static void main(String[] args) 
   {
      printStars(5);
   }

   public static void printStars(int end) 
   {
      int beginning = 0;
      while (beginning < end) 
      {
         System.out.print("*");
         beginning++;
      }
   }
}