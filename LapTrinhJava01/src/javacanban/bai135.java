package javacanban;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Collections;
import java.util.Comparator;
public class bai135 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.nextLine();
	for(int i=0;i<n;i++) {
		String s=sc.nextLine().toLowerCase();
		String[] a=s.split("\\s+");
		int x=a.length;
		String email=a[x-2];
		for(int j=0;j<x-2;j++) {
			email+=a[j].charAt(0);
		}
		System.out.println(email+"@xyz.edu.vn");
		String[] b=a[x-1].split("/");
		for(String e:b) {
			System.out.print(Integer.parseInt(e));
		}
	}
}
}
