package oopsexample;

public class inheritence2 extends inheritance1  {
	
	//simple level inheritence call kiya
	public static void main(String args[]) {
	inheritence2 obj = new inheritence2();
	obj.add();
	obj.display();
	 display();        // static me object bnane ki jarurat nahi pdti
	}
	
	// child
	
	
	void sub() {
		int a=646;
		int b=523;
		System.out.println(a-b);
	}
	
	static void dis() {
	    System.out.println("static method of child");
	}
	
	
}
