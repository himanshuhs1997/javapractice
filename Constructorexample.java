package oopsexample;

public class Constructorexample {
	
	

	//constructor => object create
	//			  => constructorName = className
	/*
	 * 
	 * 			type = 3types
	 * 
	 * 			(1) default constructor
	 * 			(2) parameterized constructor 
	 * 			(3) copy constructor
	 *
	 *
	 * */

	 // Default
	 
//	 Constructorexample() {
//		 System.out.println(" Defult constructor");
//	 }
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Constructorexample obj = new Constructorexample();
	
	
	        //addition
//	Constructorexample() {
//		int a=556;
//		int b=755;
//		int c=a+b;
//		System.out.println(c);
//	}
//	public static void main(String[] args) {
//		Constructorexample obj = new Constructorexample();
//	
	
	
	         //modules
//	Constructorexample() {
//		int a=5564;
//		int b=755;
//		int c=a%b;
//		System.out.println(c);
//	}
//	public static void main(String[] args) {
//		Constructorexample obj = new Constructorexample();
	
	
	      //Si ka program
//	Constructorexample() {
//		int a=58566;
//		int b=2;
//		int c= 5;
//		int d=(a*b*c)/100;
//		System.out.println(d);
//	}
//	public static void main(String[] args) {
//		Constructorexample obj = new Constructorexample();
	
	 
	
	
	     // parameterized
	
//	Constructorexample(String name){
//		System.out.println("name"+" "+name);
//	}
//	
//	public static void main(String[] args) {
//	
//		Constructorexample obj = new Constructorexample("abc");
	
	
	       // addition
//	Constructorexample(int a, int b){
//		
//		System.out.println(a+b);
//	}
//	 public static void main(String[] args) {
//	
//		Constructorexample obj = new Constructorexample(52,65);
	
	
	     // modules
//Constructorexample(int a, int b){
//		
//		System.out.println(a%b);
//	}
//	 public static void main(String[] args) {
//	
//		Constructorexample obj = new Constructorexample(525,65);
	
	
	         // Si ka program
//Constructorexample(int a, int b,int c){
//		
//		System.out.println((a*b*c)/100);
//	}
//	 public static void main(String[] args) {
//	
//		Constructorexample obj = new Constructorexample(52556,3,2);
	
	   
	
	// parameterrized constructor
//	Constructorexample(String name) {
//		this.x1=name;
//		System.out.println("name"+name);
//	}
	
	      //copy constructor
//	String x1;
//	Constructorexample(Constructorexample x) {
//		this.x1=x.x1;
//		System.out.println(this.x1);
//	}
//	 
//	   void display() {
//		   System.out.println(x1);
//	   }
//	
//	public static void main(String name[]) {
//		
//	Constructorexample obj = new Constructorexample("abc");
//	obj.display();
//	Constructorexample obj1 = new Constructorexample(obj);
//	obj1.display();
		
	
	 // addition
	
//	int a,b,c;
//	Constructorexample (int a, int b){
//		this.a=a;
//		this.b=b;
//		this.c=a+b;
//	}
//	Constructorexample(Constructorexample o) {
//		this.a=o.a;
//		this.b=o.b;
//		this.c=o.a+o.b;
//	}
//	void display() {
//		System.out.println(c);
//	}
//	
//	public static void main(String args []) {
//		Constructorexample obj = new Constructorexample(66,98);
//		obj.display();
//		Constructorexample obj1= new Constructorexample(obj);
//		obj1.display();
	
//	int a,b,c;
//	Constructorexample (int a, int b){
//		this.a=a;
//		this.b=b;
//		this.c=a*b;
//	}
//	Constructorexample(Constructorexample o) {
//		this.a=o.a;
//		this.b=o.b;
//		this.c=o.a*o.b;
//	}
//	void display() {
//		System.out.println(c);
//	}
//	
//	public static void main(String args []) {
//		Constructorexample obj = new Constructorexample(665,98);
//		obj.display();
//		Constructorexample obj1= new Constructorexample(obj);
//		obj1.display();
	
//	int a,b,c;
//	Constructorexample (int a, int b){
//		this.a=a;
//		this.b=b;
//		this.c=a%b;
//	}
//	Constructorexample(Constructorexample o) {
//		this.a=o.a;
//		this.b=o.b;
//		this.c=o.a%o.b;
//	}
//	void display() {
//		System.out.println(c);
//	}
//	
//	public static void main(String args []) {
//		Constructorexample obj = new Constructorexample(665,98);
//		obj.display();
//		Constructorexample obj1= new Constructorexample(obj);
//		obj1.display();
		
	
	  // Si ka program
	
	int a,b,c,d;
	Constructorexample (int a, int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=(a*b*c)/100;
	}
	Constructorexample(Constructorexample o) {
		this.a=o.a;
		this.b=o.b;
		this.c=o.c;
		this.d=(o.a*o.b*o.c)/100;
	}
	void display() {
		System.out.println(d);
	}
	
	public static void main(String args []) {
		Constructorexample obj = new Constructorexample(66554,3,2);
		obj.display();
		Constructorexample obj1= new Constructorexample(obj);
		obj1.display();
	
		
		
	
	
	
	
	
	}

}
