package in.acts.cdac;

public class Problem4 
{

	public static void main(String[] args) 
	{
			
			int num1 = 1;
			float num2 = 2;
			double add = num1 + num2;      
			System.out.println("Addition: "+add); 
			
			int num3 = 5;
			double num4 = 6.00d;
			long num5 = (long) (num3*num4); //Narrowing
			System.out.println("multiplication= "+num5);
			
			double a = 5745.999d;
			double b = 6.00d;
			long c =  (long) (a*b); //Narrowing
			System.out.println("multiplication1= "+c);
			
			int num6 = 1000;
			int num7 = 100;
			float num8 = (num6-num7); 
			System.out.println("Substraction= "+num8);
			
			float num9 = 40000.345f;
			int num10 = 5000;
			double num11 =  (num9/num10); 
			System.out.println("Division= "+num11);
	}

}
