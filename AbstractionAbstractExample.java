package oopsexample;

public abstract class AbstractionAbstractExample {
	
	String bankname = "SBI";
	
	// other/normal method
	
	void bankinfo() {
		String branchname = "indore";
		String managername = "abc";
		
		System.out.println(branchname+" "+managername);
	}
	 
	// Abstract method
	 abstract void managerdetails();
	 
	public static void main(String args[]) {
		System.out.println("abstract main method");
		// AbstractionAbstractExample.
	 }
	 
	

}
