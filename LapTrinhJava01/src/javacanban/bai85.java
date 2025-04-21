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
public class bai85 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	TreeSet<Integer>set=new TreeSet<>(Collections.reverseOrder());
	for(int i=0;i<n+m;i++) {
		int x=sc.nextInt();
		set.add(x);
	}
	for(int x: set) {
		System.out.print(x+" ");
	}
}
}
