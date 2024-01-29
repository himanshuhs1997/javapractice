package oopsexample;

public interface multipleIheritenceExample {
	
	default void Defaultmethod () {
		System.out.println("Default method 1.....");
	}

	static void Staticmethod() {
		System.out.println("static method 1......");	
	}

	abstract void d1();
}
