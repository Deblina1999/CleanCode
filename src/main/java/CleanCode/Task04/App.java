package CleanCode.Task04;
import java.util.*;
public class App
{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		Construction c = new Construction();
		double area;
		String str = "";
		System.out.println("Enter the material standard");
		str = sc.nextLine();
		System.out.println("Enter the total area of the house in square feets");
		area=sc.nextDouble();
		String str1="no";
		if(str.equalsIgnoreCase("Standard Material"))
		{
			System.out.println("Should it be a fully automated house?  Say yes or no");
			str1 = sc.next();
		}
		System.out.println("Total cost for construction = "+c.construction(area,str,str1));



/*------------------------- Calculation of Interest------------------------------*/
		Interest i = new Interest();
		double p, r, t;
		System.out.println("Enter the Principle amount");
		p = sc.nextDouble();
		System.out.println("Enter the time period");
		t = sc.nextDouble();
		System.out.println("Enter the rate of interest per annum in percentage");
		r = sc.nextDouble();
		r = r/100;
		System.out.println("Enter n value");
		String s1 = sc.nextLine();
		if(s1.equalsIgnoreCase("Simple Interest"))
		{
			System.out.println("The simple interest is = "+i.simpleInterest(p,r,t));
		}
		else
			System.out.println("The compound interest is = "+i.compoundInterest(p,r,t));
		sc.close();

	}
}

