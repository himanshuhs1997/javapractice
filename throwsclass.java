package javapractice3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class throwsclass {
	void readfile() throws FileNotFoundException {
		FileInputStream fis= new FileInputStream("e:/bca.txt");
	}
	
    void savefile() throws FileNotFoundException {
    	String text= "this is demo";
    	FileOutputStream fos = new FileOutputStream("d:/xyz.txt");
    }
  
	public static void main(String[] args) {

		throwsclass rw = new throwsclass();
		try {
			rw.readfile();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			rw.savefile();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}}


