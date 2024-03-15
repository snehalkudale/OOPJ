package com.cdac;
import java.util.*;

public class Program6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a height: ");
		double h = sc.nextDouble();
		System.out.print("Enter a weight: ");
		double w = sc.nextDouble();
		sc.close();
		
		double BMI = w/(h*h);
		
		if(BMI<18)
		{
			System.out.print("Under-weight");
		}
		else if(BMI>18 && BMI<24)
		{
			System.out.print("Normal-weight");
		}
		else if(BMI>25)
		{
			System.out.print("Over-weight");
		}
		else
		{
			System.out.print("Abnormal-weight");
		}
	}

}
