package javacanban;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Collections;
public class bai95 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	int[] a =new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	int dem=1;
	for(int i=1;i<n;i++) {
		if(a[i] !=a[i-1]) {
			dem++;
		}
	}
	System.out.println(dem);
}
}
