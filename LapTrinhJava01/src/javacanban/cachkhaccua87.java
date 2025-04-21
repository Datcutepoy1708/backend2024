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
public class cachkhaccua87 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	TreeSet<Integer>set1=new TreeSet<>();
	TreeSet<Integer>set2=new TreeSet<>();
	int[] a=new int[n];
	int[] b=new int[m];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
		set1.add(a[i]);
	}
	for(int i=0;i<m;i++) {
		b[i]=sc.nextInt();
		set2.add(b[i]);
	}
	set1.removeAll(set2);
	for(int x:set1) {
		System.out.print(x+" ");
	}
}
}
