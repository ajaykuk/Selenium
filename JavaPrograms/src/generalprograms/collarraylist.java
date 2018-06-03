package generalprograms;

import java.util.Collections;
import java.util.ArrayList;

public class collarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(11);
		arr.add(12);
		arr.add(13);
		arr.add(14);
		
		System.out.println("ajay " +arr);

		//Object o = new Object();
		
		for (int i=0;i<arr.size();i++)
		
		{
			Integer d = arr.get(i);
		
			System.out.println(d);
		}	
		
		for (int i=0;i<arr.size();i++)
			
			{
			Integer d = arr.get(i);
			
			System.out.println(d);
		
			}
			
			
		
		
		
		for( Integer b: arr )
		{
			System.out.println(b);
		}
		
		arr.remove(2);
		
		for( Integer b: arr )
		{
			System.out.println("All elements of arraylist\t" +b);
		}
		
		System.out.println("Check if collection is empty\t"+arr.isEmpty());
		System.out.println("Size of array is \t"+arr.size());
		
	}

}
