public class Gauge
{
   private int value;
   
   public Gauge()
   {
      this.value = 0;
   }
   
   public void decrease()
   {
      this.value--;
   }
   
   public void increase()
   {
      this.value++;
   }
   
   public boolean full()
   {
      if (this.value == 5)
      {
         return true;
      }
      return false;
   }
   
   public int value()
   {
      return this.value;
   }
}