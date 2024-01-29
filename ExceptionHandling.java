package javapractice3;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		
		// unchecked exception
		int a=8;
		int b='v';

		try {
			int c= a/b;
			System.out.println(c);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}finally {
			System.out.println("finally method");
		}
*/
//=========================================================

		/*
		try {
		int a=100, b=0, c;
		c=a/b;
		System.out.println(c);
		}
		catch(Exception e) {
			// System.out.println(e);      //they show exception type
			System.out.println("you can not divided by 0");
		}
		*/
//=======================================================
		/*
		//method of exception
		try {
			int a=100, b=0, c;
			c=a/b;
			System.out.println(c);
			}
			catch(Exception e) {
				e.printStackTrace();
				 System.out.println(e);
				 System.out.println(e.getMessage());
				 System.out.println(e.toString());
			}
			*/
//=======================================================
		// use finally block
		try {
			int a=100, b=0, c;
			c=a/b;
			System.out.println(c);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		finally {
			System.out.println("i am in finally block");
		}
	}

	}
