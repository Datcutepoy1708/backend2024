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
public class bai124 {
public static int[] dx= {-1,0,0,1};
public static int[] dy= {0,-1,1,0};
public static int n=0,m=0;
public static int[][] a=new int[100][100];
public static void loang(int i,int j) {
	a[i][j]=0;
	for(int k=0;k<4;k++) {
		int i1=i+dx[k];
		int j1=j+dy[k];
		if(i1 >=0 && i1 < n && j1 >=0 && j1<m&&a[i1][j1]==1) {
			loang(i1,j1);
		}
	}
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			a[i][j]=sc.nextInt();
		}
	}
	int dem=0;
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			if(a[i][j]==1) {
				++dem;
				loang(i,j);
			}
		}
	}
	System.out.println(dem);
}
}
