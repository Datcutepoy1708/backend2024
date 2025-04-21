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
public class loangtrenmang {
public static int[] dx= {-1,-1,-1,0,0,1,1,1};
public static int[] dy= {-1,0,1,-1,1,-1,0,1};
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(),m=sc.nextInt();
	int[][] a=new int[n][m];
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			a[i][j]=sc.nextInt();
		}
	}
	int dem=0;
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			boolean check=true;
			for(int k=0;k<8;k++) {
				int i1=i+dx[k];
				int j1=i+dy[k];
				if(i1 >=0 && i1 < n && j1>=0 && j1<m) {
					if(a[i1][j1] >=a[i][j]) {
						check=false;
						break;
					}
				}
			}
			if(check==true) {
				++dem;
			}
		}
	}
	System.out.println(dem);
}
}
