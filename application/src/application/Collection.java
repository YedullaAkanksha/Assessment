package application;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Collection {
	static ArrayList<String> ar=new ArrayList<String>();

	public static void Sorting() {
		ar.add("file1");
		ar.add("file2");
		ar.add("file0");
	
	TreeSet t=new TreeSet(ar);
	System.out.println(t);

}

public static void addInput(String s){
	ar.forEach((x)-> {
		if(x.equals(s)) {
			System.out.println("File already exists");
			return;
			}
		});
	ar.add(s);
	TreeSet t= new TreeSet(ar);
//	System.out.println(t);
	Collection.Sorting();
	}

public static void removeInput(String st) {
	// TODO Auto-generated method stub
	ar.forEach((i)-> {
		if(i.equals(st)) {
			//System.out.println("File already exists");
			ar.remove(i);
			}
		else {
			System.out.println("File not found");
		}
	});
//		TreeSet t= new TreeSet(ar);
//		System.out.println(t);
		
	
	
}

public static void searchInput(String s1) {
	// TODO Auto-generated method stub
	ar.forEach((x)-> {
		if(x.equals(s1)) {
			System.out.println("File found");
			}
		else {
			System.out.println("File not found");
		}
		});
	
	
}

}