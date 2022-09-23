public class Agent
{
   private String firstName;
   private String lastName;
   
   public Agent(String firstName, String lastName)
   {
      this.firstName = firstName;
      this.lastName = lastName;
   }
   
   public void printPerson()
   {
      System.out.println("My name is " + this.lastName + ", " + this.firstName + " " + this.lastName + ".");
   }
   
   public String toString()
   {
      return "My name is " + this.lastName + ", " + this.firstName + " " + this.lastName + ".";
   }
}