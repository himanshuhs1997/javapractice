package javapractice3;

import java.util.Scanner;
/*
public class youngerAgeException extends RuntimeException 
{
	youngerAgeException(String msg) {
		super(msg);
	}
}
class voting{	
public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
		System.out.println("enter your age: ");
		int age= s.nextInt();
		try {
			if(age<18) {
				throw new youngerAgeException("you are not eligible for voting");
			}else {
				System.out.println("you can vote successfully");
			}
		}catch(youngerAgeException e){
			e.printStackTrace();
		}
	}
}*/

import java.util.Scanner; // Import the Scanner class

class YoungerAgeException extends RuntimeException {
    YoungerAgeException(String msg) {
        super(msg);
    }
}
public class Voting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = s.nextInt();
        
        try {
            if (age < 18) {
                throw new YoungerAgeException("You are not eligible for voting.");
            } else {
                System.out.println("You can vote successfully.");
            }
        } catch (YoungerAgeException e) {
            e.printStackTrace();
        }
    }
}

