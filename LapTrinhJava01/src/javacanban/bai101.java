package javacanban;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
public class bai101 {
public static boolean check(int n) {
	if(n ==1) return false;
	for(int i=2;i<Math.sqrt(n);i++) {
		if(n % i==0)
			return false;
	}
	return true;
}
public static int count(int n) {
	int cnt=0;
	if(n < 2) return 0;
	while(n !=0) {
		int r=n % 10;
		if(check(r)) ++cnt;
		n /=10;
	}
	return cnt;
}
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	Integer[] a=new Integer[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	Arrays.sort(a,new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
		   if(count(o1) != count(o2))
			   return count(o1)-count(o2);
		   return o1-o2;
		}
		
	});
	for(int i=0;i<n;i++) {
		System.out.print(a[i]+" ");
	}
}
}
