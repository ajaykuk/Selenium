package generalprograms;

public class Overloading2 {

	int empno;
	String name;
	Double salary;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading2 o2= new Overloading2();
		// o2.Getdata();
		System.out.println("\n"+ o2.empno +"\n"+ o2.name +"\n"+ o2.salary );
		
		o2.Sum(10, 20);
		o2.Sum(300, 40, 50);
	}

	Overloading2() {

		int empno = 20;
		String name = "Ajay";
		Double salary = 1600000.00;

		System.out.println("\n" + empno + "\n" + name + "\n" + salary);

		
	}

	public void Sum(int a, int b) {

		int d = a;
		int e = b;
		int sum = d + e;
		System.out.println("sum is " + sum);

	}

	public void Sum(int g, int h, int i) {

		int j = g;
		int k = h;
		int l = i;
		int sum = j + k + l;
		System.out.println("sum is " + sum);

	}

}
