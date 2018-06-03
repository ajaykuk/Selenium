package generalprograms;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Map1 {
	public static void main(String[] args) {
		
		Map<Integer,String> map1 = new HashMap<Integer,String>();
		
		//Map<> map2 = new HashMap<>();
		
		map1.put(1, "Test1");
		map1.put(2, "Test2");
		map1.put(3, "Test3");
		map1.put(4, "Test4");
		map1.put(5, "Test5");
		
		Set<Entry<Integer, String>> s1 = map1.entrySet();
		
		Iterator<Entry<Integer, String>> itr = s1.iterator();
		
		
		while (itr.hasNext())
		{
			Map.Entry<Integer, String> m1 =  itr.next();
			System.out.println(m1.getKey()+ " "+ m1.getValue());
			
		}
		System.out.println();
		
		for (Map.Entry<Integer, String> m1:map1.entrySet())
	//  The below line will also work
			//for (Entry<Integer, String> m1:map1.entrySet())
				{
			
			System.out.println(m1.getKey()+ " " + m1.getValue());
			
		}
		
	}

}
