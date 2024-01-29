package javapractice3;

import java.util.Scanner;

public class PracticeClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		// si
//		int a=85000;
//		int b= 2;
//		int c= 1;
//		int d = (a*b*c)/100;
//		System.out.println(d);
		
		// area of circle
//		float r=85f;
//		double area = Math.PI*r*r;
//       System.out.println(area);

		//wrapper class
//		Integer a= 855;
//		Character ch= ' ';
//		Character ch1= 'c';
//		System.out.println(a+ch+ch1);
//		System.out.println(ch1+ch+a);
		
		// reverse 12345 without using loop
		
//		int num =12345;
//		int a = num%10;
//	    num= num/10;
//	    int b = num%10;
//	    num = num/10;
//	    int c= num%10;
//	    num = num/10;
//	    int d=num%10;
//	    num = num/10;
//	    int e = num%10;
//	    num = num/10;
//	    
//	    int R = a*10000+b*1000+c*100+d*10+e*1;
//		
//	System.out.println(R);
	
		// reverse
//		int num = 985561;
//		int a = num%10;
//		num = num/10;
//		int b= num%10;
//		num= num/10;
//		int c= num%10;
//		num = num/10;
//		int d= num%10;
//		num = num/10;
//		int e = num%10;
//		num = num/10;
//		int f= num%10;
//		num = num/10;
//		
//		int R = a*100000+b*10000+c*1000+d*100+e*10+f*1;
//		System.out.println(R);
	
		// swap 2 no
//		int a= 85;
//		int b=75;
//		int c;
//         c=a;
//		a=b;
//		b=c;
//		System.out.println(a+" "+b);
	
		// swap 2 no. without using 3no.
//	int a= 852;
//	int b=962;
//      a=a+b;
//      b=a-b;
//      a=a-b;
//	System.out.println(a+" "+b);
	
		// celcius to ferenhite
//		double a = 2.00;
//		double r= (a*1.8)+32;
//		System.out.println(r);
//		
//		//ferenheit to celcius
//		float b= 2.0f;
//	    double R = (b-32)/1.8;
//	    System.out.println(R);
//	    
	
		// complex no.
//		int r1=5,r2=3,i1=2,i2=3,r,i;
//	      r = r1 + r2;
//	      i = i1 + i2;
//	      System.out.println(r1 + "+" + i1 + "i");
//	      System.out.println(r2 + "+" + i2 + "i");
//	      System.out.println(r + "+" + i + "i"); 
	
		
		// electricity bill
		
//		double units = 400;
//		
//		double billTopay = 0;
//		if (units < 100) {
//			billTopay = units*1.20;
//		}
//		else if (units < 300) {
//			billTopay = 100*1.20+(units-100)*2;
//		}else if (units > 300) {
//			billTopay = (100*1.20)+(200*2)+((units-300)*3);
//		}
//	System.out.println("the electricity bill"+units+" "+"is:"+billTopay);
		
		// electricity bill using scanner
		
		int units;
		double billTopay =0;
		
	      Scanner sc = new Scanner(System.in);
	       System.out.println("enter units value");
	       units= sc.nextInt();
	       
	       if(units <100) {
	    	   billTopay = units*1.20;
	       } else if (units < 300) {
	    	   billTopay = 100*1.20+(units-100)*2;
	       } else if (units < 500) {
	    	   billTopay = 100*1.20+200*2+(units-300)*3;
	       } else if (units >= 500 ) {
	    	   billTopay = 100*1.20+200*2+200*3+(units-500)*5;
	       }
	       
	       System.out.println("the electricity bill"+units+" "+"is:"+billTopay);
		
		// table
//		int num = 5;
//		for (int i=1; i<=10; i++) {
//			
//	    	System.out.println(num*i);
//		}
		
		// factorial
//		int num=5;
//		for(int i=1; i<5; i++) {
//			num=num*i;
//			System.out.println(num);
//		}
		
		// inches to cm & cm to inches
//		int a=10;
//		double inche = 2.54*a;
//		double cm = a/2.54;
//		System.out.println(inche);
//		System.out.println(cm);
		
		// area of triangle using heron formula
		
//		double a=85;
//		double b= 74;
//		double c=54;
//		double s;
//		 s=(a+b+c)/2;
//		 double r;
//         r = s*(s-a)*(s-b)*(s-c);	
//         System.out.println(Math.sqrt(r));
		
	}

}
