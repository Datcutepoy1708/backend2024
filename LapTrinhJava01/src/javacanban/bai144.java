package javacanban;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Collections;
import java.util.Comparator;
public class bai144 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String[] a=new String[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.next();
	}
	Arrays.sort(a,new Comparator<String>() {

		@Override
		public int compare(String a, String b) {
			String ab=a+b;
			String ba=b+a;
			return ba.compareTo(ab);
		}
	});
	for(String x:a) {
		System.out.print(x);
	}
}
}
