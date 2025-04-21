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
public class bai112 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	int cnt=1,ans=1,res=a[0];
	for(int i=1;i<n;i++) {
		if(a[i]==a[i-1]) {
			++cnt;
		}
		else {
			if(cnt >ans) {
				ans=cnt;
				res=a[i-1];
			}
			cnt=1;
		}
	}
	if(cnt > ans) {
		ans=cnt;
		res=a[n-1];
	}
	System.out.println(res+" "+ans);
}
}
