package javapractice3;

import java.util.ArrayList;

public class collectionExample {

	public static void main(String args[]) {
/*	ArrayList al= new ArrayList();
	al.add("himanshu");
	al.add(25);
	al.add('c');
	System.out.println(al);
	}
	
	*/
//===========================================================
	
	ArrayList al= new ArrayList();
	al.add("himanshu");
	al.add(25);
	al.add('c');
	System.out.println(al);
	
    ArrayList al2= new ArrayList();
    al2.add("abc");
    al2.add(25);
    al2.add('c');
    System.out.println(al2);
    
    al.addAll(al2);
    System.out.println(al);
    System.out.println(al.contains(100));  // check value available or not
    System.out.println(al.isEmpty());      // check object is empty or not
    System.out.println(al.size());
    
    al.remove(1);         // 1= index
    System.out.println(al);
    
    al.removeAll(al2);        // use for remove same elements
    System.out.println(al);     
    
    al.clear();             // use for remove all
    System.out.println(al);
	}
}

