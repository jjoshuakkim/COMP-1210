public class Book
{
   private String title;
   private String number;
   private String year;
   
   public Book(String title, String number, String year)
   {
      this.title = title;
      this.number = number;
      this.year = year;
   }
   
   public String title()
   {
      return this.title;
   }
   
   public String number()
   {
      return this.number;
   }
   
   public String year()
   {
      return this.year;
   }
   
   public String toString()
   {
      return this.title + ", " + this.number + " pages, " + this.year;
   }
}