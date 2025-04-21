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
public class bai106 {
public static int firstPos(int a[], int n,int x) {
	int l=0,r=n-1,ans=-1;
	while(l <= r) {
		int m=(l+r)/2;
		if(a[m]==x) {
			ans=m;
			r=m-1;
		}
		else {
			l=m+1;
		}
	}
	return ans;
}
public static int lastPos(int a[],int n,int x) {
	int l=0,r=n-1,ans=-1;
	while(l <= r) {
		int m=(l+r)/2;
		if(a[m] < x) {
			ans=m;
			l=m+1;
		}else {
			r=m-1;
		}
	}
	return ans;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int [] a=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	int q=sc.nextInt();
	while(q-- >0) {
		int t1=sc.nextInt(),t2=sc.nextInt();
		System.out.println(lastPos(a,n,t2)-firstPos(a,n,t1)+1);
	}
}
}
