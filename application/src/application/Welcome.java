package application;

import java.util.Arrays;
import java.util.Scanner;

public class Welcome {
	
	public static void welcomeScreen() throws Exception {
		System.out.println("Welcome to Company Locker's pvt ltd");
			System.out.println("Developer:Yedulla Akanksha,Emp id:10850");
			Scanner sc = new Scanner(System.in); {
			System.out.println("enter your choice");
			System.out.println("1.sorting\n2.file operations\n3.exit");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				 Collection.Sorting();
				 break;
			case 2:
				System.out.println("enter your choice");
				System.out.println("1.add\n2.delete\n3.search");
				Operations.function();
				break;
			case 3:
				System.out.println("exit");
				break;
			default:
				System.out.println("Invalid");
				
			}
		}
			System.out.println("you wanna Start again press 1");
			int n=sc.nextInt();
			if(n==1) {
				Welcome.welcomeScreen();
			}
			
			
	}
	
	

}
