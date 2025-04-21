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
public class bai127 {
public static String lower(String s) {
	return s.toLowerCase();
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	s=lower(s);
	HashSet<String>set=new HashSet<>();
	 String a[]=s.split("\\s++");
	 for(int i=0;i<a.length;i++) {
		 set.add(a[i]);
	 }
	 System.out.println(set.size());
}
}
