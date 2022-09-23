public class DecreasingCounter
{
   private int value;
   
   public DecreasingCounter(int initialIncrement)
   {
      this.value = initialIncrement;
   }
   
   public void printValue()
   {
      System.out.println("Value: " + this.value);
   }
   
   public void decrease(int increment)
   {
      this.value = this.value - increment;
      if (this.value <= 0)
      {
         this.value = 0;
      }
   }
   
   public void reset()
   {
      this.value = 0;
   }
}