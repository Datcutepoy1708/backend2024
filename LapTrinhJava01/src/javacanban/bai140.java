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
public class bai140 {
public static boolean check(String s) {
	int l=0, r=s.length()-1;
	while(l <= r) {
		if(s.charAt(l) != s.charAt(r))
			return false;
		++l;--r;
	}
	return true;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String[] a=s.split("\\s+");
    Arrays.sort(a,new Comparator<String>() {

		@Override
		public int compare(String a, String b) {
			if(a.length() != b.length())
				return a.length()-b.length();
			else
				return a.compareTo(b);
		}
    	
    });
    for(String x:a) {
    	if(check(x)) {
    		System.out.print(x+" ");
    	}
    }
}
}
