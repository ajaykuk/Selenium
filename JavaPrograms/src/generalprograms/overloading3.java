package generalprograms;

public class overloading3 {

	int empno;
	String name;
	Double salary;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		overloading3 emp1= new overloading3();
		System.out.println(emp1.empno+"\t"+emp1.name+"\t"+ emp1.salary);
		//overloading3 emp2= new overloading3(120,"Ajay",2000000.00);
		//overloading3 emp3= new overloading3(120,2000000.00);
		
		//emp2.getdata();
		//emp3.getdata();
	}

	
	
	/*overloading3(int empno, String name, Double salary) {

		this.empno = empno;
		this.name = name;
		this.salary = salary;
		
		//System.out.println(empno+"\t"+name+"\t"+salary);
	}*/

	/*overloading3(int empno, Double salary) {

		this.empno = empno;
		this.salary = salary;
		
		//System.out.println(empno+"\t"+salary);
	} */

	public void getdata()
	{
		System.out.println(this.empno+"\t"+this.name+"\t"+this.salary);
		
		
	}
	
}
