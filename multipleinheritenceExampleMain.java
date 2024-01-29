package oopsexample;

public class multipleinheritenceExampleMain implements multipleIheritenceExample, multipleIheritenceExample2  {

	 public void d1() {
	       System.out.println("Abstract method of multiple interface");	 
	 }

	 
	public void Defaultmethod() {
		// TODO Auto-generated method stub
		multipleIheritenceExample.super.Defaultmethod();
		multipleIheritenceExample2.super.Defaultmethod();
		System.out.println("interface 1");
	}
	
	public static void staticmethod() {
		// TODO Auto-generated method stub
		multipleIheritenceExample.Staticmethod();
		multipleIheritenceExample2.Staticmethod();
		System.out.println("interface 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		multipleinheritenceExampleMain obj = new multipleinheritenceExampleMain();
		obj.d1();
		obj.Defaultmethod();
		multipleinheritenceExampleMain.staticmethod();
	
	
	
	}

}
