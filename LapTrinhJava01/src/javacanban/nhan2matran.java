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
public class nhan2matran {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int p=sc.nextInt();
	int m=sc.nextInt();
	int[][] a=new int[n][m];
	int[][] b=new int[m][p];
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			a[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<m;i++) {
		for(int j=0;j<p;j++) {
			b[i][j]=sc.nextInt();
		}
	}
	int[][] c=new int[n][p];
	for(int i=0;i<n;i++) {
		for(int j=0;j<p;j++) {
			c[i][j]=0;
			for(int k=0;k<m;k++) {
				c[i][j]+=a[i][k]*b[k][j];
			}
		}
	}
}
}
