package com.cdac;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter thr character: ");
		char c = sc.next().charAt(0);
		sc.close();

		if((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u') || (c == 'A') || (c == 'E') || (c == 'I') || (c == 'O') || (c == 'U'))
		{
			System.out.print(c+" is a Vowel ");
		}
		else
		{
			System.out.print(c+" is a Consonant ");
		}
		
	}

}
