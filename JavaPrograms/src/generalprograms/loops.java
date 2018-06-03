package generalprograms;

import java.util.Scanner;

public class loops {

	
	public static void main(String[] args)
	{
	
		System.out.println("enter a character");
		
		Scanner sc = new Scanner(System.in);
		
		String colleges = sc.next();
		
		//String name2=sc.nextLine();
		//String name3=sc.nextLine();
		
		switch(colleges)
		{
		case "KUK":
					
		System.out.println("This is the best university");
		break;
		case "India":
			
		System.out.println("This is the best country");
		break;
		default:
			System.out.println("This is the default case");
		
		}
		sc.close();
		loops sw= new loops();
		sw.NaturalNumbers();
		sw.Natural();
		sw.Natural2();
	}
	

	public void NaturalNumbers()
	{
		
		int n=1;
		 do
		
		{
		System.out.println(n);
			
			n++;
		}
		while(n<10);
	}
	
	public void Natural()
	{
		
		int x=11;
		 while(x<21)
		
		{
		System.out.println(x);
			
			x++;
		}
	}
	
		 public void Natural2()
			{
				
				int x=1;
				 while(x++<=5);
				
				
				System.out.println(x);
					
					
				
		
	}
	
	}
	
	

