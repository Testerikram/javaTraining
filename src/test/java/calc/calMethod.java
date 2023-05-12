package calc;

import java.util.Scanner;

public class calMethod {
	Scanner sc= new Scanner(System.in);
	
	public int addition (int a, int b)
	{
		a=sc.nextInt();
		b=sc.nextInt();
		int c=a+b;
		return c;
	}
	public int suntraction (int d, int e)
	{
		int f=d-e;
		return f;
	}
	public int multiplication (int g, int h)
	{
		int i=g*h;
		return i;
	}
	public int division (int j, int k)
	{
		int l=j/k;
		return l;
	}
	
}