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
public class bai138 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine().toLowerCase();
	StringBuilder sb=new StringBuilder(s);
	for(int i=0;i<sb.length();i++) {
		if(!Character.isDigit(sb.charAt(i))) {
			sb.setCharAt(i, ' ');
		}
	}
	String[] a=sb.toString().split(" ");
	long x=-1;
	for(int i=0;i<a.length;i++) {
		if(!a[i].isEmpty()) {
			long c=Long.parseLong(a[i]);
			x=Math.max(c, x);
		}
	}
	System.out.println(x);
}
}
