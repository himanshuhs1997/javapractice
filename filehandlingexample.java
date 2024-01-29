package javapractice3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class filehandlingexample {
	
	/*
	 *   file :- collection of record...
	 *   
	 *   fileHandling :- (1)write (2)read
	 *   
	 *   write :- FileWriter(class) | BuffereWriter(class)
	 *   
	 *   read :- FileReader(class) | BuffereRead(class)
	 * 
	 * 
	 * */
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// to making file 
		
		File f = new File("E:\\himanshu.txt");     //file path with filename
		
		//to making object filewriter
		FileWriter Fw = new FileWriter(f);
//		Fw.write("i want become tester");
//		Fw.write("\n");
//		Fw.write("jirhihkre");
//		Fw.close();
//		
		BufferedWriter Bw = new BufferedWriter(Fw);
		Bw.write("Name - Himanshu sharma ");
		Bw.newLine();
		Bw.write("Education - batchlor of engineering");
		Bw.newLine();
		Bw.write("post - quality analyst");
		Bw.newLine();
	    Bw.write("salary - 25200");
	    Bw.close();
	    Fw.close();
	    
	    //===============================================
	    
	    // read
	    
	    FileReader Fr = new FileReader(f);
	    
	    BufferedReader Br = new BufferedReader(Fr);
	    
	    String s1 = "";
	    String s2 = "";
	    
	    while((s2=Br.readLine())!=null) {
	    	s1= s1+s2+"\n";
	    }
	    System.out.println(s1+" ");
	}

}
