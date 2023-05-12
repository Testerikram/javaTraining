package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashSetandLinkedHashSet {

	public static void main(String[] args, java.util.Iterator iterator, java.util.Iterator Iterator) {
		
		HashSet h= new HashSet();
		
		h.add("ikram hussain");
		h.add("Kayar nisha");
		h.add("ajira banu");
		h.add("jailabdeen");
		h.add("jailabdeen");
		System.out.println(h.contains("ikram hussain"));
		
		
		for (Object a : h)
		{
			System.out.println(h);
		}
		
		HashSet h1=  new HashSet();
		
		h1.addAll(h);
		
		for (Object h2 : h1)
		{
			System.out.println(h2);
		}
		
		LinkedHashSet l = new LinkedHashSet();
		
		l.add("ikram hussain");
		l.add("Kayar nisha");
		l.add("ajira banu");
		l.add("jailabdeen");
		l.add("jailabdeen");
		
		for(Object s :l);
		{
			
			System.out.println(l);
		}
		
		HashSet<String> h3 = new HashSet<String>();
		
		h3.add("Java");
		h3.add("Java");
		h3.add("Selenium");
		h3.add("Python");
		h3.add("JAR FILES");
		h3.add("Strings");
		h3.add("Arrays");
		
		for (String d : h3)
		{
			System.out.println(h3);
		}
		
		System.out.println(l.size());
		
		l.clear();	
		//Iterator
		
		java.util.Iterator i = l.iterator();
		
		
		
		
		
		
		
		}
		
		
	
		
		
		
		
	
		

	}

}
