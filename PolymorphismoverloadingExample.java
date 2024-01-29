package oopsexample;

public class PolymorphismoverloadingExample {

	// function overloading...
	// m1
//		Object result;
//  
//		 // method 1
//		 void logic (int a, int b) {
//			 result = a+b;
//		 }
//	
//		 // method 2
//		 void logic (float a , int b) {
//			 result = a-b;
//		 }
//		 
//		 // method 3
//		 void logic (double a, int b) {
//			 result = a*b;
//		 }
//		 
//		 // method 4
//		 void logic (float a, float b) {
//			 result = a/b;
//		 }
//		 void logic (double x, double y) {
//			 result = x%y;
//		 }
//		 void logic (String s1 ,String s2) {
//			 result = s1 +" "+s2;
//		 }
//		 void logic (float p, float r , float t) {
//			 result = (p*r*t)/100;
//		 }
//	
//		 void display () {
//			 System.out.println(result);
//		 }
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub

//		PolymorphismoverloadingExample obj = new PolymorphismoverloadingExample();
//		obj.logic(56, 56);
//		obj.display();
//		
//		obj.logic(545f, 465);
//		obj.display();
//		
//		obj.logic(565.00, 60);
//		obj.display();
//		
//		obj.logic(8965f, 98f);
//		obj.display();
//		
//		obj.logic(855, 79);
//		obj.display();
//		
//		obj.logic("kcjnk" , "skjfdk");
//		obj.display();
//		
//		obj.logic(54554f, 2f, 3f);
//		obj.display();

	static Object result;

	// method 1
	static void logic(int a, int b) {
		result = a + b;
	}

	// method 2
	static void logic(float a, int b) {
		result = a - b;
	}

	// method 3
	static void logic(double a, int b) {
		result = a * b;
	}

	// method 4
	static void logic(float a, float b) {
		result = a / b;
	}

	static void logic(double x, double y) {
		result = x % y;
	}

	static void logic(String s1, String s2) {
		result = s1 + " " + s2;
	}

	static void logic(float p, float r, float t) {
		result = (p * r * t) / 100;
	}

	static void display() {
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolymorphismoverloadingExample.logic(532, 96);
		PolymorphismoverloadingExample.display();
		
		PolymorphismoverloadingExample.logic(6845f, 656);
		PolymorphismoverloadingExample.display();
		
		PolymorphismoverloadingExample.logic(565.58, 85);
		PolymorphismoverloadingExample.display();
		
		PolymorphismoverloadingExample.logic(6845f, 846f);
		PolymorphismoverloadingExample.display();
		
		PolymorphismoverloadingExample.logic(654, 85);
		PolymorphismoverloadingExample.display();
		
		PolymorphismoverloadingExample.logic("kghskrj", "rehvjk");
		PolymorphismoverloadingExample.display();
		
		PolymorphismoverloadingExample.logic(98646f, 2f, 3f);
		PolymorphismoverloadingExample.display();
		
		
		
		
	}

}
