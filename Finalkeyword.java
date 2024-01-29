package javapractice3;

// public final class Finalkeyword{    // when we use final key word , class are not extend in other class
public class Finalkeyword {
	
	/*
	 * 
	 *   final keyword :- variable => constant / value fixed
	 *                 :- method => prohibited from overriding
	 *                 :- class => inherited
	 * */

	final void display() {
		 System.out.println("final method");
	 }
	 
	 public static void main(String args[]) {
	final	 int a= 52;
		 System.out.println(a);
		// a=55;                    // they are useless after final keyword use in first value
		// System.out.println(a);
		 
	 }
}