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
public class bai113 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(),m=sc.nextInt();
	int[] a=new int[n];
	int[] b=new int[m];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<m;i++) {
		b[i]=sc.nextInt();
	}
	int i=0,j=0;
	while(i < n && j < m) {
		if(a[i] <= b[j]) {
			System.out.printf("b%d ",i+1);
			i++;
		}
		else {
			System.out.printf("c%d ",j+1);
			j++;
		}
	}
	while(i <n) {
		System.out.printf("b%d ",i+1);
		i++;
	}
	while(j <m) {
		System.out.printf("c%d ",j+1);
		j++;
	}
}
}
