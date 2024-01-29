package dataTypeExample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class javapracticeexample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//File Read and Write Program

	/*	File f= new File("e://sharma.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		fw.write("manual testing");
		fw.write("\n");
		fw.write("automation testing");
		bw.close();
		fw.close();
		*/
		
	/*	FileWriter fw= new FileWriter("e://sharma1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("name - himanshu sharma");
		bw.newLine();
		bw.write("Desination-  Automation testing");
		bw.newLine();
		bw.write("Location - indore");
		bw.close();
		fw.close();
		*/
		
//------------------------------------------------------------------		
	/*
		FileReader fr = new FileReader("e://sharma1.txt");
		BufferedReader br= new BufferedReader(fr);
		String s="";
		String s1="";
		while((s1=br.readLine())!=null) {
			s= s+s1+"\n";
		}
		System.out.println(s+" ");
	*/
	
		/*
	FileReader fr = new FileReader("e://sharma.txt");
	BufferedReader br = new BufferedReader(fr);
	String s="";
	String s1="";
	while((s1=br.readLine())!=null) {
		s=s+s1+"\n";
	}
	System.out.println(s);
	*/
		
//==============================================================================
		
		 //String ---immutable
		/*
		String s= "himanshu";
		s=s+" "+"sharma";
		System.out.println(s);
		*/
		
		
		//swap string 
		/*
		String a= "himanshu";
		String b = "sharmaab";
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a+" "+b);
		*/
		
		/*
		 //Swap String 
		 
		String a= "hmnshu";
		String b= "sharma";
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a+" "+b);
	*/
	
		
//====================================================
		
		// String buffer
		
	/*	StringBuffer sb = new StringBuffer("himanshu ");
		sb.append(" sharma");
		System.out.println(sb);
		*/
//=======================================================
		/*
		//String builder
		StringBuilder SB = new StringBuilder("himanshu ");
		SB.append(" sharma");
		System.out.println(SB);
		*/
//===================================================		
	
	  // string reverse
		
	/*	String s1= "himanshu";
		String s2= "";
		char ch[] = s1.toCharArray();
		for (int i=0; i<=ch.length-1; i++) {
			s2=ch[i]+s2;
		}
	System.out.println(s2);
	*/
		
//===========================================================================
		
	/*	//reverse and check length
		String s1= "himanshu sharma";
		String s2= "";
		int len= s1.length();
		System.out.println(len);
		char ch[]= s1.toCharArray();
		for(int i=0; i<=ch.length-1; i++) {
			s2=ch[i]+s2;
		}
	System.out.println(s2);
	*/
//===========================================================================
	
	// for each loop
		/*
		int ar[] = {8,5,6,4,7,9,5,4};
		for(int a:ar) {
			System.out.print(a+" ");
		}
		*/
//=========================================================================
		
		// single array 
	/*	
		int ar[] = new int[6];
		 ar[0] = 85;
		 ar[1]= 95;
		 ar[2]= 65;
		 ar[3] =87;
		 ar[4] =25;
		 ar[5]=58;
		 for(int i=0;i<=5; i++) {
			 System.out.println(ar[i]);
		 }
	*/
//========================================================================
	
		/*
		int ar[] = {85,65,98,54,21,54,65};
		for (int i=0; i<ar.length-1; i++) {
			System.out.println(ar[i]);
		}
	*/
//===================================================================
		
		// accending order
		/*
		int ar[] = {9,5,4,6,3,2,7,8,1};
		int temp;
		for(int i=0; i<=ar.length-1; i++) {
			for(int j=i; j<=ar.length-1; j++) {
				if (ar[i] > ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			System.out.println(ar[i]+" ");
		}
		*/
//==========================================================================
		
		//Descending order
		/*
		int pr[]= {85,65,98,25,45,12,32,65,45};
		int temp;
		for(int i=0; i<=pr.length-1; i++) {
			for(int j=i; j<=pr.length-1; j++) {
				if(pr[i]<pr[j]) {
					temp=pr[i];
					pr[i]=pr[j];
					pr[j]=temp;
				}
			}
			System.out.println(pr[i]);
		}
		*/
//==========================================================
		
		// p---descending
		/*
		int cr[] = {65,85,45,15,25,36,63,69,65,75};
		int temp;
		for (int i=0; i<=cr.length-1; i++) {
			for (int j=i; j<=cr.length-1; j++) {
				if (cr[i]<cr[j]) {
					temp=cr[i];
					cr[i]=cr[j];
					cr[j]=temp;
				}
			}
			System.out.println(cr[i]);
		}
	*/
		
//========================================================
		
		//maximum no.
	/*	
		int ar[] = {85,65,98,52,15,45,36,02,58};
		int max=0;
		for(int i=0; i<=ar.length-1; i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		System.out.println(max);
		*/
		
//===============================================================
		
		// maximun no. 
		/*
		int br[] = {2,6,5,4,8,7,9,3,1};
		int max =0;
		for(int i=0; i<=br.length-1;i++) {
			if(br[i]>max) {
				max=br[i];
			}
		}
		System.out.println(max);
		*/
//==================================================================
		
		//small
		/*
		int cr[] = {98,54,25,12,65,36,75,45,99};
		int small=cr[0];
		for(int i=0; i<=cr.length-1;i++) {
			if(cr[i]<small) {
				small=cr[i];
			}
		}
		System.out.println(small);
       */
		
//==================================================================
		
		//small
		/*
		int br[] = {1,5,9,8,7,6,4,3};
		int small=br[0];
		for(int i=0; i<=br.length-1; i++) {
			if(br[i]<small) {
				small = br[i];
			}
		}
		System.out.println(small);
		*/
		
//=========================================================================
		
		//sec. max 
	/*	
		int ar[] = {85,62,35,55,98,75,12,3};
		int max=0;
		int secmax=0;
		for(int i=0; i<=ar.length-1; i++) {
			if(ar[i]>max) {
				secmax=max;
				max=ar[i];
			}
			 else if 
				(ar[i]>secmax && ar[i]<max) {
					secmax= ar[i];
				}
			}
		System.out.println("max"+max+" "+"secmax"+secmax);
		
     */
//===============================================================	
		
		//max. no
		/*
		int ar[] = {9,8,5,7,4,6,2,3,1};
		int max=0;
		int secmax=0;
		for(int i=0; i<=ar.length-1; i++) {
			if(ar[i]>max) {
				secmax=max;
				max=ar[i];
			}
			else if (ar[i]>secmax && ar[i]<max) {
				secmax=ar[i];
			}
		}
		System.out.println("max"+max+" "+"secmxa"+secmax);
	   
	   */
		
//====================================================================
		
		// secsmall
	/*	
		int ar[] = {9,8,5,7,4,6,2,3,1};
		int small =ar[0];
		int secsmall=ar[0];
		for(int i=0; i<=ar.length-1; i++) {
			if(ar[i]<small) {
				secsmall =small;
				small=ar[i];
			}
			else if(ar[i]>secsmall) {
				secsmall=ar[i];
			}
		}
		System.out.println("secsmall "+secsmall+" "+"small "+small);
		*/
//====================================================================
		// add 2 array
		/*
		int ar1[] = {1,2,3};
		int ar2[] = {4,5,6};
		int len= ar1.length;
		for(int i=0; i<len; i++) {
			System.out.println(ar1[i]+ar2[i]+" ");
		}
		*/
		
//=================================================================
		
		//add 2 array
		/*
		int ar1[] = {1,2,3};
		int ar2[] = {4,5,6};
		int length = ar1.length;
		for(int i=0; i<length; i++) {
			System.out.println(ar1[i]+ar2[i]+" ");
		}
		*/
		
//=================================================================
		
		int ar1[] = {4,5,6};
		int ar2[] = {7,8,9};
		int len= ar1.length;
		for(int i=0; i<len; i++) {
			System.out.println(ar1[i]+" "+ar2[i]+" ");
		}
}}