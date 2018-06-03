package generalprograms;


enum days  { Mon, tue, web, thu, fri,sat,sun};

public class EnumTest {

		public static void main(String[] args)
	{
			
  days kk;
  kk= days.Mon;
	
	//System.out.println(kk);
	
	days d[]= days.values();
	System.out.println("1st time\t");
	for(days a: d)
	{
	
	System.out.println(a);	
	}
	
	System.out.println("2nd time\t");
	
	for(int i=0;i<d.length;i++)
		
	{
		System.out.println(d[i]);	
	}
	
	// TODO Auto-generated method stub
	}
	
	
}
