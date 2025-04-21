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
public class bai111 {
public static int tong(int n) {
	int sum=0;
	if(n==0) return 0;
	while(n !=0) {
		sum+=n % 10;
		n /=10;
	}
	return sum;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Integer[] a=new Integer[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	Arrays.sort(a,new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			if(tong(o1) != tong(o2))
				return tong(o1)- tong(o2);
			else 
				return o1-o2;
		}
	});
	for(int x:a) {
		System.out.print(x+" ");
	}
}
}
