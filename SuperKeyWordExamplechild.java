package javapractice3;

public class SuperKeyWordExamplechild extends SuperKeyWordExample{
	
	public SuperKeyWordExamplechild() {
		// this.display();     //wrong 
		// this.display2();    //wrong
	   super();
	   this.display();         //right
	   this.display2();        //right
	}

	void display2() {
		System.out.println("child method");
		
		//this.display();
		//this.display2();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperKeyWordExamplechild obj = new SuperKeyWordExamplechild();
		//obj.display();
		//obj.display2();
		

	}

}
