package oopsexample;

public class InterfaceExampleClass implements InterfaceExample {

	
    public void info() {
 	   System.out.println("Abstract class in interface method");
    }
	
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
       
    	InterfaceExampleClass obj = new InterfaceExampleClass();
    	obj.info();
    	obj.dis();
    	InterfaceExample.dis1();
	
	}



}
