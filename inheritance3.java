package oopsexample;

public class inheritance3 extends inheritence2 {
	
	// sub child
	
	void multi() {
		int a=665;
		int b=8;
		System.out.println(a*b);
	}
	
	static void dis2() {
		System.out.println("static method of sub child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 inheritance3 obj = new inheritance3();
		 obj.add();
		 inheritance3.display();
		 obj.sub();
		 inheritance3.dis();
		 obj.multi();
		 inheritance3.dis2();
		
	}

}
