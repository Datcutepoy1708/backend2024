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
public class bai126 {
public static String upper(String s) {
   String res="";
   for(int i=0;i<s.length();i++) {
	   res+=Character.toUpperCase(s.charAt(i));
   }
   return res;
}
public static String lower(String s) {
	String res="";
	for(int i=0;i<s.length();i++) {
		res+=Character.toLowerCase(s.charAt(i));
	}
	return res;
}
public static String lowers(String s) {
	String res="";
	for(int i=s.length()-1;i>=0;i--) {
		res+=Character.toLowerCase(s.charAt(i));
	}
	return res;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s;
	s=sc.nextLine();
	System.out.println(lower(s));
	System.out.println(lowers(s));
	System.out.println(upper(s));
}
}
