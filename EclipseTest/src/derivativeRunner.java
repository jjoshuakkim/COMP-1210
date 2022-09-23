public class derivativeRunner 
{
	private double coEff;
	private String var;
	private double power;
	
	public derivativeRunner(double coEffIn, String varIn, double powerIn)
	{
		coEff = coEffIn;
		var = varIn;
		power = powerIn;
	}
	
	public String toString()
	{
		coEff = coEff * power;
		power = power - 1;
		
		return coEff + var + "^" + power;
	}
}
