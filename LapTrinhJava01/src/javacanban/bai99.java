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
public class bai99 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[][] a=new int[n][3];
	for(int i=0;i<n;i++) {
		a[i][0]=sc.nextInt();
		a[i][1]=sc.nextInt();
		a[i][2]=sc.nextInt();
	}
	Arrays.sort(a,new Comparator<int []>() {

		@Override
		public int compare(int[] o1, int[] o2) {
			if(o1[0] != o2[0])
				return o1[0]-o2[0];
			if(o1[1] != o2[1])
				return o1[1]-o2[1];
			return o1[2]-o2[2];
		}
	});
	for(int i=0;i<n;i++) {
		System.out.print(a[i][0]+" "+a[i][1]+" "+a[i][2]);
		System.out.println();
	}
}
}
