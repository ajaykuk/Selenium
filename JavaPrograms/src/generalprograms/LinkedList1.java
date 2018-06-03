package generalprograms;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> link1= new LinkedList<String>();
		
		link1.add("Ajay1");
		
		link1.add("Ajay2");
		
		LinkedList<String> link2= new LinkedList<String>();
		
		link2.add("Ajay3");
		
		link2.add("Ajay4");
		link2.add("Ajay5");
		link1.addAll(link2);
		
		System.out.println(link1);
		System.out.println(link2);
		
	/*	for(String l1:link1)
		{
			System.out.println(l1);
		}*/
			
	 /* link1.addAll(link2);
		
		for(String l1:link1)
		{
			System.out.println(l1);
		} */
		
		
		link1.retainAll(link2);
				
		System.out.println(link1);	
		
		
	}

}
