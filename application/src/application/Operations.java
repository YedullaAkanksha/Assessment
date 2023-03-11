package application;

import java.util.Scanner;

public class Operations {
	static void function() {
	Scanner s=new Scanner(System.in);
	int S=s.nextInt();
	Scanner s1=new Scanner(System.in);
	if(S==1) {
		System.out.println("Enter filename to add");
		//Scanner s1=new Scanner(System.in);
		String str=s1.nextLine();
		Collection.addInput(str);
		}
	else if(S==2) {
		System.out.println("Enter te file name to be remove :");
		//Scanner s2=new Scanner(System.in);
		String t = s1.nextLine();
		Collection.removeInput(t);
		}
	else if(S==3) {
		System.out.println("Enter te file name to search :");
		//Scanner s3=new Scanner(System.in);
		String st =s1.nextLine();
		Collection.searchInput(st);
	}
	else
		System.out.println("Invalid");
	

}}
