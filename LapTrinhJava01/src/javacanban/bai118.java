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
public class bai118 {
public static boolean thuanNghich(int n) {
	int tmp=n,rev=0;
	while(n !=0) {
		rev =rev * 10+ n % 10;
		n /=10;
	}
	return tmp==rev;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int[][] a=new int[n][m];
	for(int i=0;i<n;i++) {
		for(int j=0;j <m;j++) {
			a[i][j]=sc.nextInt();
		}
	}
   int cnt=0;
   for(int i=0;i<n;i++) {
	   for(int j=0;j<i;j++) {
		   if(thuanNghich(a[i][j])) {
			  cnt++;
		   }
	   }
   }
   System.out.println(cnt);
}
}
