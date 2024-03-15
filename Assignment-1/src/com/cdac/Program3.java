package com.cdac;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int num1 = i.nextInt();
		System.out.print("Enter 2nd number: ");
		int num2 = i.nextInt();
		System.out.print("Enter any of the operator from +, -, *, /: ");
		int op = i.next().charAt(0);
		i.close();
		int add,sub,mult,div;
		
		
		switch(op)
		{
		   case '+' :
			   add = num1 + num2;
			   System.out.println("Addition: "+add);
			   break;
			   
		   case '-' :
			   sub = num1 - num2;
			   System.out.println("Substraction: "+sub);
			   break;
			   
		   case '*' :
			   mult = num1 * num2;
			   System.out.println("Multiplication: "+mult);
			   break;
			   
		   case '/' :
			   div = num1 / num2;
			   System.out.println("Division: "+div);
			   break;
			   
		   default :
			   System.out.println("Invalid Operator");
			   
		}

	}

}
