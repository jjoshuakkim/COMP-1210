import java.util.Scanner;

public class derivative 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter coefficient: ");
		double coEff = scan.nextDouble();
		
		System.out.print("Enter multiplier: ");
		double mul = scan.nextDouble();
		
		System.out.print(coEff * mul);
	}
}
