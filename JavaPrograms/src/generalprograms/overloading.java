package generalprograms;

public class overloading {

	
	
	int i;
	String name;
	Double salary;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		overloading o1= new overloading();
		overloading o2= new overloading();
		overloading o3= new overloading();
		
		o1.getdata();
		o1.setdata();
		o1.getdata();
	}

	public void getdata()
	{
		

		//overloading o1= new overloading();
		System.out.println(name+ "\t"  + i + "\t" + salary);
		
	}
	
	public void setdata()
	
	{
		//overloading o1= new overloading();
		i=1;
		name="Ajay";
		salary=123.45;
		System.out.println(name+ "\t"  + i + "\t" + salary);
		
	}
	
}
