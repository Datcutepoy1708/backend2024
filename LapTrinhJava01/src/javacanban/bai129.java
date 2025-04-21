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
public class bai129 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String[] a=s.split("\\s+");
	Arrays.sort(a,new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
		   if(o1.length() != o2.length())
			   return o1.length()-o2.length();
		   return o1.compareTo(o2);
		}
		
	}) ;
	for(String x:a) {
		System.out.print(x+" ");
	}
}
}
