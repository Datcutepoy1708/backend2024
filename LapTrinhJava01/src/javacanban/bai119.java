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
public class bai119 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	int[][] a=new int[n][n];
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("Pattern 1:");
	for(int i=0;i <n;i++) {
		for(int j=0;j<n;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("Pattern 2:");
	for(int i=n-1;i>=0;i--) {
		for(int j=n-1;j >=0;j--) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("Pattenr 3:");
	for(int i=n-1;i>=0;i--) {
		for(int j=0;j<n;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("Pattern 4:");
	for(int i=0;i <n;i++) {
		for(int j=n-1;j>=0;j--) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
}
}
