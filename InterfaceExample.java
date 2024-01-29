package oopsexample;

public interface InterfaceExample {
       
	     // Abstract 
	     void info();
	     
	     // default method
	     
	     default void dis() {
	    	 System.out.println("default method of interface");
	     }
	     
	     // static method
	     static void dis1() {
	    	 System.out.println("static method of interface"); 
	     }
}
