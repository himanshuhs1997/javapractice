package javapractice3;

public class StringStringbufferStringbuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * 
		 *     String => immutable
		 *     
		 *     
		 *     StringBuffered => mutable
		 *                    => synchronized
		 *                    => multiThreading 
		 *     
		 *     StringBuilder => mutable
		 *     					
		 * 
		 * */
		
		
		// string ==  immutable
		
//		 String s = "himanshu";
//		 s = s+"sharma";
//         System.out.println(s);
//        // s.concat("Sharma");
//         System.out.println(s);
		
		// swap string          //chatgpt example
		
//		        String a = "Hello";
//		        String b = "World";
//
//		        System.out.println("Before swapping:");
//		        System.out.println("a = " + a);
//		        System.out.println("b = " + b);
//
//		        a = a + b; // Concatenate the strings
//		        b = a.substring(0, a.length() - b.length()); // Extract the original value of 'a'
//		        a = a.substring(b.length()); // Extract the original value of 'b'
//
//		        System.out.println("After swapping:");
//		        System.out.println("a = " + a);
//		        System.out.println("b = " + b);
		    
		

/*		
		String a= "himanshu";
		String b= " sharma";
		
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a+" "+b);
	*/	
		
//		String s = new String("himanshu");
//		s = s+"sharma";
//		System.out.println(s);
//		//s.concat("Sharma");
//		System.out.println(s);
		
	   
		// StringBuffer
		
//		StringBuffer sb = new StringBuffer("himanshu");
//	    sb.append("sharma");
//	    System.out.println(sb);
		
		// StringBuilder
//		StringBuilder sb = new StringBuilder("asdfghjkl");
//		sb.append("hrhuierh");
//		System.out.println(sb);
		
		// string reverse
		
		String s1 = "ABC";
		String s2 = "";     // for store reverse string
		char ch[] = s1.toCharArray();  // one by one char leta h
		
		for(int i=0; i<=ch.length-1; i++) {   
			s2 = ch[i]+s2;
		}
		System.out.println(s2);
		
//		String s = "himanshu sharma";
//		String s1 = "";
//		char ch[] =s.toCharArray();
//		for (int i=0; i<=ch.length-1; i++) {
//		   s1 = ch[i]+s1;
//		} System.out.print(s1);

//		String s = "naman1";
//		String s1 = "";
//		char ch[] =s.toCharArray();
//		for (int i=0; i<=ch.length-1; i++) {
//		   s1 = ch[i]+s1;
//		} System.out.print(s1);
		
//		String s = "123321";
//		String s1 = "";
//		char ch[] =s.toCharArray();
//		for (int i=0; i<=ch.length-1; i++) {
//		   s1 = ch[i]+s1;
//		} System.out.print(s1);
		
//		String s = "123321";
//		String s1 = "";
//		char ch[] =s.toCharArray();
//		for (int i=0; i<=ch.length-1; i++) {
//		   s1 = ch[i]+s1;
//		} System.out.print(s1);
		
	
	
	
	
	
	
	
	
	}
}
