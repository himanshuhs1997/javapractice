package dataTypeExample;

import java.util.Scanner;

public class practice1 {
/*
   // variable - local and global
	int a= 25;
	int b=65;
	void display() {
		int x= 65; int y= 88;
		System.out.println("x ="+x+"y= "+y);
	}
	void display1() {
		System.out.println("a ="+a+"b ="+b);
	}
	public static void main(String args[]) {
		practice1 obj= new practice1();
		obj.display();
		obj.display1();
	}
	*/
	
//============================================================
	
	// variable - local and global
	/*
	static int a= 25;
    static int b=65;
	static void display() {
		int x= 65; int y= 88;
		System.out.println("x ="+x+"y= "+y);
	}
	static void display1() {
		System.out.println("a ="+a+"b ="+b);
	}
	public static void main(String args[]) {
		practice1 obj= new practice1();
		obj.display();
		obj.display1();
		display();
		display1();
	}
	*/
//=================================================================
	
	// increment
	public static void main(String args[]) {
	/* int a= 25;
	System.out.println(a);
	int r= ++a;
	System.out.println(r);
	System.out.println(a);
	*/
		
	/*	int a=15;
		System.out.println(a);
		int r=--a;
	   System.out.println(r);
	   System.out.println(a);
	
	*/
		
//==================================================================
		
	/*	int a= 14;
		int b=18;
		if(a<=b) {
			System.out.println("a<b");
		}else {
			System.out.println("a>b");
		}
		*/
//=============================================================
		/*
		String s1="39";
		String s2= "39";
		String s3= new String("3");
		if (s1==s2) {
			System.out.println("equals");
		}else {
			System.out.println("not equals");
		}
		if (s1==s3) {
			System.out.println("equals");
		}else {
			System.out.println("not equals");
		}
		if(s1.equals(s3)) {
			System.out.println("equals");
		}else {
			System.out.println("not equals");
		}
		if(s1.equals(s2)) {
			System.out.println("equals");
		}else {
			System.out.println("not equals");
		}
		*/
//============================================================================		
	
	/*	int a= 24;
		int b=10;
		if((a%2==0) && (b%2==0)) {
			System.out.println("a and b both even");
		}else {
			System.out.println("a or b are odd");
		}  */
		
		/*
		String a= "abcd";
		String b="123@xyz";
		if((a=="abc") && (b=="123@xyz")) {
			System.out.println("valid ");
		}else {
			System.out.println("invalid");
		}
		*/
//======================================================================
		
		// for loop
		// forword and backword
		/*
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		*/
//======================================================================		
	/*
		// table -
		int num=2;   
		for(int i=1; i<=10; i++) {
			System.out.println(i*num);
		}
		
		//reverse
		int n=2;   
		for(int i=10; i>=1; i--) {
			System.out.println(i*n);
		}
		*/
//===================================================================
		
		// prime no.
	/*	
		int num= 7;
		int i, count=0;
		for(i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("prime no.");
		}else {
			System.out.println("not a prime no.");
		}
	*/
		/*
		int num = 85;
		int i,count=0;
		for(i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime no.");
		}
		else {
			System.out.println("not a prime no");
		}
	    */ 
//=============================================================
		
		// fibonacci series
		/*
		int a=0, b=1, c;
		for(int i=0; i<=8; i++) {
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		*/
		/*
		int a=0,b=1,c;
		for(int i=0; i<=18; i++) {
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		*/
		
//===================================================================
		
		// factorial
		/*
		int num=5;
		for(int i=1; i<5; i++) {
			num=num*i;
		  System.out.println(num);	
		}
		System.out.println(" ");
		int num1=8;
		for(int i=1; i<8; i++) {
			num1=num1*i;
			System.out.println(num1);
		}*/
		
//==============================================================
		/*
		//pattern
		
		for(int i=0; i<=4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
		*/
//==============================================================
		System.out.println("abc");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		System.out.println(b);
		System.out.println("cba");
		
	}		
}
