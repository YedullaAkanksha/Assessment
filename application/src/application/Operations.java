package application;

import java.util.Scanner;

public class Operations {
	static void function() {
	Scanner s=new Scanner(System.in);
	int S=s.nextInt();
	switch(S) {
	case 1:
		System.out.println("Enter filename to add");
		String str=s.next();
		Collection.addInput(str);
		break;
	case 2:
		System.out.println("Enter te file name to be remove :");
		String st = s.next();
		Collection.removeInput(st);
		break;
	case 3:
		System.out.println("Enter te file name to search :");
		String s1 =s.next();
		Collection.searchInput(s1);
		break;
	default:
		System.out.println("Invalid");
	}

}}
