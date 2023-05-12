package Oprators;

import java.util.Scanner;

public class operators {

	public static void main(String[] args) {
		
		//Modulus-%
		Scanner s = new Scanner(System.in);
		
		int j=s.nextInt();
		
		if(j%2==0) 
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}
		
		//And Gate
		
		//1 1 1
		//1 0 0
		//0 0 0
		//0 1 0
		
		String h = "Ikram hussain";
		
		if(h.contains("m")&&h.contains("i"))
		{
			System.out.println("Valid validations");
		}
		else
		{
			System.out.println("Invalid validations");
		}
		
		if(h.contains("I")||h.contains("P"))
		{
			System.out.println("Valid validations");
		}
		else
		{
			System.out.println("Invalid validations");
		}
		

	}

}
