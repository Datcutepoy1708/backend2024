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
public class bai107 {
public static int firstPos(int a[] ,int l,int r,int x) {
	int ans=-1;
	while(l <=r) {
		int m=(l+r)/2;
		if(a[m]==x) {
			ans=m;
			r=m-1;
		}
		else if(a[m] >x) {
			r=m-1;
		}
		else {
			l=m+1;
		}
	}
	return ans;
}
public static int lastPos(int a[],int l,int r,int x) {
	int ans=-1;
	while(l <=r) {
		int m=(l+r)/2;
		if(a[m]==x) {
			ans=m;
			l=m+1;
		}
		else if(a[m] >x) {
			r=m-1;
		}
		else {
			l=m+1;
		}
	}
	return ans;
}
public static void main(String[] args ) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(),k=sc.nextInt();
	int [] a=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	long ans=0;
	for(int i=0;i<n;i++) {
		int p1=firstPos(a,i+1,n-1,a[i]+k);
		int p2=lastPos(a,i+1,n-1,a[i]+k);
		if(p1 != -1)
		   ans+=p2-p1+1;	
	}
	System.out.print(ans);
}
}
