package controlStatement;

import java.util.Scanner;

public class Calc_Ifelse {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String inp = sc.next();
		
		if(inp.equals("+"))
		{
			System.out.println("Enter the first number");
			int a= sc.nextInt();
			System.out.println("Enter the second number");
			int b=sc.nextInt();
			
			
			System.out.println(a+b);
		}
		else if(inp.equals("-"))
		{
			System.out.println("Enter the first number");
			int a= sc.nextInt();
			System.out.println("Enter the second number");
			int b=sc.nextInt();
			
			
			System.out.println(a-b);
		}
		else if(inp.equals("*"))
		{
			System.out.println("Enter the first number");
			int a= sc.nextInt();
			System.out.println("Enter the second number");
			int b=sc.nextInt();
			
			
			System.out.println(a*b);
		}
		else if(inp.equals("+"))
		{
			System.out.println("Enter the first number");
			int a= sc.nextInt();
			System.out.println("Enter the second number");
			int b=sc.nextInt();
			
			
			System.out.println(a/b);
		}
		else
		{
			System.out.println("enter the valid input");
		}
		

	}

}
