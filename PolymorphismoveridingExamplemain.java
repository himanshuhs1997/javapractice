package oopsexample;

public class PolymorphismoveridingExamplemain extends PolymorphismoveridingExample {
	
	void logic() {
		System.out.println(" child method ");
	}
	
	void logic1() {
		System.out.println(" child method 1.....");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//PolymorphismoveridingExample obj = new PolymorphismoveridingExample();
		//obj.logic();
		//obj.logic1();
		
		PolymorphismoveridingExamplemain obj = new PolymorphismoveridingExamplemain();
	     obj.logic();
	     obj.logic1();
	
	
	}

}
