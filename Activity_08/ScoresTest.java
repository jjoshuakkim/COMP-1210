public class ScoresTest
{
   public static void main(String[] args)
   {
      int[] array = new int[4];
      array[0] = 2;
      array[1] = 3;
      array[2] = 4;
      array[3] = 5;
      //array[4] = 6;
      
      Scores score = new Scores(array);
      System.out.println(score.toString());
   }
}