package generalprograms;

import java.util.Scanner;


//This is my 2nd commit.
//This is 3rd commit.
//This is 4th commit.
//This is 5th commit.
public class ajayarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[5];
		
		boolean[] b = new boolean[2];
		for (boolean c: b)
			System.out.println(c);
			
		Scanner sc =new Scanner(System.in);
		System.out.println("enter 5 integers");
		a[0]=sc.nextInt();
		a[1]=sc.nextInt();
		a[2]=sc.nextInt();		
		a[3]=sc.nextInt();
		a[4]=sc.nextInt();
		
		sc.close();
		
		/*for(int i=0;i<a.length;i++)
		{
		
		System.out.println(a[i]);
			
		}*/
		
		
		
		for (int no: a)
		{
		
		System.out.println(no);
		}
		
		}
			
		}
	


