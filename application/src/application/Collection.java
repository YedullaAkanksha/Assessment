package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Collection {
	static ArrayList<String> ar=new ArrayList<String>(Arrays.asList("f1","f2","f3"));
	
	public static void Sorting() {
//		ar.add("file1");
//		ar.add("file2");
//		ar.add("file0");
//	
	TreeSet t=new TreeSet(ar);
	System.out.println(t);

}

public static void addInput(String s){
	ar.forEach((x)-> {
		if(x.equals(s)) {
			System.out.println("File deleted1");
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
	int  flag=0;
	for(int i=0;i<ar.size();i++) {
		if(st.equals(ar.get(i))) {
			
			flag=1;
			ar.remove(st);
			System.out.println("File deleted successfully");
			}}
	if(flag==0) {
		System.out.println("file not found");
	}
		 
//		TreeSet t= new TreeSet(ar);
//		System.out.println(t);
		
	
	
}

public static void searchInput(String s1) {
	// TODO Auto-generated method stub
	int  flag=0;
	for(int i=0;i<ar.size();i++) {
		if(s1.equals(ar.get(i))) {
			flag=1;
			System.out.println("File Found at index "+i);
			}}
	if(flag==0) {
		System.out.println("file not found");
	}
		
		}
	
	
}

