package oopsexample;

//Absraction :- data hiding

	/*
	 *   access specifier   :-   public, private, protected, default
	 *   
	 *   abstract class     :- abstract key-word
	 *						:-   We can't create object of abstract class 		
	 *						:-   we can write default and static method and also main() in abstract class
	 *
	 *   				abstract class A{
	 *   						String name = "sbi";
	 *   						abstract void info();	
	 *   					}
	 *   
	 *   interface         :-interface   :- pure abstract class... means it consists only abstract methods
	 *                     :-   We can't create object of interface   
	 *   				   :- after launching jdk 1.8 we can write static and default method in interface.
	 *   				   :- interface key-word
	 *   				   :- we have to create public method of abstract method of interface..
	 *   
	 *   				eg:-   interface A{
	 *   
	 *   								void info();//abstract method..
	 *									
	 *									//static method... 
	 *									static void display(){
	 *                                
	 *                                }
	 *
	 *									//default method...	
	 *									default void dis(){
	 *
	 *									}				   	
	 *                  }
	 *                       
	 *                       class B implements A{
	 * 							//implementation of abstract method of interface...
	 * 							void info(){
	 *                         
	 *                         }
	 * }
	 * */
	


          // (for abstraction practice we create 3 class.==>> 1. same class, 2. faltuclassabstraction 
          //                          in same package , 3. exampleopps2 package class=publicAbstraction

public class AbstractionExample {

	           //public :- same package- every class , other package- every class
	
//	       public void dis() {
//	    	 System.out.println("public method");  
//	       }
//	       
//	       public static void main(String args[]) {
//	    	   AbstractionExample obj = new AbstractionExample();
//	    	   obj.dis();
//	       }
	       
	     //private :- only same class
	   	
//	       private void dis1() {
//	    	   System.out.println("private method");
//	       }
//	       
//	       public static void main(String args[]) {
//	    	   AbstractionExample obj = new AbstractionExample();
//	    	   obj.dis1();
//	       }
	
	
	//protected :- same package,same package- every class, different package- only sub class
//	protected void dis2() {
// 	   System.out.println("protected method");
//    }
//    
//    public static void main(String args[]) {
// 	   AbstractionExample obj = new AbstractionExample();
// 	   obj.dis2();
//    }  
	
	    
	       //default :- same package - every class 
	         void dis3() {
	 	   System.out.println("default method");
	    }
	        
	    public static void main(String args[]) {
	 	   AbstractionExample obj = new AbstractionExample();
	 	   obj.dis3();
	    } 
}
