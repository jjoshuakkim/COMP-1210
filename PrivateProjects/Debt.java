public class Debt
{
   private double balance;
   private double interestRate;
   
   public Debt(double initialBalance, double initialInterestRate)
   {
      this.balance = initialBalance;
      this.interestRate = initialInterestRate;
   }
   
   public void balance()
   {
      System.out.println("Balance: " + this.balance);
   }
   
   public void waitOneYear()
   {
      double debt = this.balance * (this.interestRate);
      this.balance = debt;
   }
}