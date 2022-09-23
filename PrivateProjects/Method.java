public class Method
{
   public static void main(String[] args)
   {
      printTriangle(4);
   }
   
   public static void printTriangle(int size)
   {
      int standard = 0;
      while (standard < size)
      {
         printTriangleRow(standard);
         standard++;
      }
   }
   public static void printTriangleRow(int max)
   {
      int standard1 = 0;
      while (standard1 <= max)
      {
         System.out.print("*");
         standard1++;
      }
      System.out.println("");
   }
}