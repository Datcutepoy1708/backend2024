package javacanban;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Collections;
public class bai91 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	TreeSet<Character>set=new TreeSet<>();
	TreeSet<Character>set1=new TreeSet<>(Collections.reverseOrder());
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		char x=sc.next().charAt(0);
		set.add(x);
		set1.add(x);
	}
	for(char x:set) {
		System.out.print(x+" ");
	}
	System.out.println();
	for(char x:set1) {
		System.out.print(x+" ");
	}
}
}
