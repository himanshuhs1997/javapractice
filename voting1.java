package javapractice3;
/*
 
     // customized compile time exception
      
class underAgeException extends Exception {
	underAgeException() {
		super("you are under age");
	}

	underAgeException(String msg) {
		super(msg);
	}
}

public class voting1 {
	public static void main(String args[]) {
		int age = 19;
		try {
			if (age < 18) {
				throw new underAgeException("You can not vote as your age below 18");
			} else {
				System.out.println("You can vote successfully.");
			}
		} catch (underAgeException e) {
			e.printStackTrace();
		}
	}
}*/

//======================================================================


    // customized runtime exception

class underAgeException extends RuntimeException {
	underAgeException() {
		super("you are under age");
	}

	underAgeException(String msg) {
		super(msg);
	}
}

public class voting1 {
	public static void main(String args[]) {
		int age = 19;
		try {
			if (age < 18) {
				throw new underAgeException("You can not vote as your age below 18");
			} else {
				System.out.println("You can vote successfully.");
			}
		} catch (underAgeException e) {
			e.printStackTrace();
		}
	}
}