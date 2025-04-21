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
public class bai116 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Integer[] a=new Integer[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	Arrays.sort(a,Collections.reverseOrder());
	int ans=1,doCung=a[0];
	for(int i=1;i<n;i++) {
		if(doCung < 0) break;
		++ans;
		doCung=Math.min(a[i], doCung-1);
	}
	System.out.println(ans);
}
}
