package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {

	public static void main(String[] args) {
		
		//Collections ?
		//Why collections part came into picture ?
		
		// Collections - Collections of datas,objects,integer,strings
		
		
		String[] a = new String[5] ;
		a[0] = "Navin" ;
		
		//Array Drawbacks 
		
		// Drawbacks ?
		// Size needs to be declared ??
		// String array if u declare it will accept only strings 
		// Fixed in size 
		
		// Collections will give advantages on the drawbacks on array 
		
		// Dyanamically the size will be increased 
		// It can accepts any data types 
		// Even u can strict ur data types entry 
		
		// Iterator,COLLECTIONS,LIST,SET ,QUEU
		
		
		// To create an array list
		// It is index bases starts from 0
		// It will maintain insertion order
		
		ArrayList students = new ArrayList();
		
		ArrayList<String> emailid= new ArrayList<String>();
		LinkedList Students1 =new LinkedList() ;
		
		students.add("Akash");
		students.add("Boomika");
		students.add("Dhanalakshmi");
		students.add("Ferin");
		students.add("Hemanth");
		students.add("Janani");
		students.add("Jyoti");
		students.add("Kalishwri");
		students.add("Leena");
		students.add("Malathi");
		students.add("Muthu Karthika");
		students.add("Raghul");
		students.add("Richard");
		students.add("Sugadarshini");
		students.add("Sindhu");
		students.add("Supraja");
		
		System.out.println("*****");
		
		Students1.add("Akash");
		Students1.add("Boomika");
		Students1.add("Dhanalakshmi");
		Students1.add("Ferin");
		Students1.add("Hemanth");
		Students1.add("Janani");
		Students1.add("Jyoti");
		Students1.add("Kalishwri");
		Students1.add("Leena");
		Students1.add("Malathi");
		Students1.add("Muthu Karthika");
		Students1.add("Raghul");
		Students1.add("Richard");
		Students1.add("Sugadarshini");
		Students1.add("Sindhu");
		Students1.add("Supraja");
		Students1.
		
		ArrayList id = new ArrayList();
		
		// id.add(1);
		
		
		for(int i = 1 ; i <=students.size(); i++)
		{
			id.sd(i);
		}
		
		for(int j = 0 ; j <students.size(); j++)
		{
			for(int p = 0 ; p <id.size(); p++)
			{
				System.out.println("The id for" + " " +id.get(p) + "is"+students.get(j) );
			}
		}
		

		
		System.out.println(id.size());
		System.out.println("*******************");
		System.out.println(students.get(5));
		
		students.add(5,"ikram hussain");
		System.out.println(students.get(5));
		System.out.println(students.get(6));
		
		System.out.println(students.size());
		
		System.out.println(students.contains("Leena"));
		
		for(Object a1: students)
		{
			System.out.println(a1);
		}
		System.out.println("**************************");
		for(Object b : Students1)
		{
			System.out.println(b);
		}
		System.out.println("*****************");
		for(String c : emailid)
		{
			System.out.println(c);
		}
		
		
		
		
		
		
	}

}
