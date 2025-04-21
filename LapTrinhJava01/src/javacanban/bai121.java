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
public class bai121 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[][] a=new int[n][n];
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			a[i][j]=sc.nextInt();
		}
	}
	int x=sc.nextInt();
	int y=sc.nextInt();
	x--;y--;
	for(int i=0;i<n;i++) {
		int tmp=a[x][i];
		a[x][i]=a[y][i];
		a[y][i]=tmp;
	}
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
}
}
