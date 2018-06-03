package generalprograms;

public class stringmethod1 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="Ajay Malik";
		String s1="Ajay Malik";
		
		String s3 = new String("AJAY");
		String s4 = new String("AJAY");
		
		System.out.println(s.substring(2));
		System.out.println(s.length());
		System.out.println(s.substring(2, 5));
		System.out.println(s.join("_", s,"God","is","Awesome"));
		System.out.println(s.hashCode());
		System.out.println(s.equalsIgnoreCase("AjayMalik"));
		System.out.println(s==s1);
		System.out.println(s3==s4);	
        
	}

}
