package in.acts.cdac;
//import java.util.*;

public class Problem3 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		
		char num1 = '1';
		char num2 = '2';
		int add = num1 + num2;      //Narrowing
		System.out.println("Addition: "+add); 
		
		int num3 = 5;
		int num4 = 6;
		short num5 = (short)(num3*num4); //Narrowing
		System.out.println("multiplication= "+num5);
		
		long num6 = 1000L;
		double num7 = 100.99d;
		float num8 = (float)(num6-num7); //Narrowing
		System.out.println("Substraction= "+num8);
		
		double num9 = 40000.345d;
		long num10 = 5000L;
		short num11 = (short) (num9/num10); //Narrowing
		System.out.println("Division= "+num11);
		
		
		
		
		

	}

}
