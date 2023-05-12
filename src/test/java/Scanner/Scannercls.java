package Scanner;

import java.util.Scanner;

public class Scannercls {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		
		int i=20;
		
		System.out.println("before"+i);
		System.out.println("enter the number to change");
		i=sc.nextInt();
		System.out.println("after"+i);
		
		
		

	}

}
