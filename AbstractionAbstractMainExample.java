package oopsexample;

public class AbstractionAbstractMainExample extends AbstractionAbstractExample{
	
	void managerdetails() {
		String managername = "abc";
		String employeid = "525";
		String salary = "85200";
		
		System.out.println(managername+" "+employeid+" "+salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractionAbstractMainExample obj = new AbstractionAbstractMainExample();
		System.out.println(obj.bankname);
		obj.bankinfo();
		obj.managerdetails();
		
		
	}

}
