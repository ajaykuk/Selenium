package generalprograms;

public class ImplementInter implements Interfac1
{

	
	 public int sum(int x, int y)
	 {
	 	int s=x+y;
	 	//return s;
	 	System.out.println("sum is\t" +s);
		return s;
	 }
	 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImplementInter d = new ImplementInter();
		System.out.println(Interfac1.x+"\t"+Interfac1.y);
	d.sum(x, y);	
  }
		
  }


