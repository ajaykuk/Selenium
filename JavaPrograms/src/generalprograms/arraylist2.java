/**
 * 
 */
package generalprograms;
import java.util.*;

/**
 * @author Lenovo
 *
 */
public class arraylist2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<Object> arr = new ArrayList<Object>();
	
	
	
	arr.add("Ajay");
	arr.add("Kumar");
	arr.add("Malik");
	arr.add(10);
	//arr.add(obj(2));
	//int i = arr.size();
	
	for(Object str:arr )
	{
		System.out.println(str);
		
	}
	
	ListIterator<Object> itr1= arr.listIterator();
	
	while(itr1.hasNext())
	{
		System.out.println(itr1.next());
	}
	
	
	while (itr1.hasPrevious())
	{
		
		System.out.println(itr1.previous());
	}
	//System.out.println(i);
	
		
		

	}

	

}
