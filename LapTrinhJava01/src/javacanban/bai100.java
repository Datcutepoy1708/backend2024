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
public class bai100 {
	public static int count(int n) {
		int ans=0;
		if(n==0) return 1;
		while(n != 10) {
			int r=n % 10;
			if(n==0|| n ==6||n==8) ++ans;
			n /=10;
		}
		return ans;
		
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Integer[] a=new Integer[n];
	for(int i=0;i<n;i++ ) {
		a[i]=sc.nextInt();
	}
	Arrays.sort(a,new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			if(count(o1) != count(o2))
				return count(o1) -count(o2);
			return o1-o2;
		}
		
	});
	for(int i=0;i<n;i++) {
		System.out.print(a[i]+" ");
	}
}
}
