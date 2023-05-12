package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapinterfaceHashMapLinkedHashMap {

	public static void main(String[] args) {
		
		HashMap<String,String> mp = new HashMap<String,String>();
		
		mp.put("Ikram hussain", "19MEL009");
		mp.put("JAISURIYA", "19MEL010");
		mp.put("Athesh", "19MEL001");
		mp.put("Karthi", "19MEL011");
		
		for( Object i : mp.keySet())
		{
			System.out.println(i + " "+"Rollnumber is"+ " "+mp.get(i) );
		}
		
		
		System.out.println("******************************");
		
		
		LinkedHashMap<String,Integer> mp1 = new LinkedHashMap<String,Integer>();
		
		mp1.put("Tamil",89);
		mp1.put("Science",100);
		mp1.put("Maths",89);
		
		for (Object k : mp1.keySet())
		{
			System.out.println("The scored subject is"+" "+k+" "+mp1.get(k));
		}
		
		
		

	}

}
