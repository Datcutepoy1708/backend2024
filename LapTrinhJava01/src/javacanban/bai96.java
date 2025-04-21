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
import java.util.Comparator;
import java.util.Arrays;
public class bai96 {
	public static int chan(int n) {
		if(n==0) return 1;
		int cnt=0;
		while(n !=0) {
			if(n % 2==0) ++cnt;
			n/=10;
		}
		return cnt;
	}
	public static int le(int n) {
		if(n==0) return 1;
		int cnt=0;
		while(n !=0) {
			if(n % 2==1) ++cnt;
			n /=10;
		}
		return cnt;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Integer[] a=new Integer[n];
	Integer[] b=new Integer[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
		b[i]=a[i];
	}
	Arrays.sort(a,new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			if(chan(o1) != chan(o2))
				return chan(o1)-chan(o2);
			else
				return o1-o2;
		}
	});
	for(int i=0;i<n;i++) {
		System.out.print(a[i]+" ");
		
	}
	System.out.println();
	Arrays.sort(b,new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			if(le(o1) != le(o2))
				return le(o1)-le(o2);
			else
				return o1-o2;
		}
	});
	for(int i=0;i<n;i++) {
		System.out.print(b[i]+" ");
	}
}
}
