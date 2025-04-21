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
public class linearSearch {
public static boolean linearSearch(int a[],int n,int x) {
	for(int i=0;i<n;i++) {
		if(a[i]==x)
			return true;
	}
	return false;
}
public static boolean binarySearch(int a[],int n,int x) {
	int l=0,r=n-1;
	while(l <=r) {
		int m=(l+r)/2;
		if(a[m]==x) return true;
		else if(a[m] < x) {
			l=m+1;
		}
		else {
			r=m-1;
		}
	}
	return false;
}
public static int firstPos(int a[],int n,int x) {
	int l=0,r=n-1,ans=-1;
	while(l <= r) {
		int m=(l+r)/2;
		if(a[m]==x) {
			ans=m;
			r=m-1;
		}
		else if(a[m] < x) {
			l=m+1;
		}
		else {
			r=m-1;
		}
	}
	return ans;
}
public static int firstPosition(int a[],int n,int x) {
	int l=0,r=n-1,ans=-1;
	while(l <=r) {
		int m=(l+r)/2;
		if(a[m] >x) {
			ans=m;
			r=m-1;
		}
		else {
			l=m+1;
		}
	}
    return ans;
}
}
