package collectionvscollections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsVsCollections {

	public static void main(String[] args) {
		
		
		ArrayList mark = new ArrayList();
		
		mark.add(90);
		mark.add(80);
		mark.add(70);
		
		Collections.sort(mark);
		for (Object b: mark)
		{
			System.out.println(b);
		}
		System.out.println("*********************************");
		Collections.reverse(mark);
		for(Object b1: mark)
		{
			System.out.println(b1);
		}

	}

}
