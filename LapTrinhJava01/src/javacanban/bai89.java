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
public class bai89 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int [] a=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	int[] f=new int[n];
	HashSet<Integer>set=new HashSet<>();
	for(int i=n-1;i >=0;i--) {
		set.add(a[i]);
		f[i]=set.size();
	}
	int q=sc.nextInt();
	while(q-- >0) {
		int l=sc.nextInt();
		System.out.println(f[l]);
	}
}
}
