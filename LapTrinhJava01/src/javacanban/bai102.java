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
public class bai102 {
public static int fisrtPos(int a[],int n,int x) {
	int l=0,r=n-1,ans=-1;
	while(l <=r) {
		int m=(l+r)/2;
		if(a[m]==x) {
			ans=m;
			r=m-1;
		}
		else if(a[m] <x) {
			l=m+1;
		}
		else {
			r=m-1;
		}
	}
	return ans;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(),x=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println(fisrtPos(a,n,x));
}
}
