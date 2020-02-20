package CleanCode.Task04;

public class Construction
{
	public double construction(double area, String str,String str1)
	{
		double result;
		if(str.equalsIgnoreCase("Standard Material"))
		{
			if(str1.equalsIgnoreCase("yes"))
			{
				result = 2500*area;
			}
			else
				result = 1200*area;
			return result;
		}
		else 		
			result = 1800*area;
			return result;
		
	}
}
