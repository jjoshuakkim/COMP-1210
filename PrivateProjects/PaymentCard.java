public class PaymentCard
{
   private double openingBalance;
   
   public PaymentCard(double openingBalance)
   {
      this.openingBalance = openingBalance;
   }
   
   public String toString()
   {
      return "The card has a balance of " + this.openingBalance + " euros.";
   }
   
   public void eatAffordably()
   {
      this.openingBalance -= 2.6;
   }
   
   public void eatHeartily()
   {
      this.openingBalance -= 4.6;
   }
}