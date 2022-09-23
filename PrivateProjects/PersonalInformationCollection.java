public class PersonalInformationCollection
{
   private String first;
   private String last;
   private String ID;
   
   public PersonalInformationCollection(String first, String last, String ID)
   {
      this.first = first;
      this.last = last;
      this.ID = ID;
   }
   
   public String toString()
   {
      return this.first + " " + this.last;
   }
}