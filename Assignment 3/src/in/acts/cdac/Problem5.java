package in.acts.cdac;

public class Problem5 
{

	public static void main(String[] args) 
	{

		
		int num1 = 1;
		int num2 = 2;
		double add = num1 + num2;      
		System.out.println("Addition(int into double): "+add); 
		
		int num3 = 5;
		int num4 = 6;
		float num5 = (long) (num3*num4); 
		System.out.println("multiplication(Interget into float)= "+num5);
		
		int num6 = 1000;
		boolean b = (num6 == 1000);
		System.out.println("Integer Converted in Boolean= "+b);
		
		int num9 = 40;
		String str =  Integer.toString(num9);
		String str2 = String.valueOf(num9);
		System.out.println("int into String: "+str);
		System.out.println("int into String: "+str2);


	}

}
