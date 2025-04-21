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
public class bai122 {
public static boolean nguyenTo(int n) {
	if(n < 2) return false;
	for(int i=2;i<=Math.sqrt(n);i++) {
		if(n % i==0)
			return false;
	}
	return true;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[][] a=new int[n][n];
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			a[i][j]=sc.nextInt();
		}
	}
	int dem=0;
	for(int i=0;i<n;i++) {
		if(nguyenTo(a[i][i])) ++dem;
		if(nguyenTo(a[i][n-i-1])) ++dem;
	}
	if(n % 2==1) {
		if(nguyenTo(a[n/2][n/2])) --dem;
	}
	System.out.println(dem);
}
}
