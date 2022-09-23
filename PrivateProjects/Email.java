import java.util.Random;

public class Email
{
   Random rand = new Random();
   
   private String lastName;
   private String firstName;
   private String department;
   
   public Email(String lastName, String firstName, String department)
   {
      this.lastName = lastName;
      this.firstName = firstName;
      this.department = department;
   }
   
   String[] info = {this.lastName, this.firstName, this.department};
   
   public String address()
   {
      return info[rand.nextInt(2)];
   }
}