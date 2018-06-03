package generalprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Ajay");
		hm.put(2, "Amit");
		hm.put(3, "Ankur");

	//	System.out.println(hm.size());

		//System.out.println(hm);
		
		Collection<String> c = hm.values();
		
		Iterator <String> AL = c.iterator();
				
		while(AL.hasNext())
		System.out.println(AL.next());
		
		System.out.println(AL);
		Collection<Integer> d= hm.keySet();
		
		Iterator<Integer> e = d.iterator();
		while(e.hasNext())
			System.out.println(e.next());
			
		

	}

	

}
