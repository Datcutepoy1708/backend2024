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
public class bai87 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int[] a=new int[n];
	int[] b=new int[m];
	HashMap<Integer,Integer>map=new HashMap<>();
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
		map.put(a[i], 1);
	}
	for(int i=0;i<m;i++) {
		b[i]=sc.nextInt();
		if(map.containsKey(b[i])) {
			map.put(b[i], 2);
		}
	}
	for(int x:a) {
		if(map.containsKey(x)&&map.get(x)==1) {
			System.out.print(x+" ");
			map.remove(x);
		}
	}
}
}
