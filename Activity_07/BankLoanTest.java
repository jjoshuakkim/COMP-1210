import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
  * BankLoanTest - Acivity_07.
  * Joshua Kim
  * Date : 10/12/20
 */
 
public class BankLoanTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
    * chargeInterestTest will charge interest.
    */
   @Test public void chargeInterestTest()
   {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals(" ", 1100, loan1.getBalance(), 0.000001);
   }
}
