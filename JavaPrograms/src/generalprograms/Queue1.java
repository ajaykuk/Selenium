package generalprograms;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {
	public static void main(String[] args) {
		
		Queue<String> que = new PriorityQueue<String>();
		que.add("Test1");
		que.add("Test2");
		que.add("Test3");
		que.add("Test4");
		que.add("Test5");
		
		Iterator<String> itr = que.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		que.poll();
		que.remove();
		
		Iterator<String> itr2 = que.iterator();
		while (itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}

}
