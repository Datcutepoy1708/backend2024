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
public class bai128 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String[] a=s.split("\\s++");
	HashSet<String> set=new HashSet<>();
	Arrays.sort(a);
	for(String x:a) {
		System.out.print(x+" ");
	}
	System.out.println();
	Arrays.sort(a,Collections.reverseOrder());
	for(String x:a) {
		System.out.print(x+" ");
	}
}
}
