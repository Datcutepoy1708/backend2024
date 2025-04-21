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
public class chuanhoaten {
public static String convert(String s) {
	// Nguyen Van NAm
	String[] a=s.split("\\s+");
	String name="";
	for(String x:a) {
		name+=Character.toUpperCase(x.charAt(0));
		for(int j=1;j <x.length();j++) {
			name+=Character.toLowerCase(x.charAt(j));
		}
		name+=" ";
	}
	return name.trim();
}
public static String chuanHoa(String s) {
	StringBuilder sb=new StringBuilder(s);
	if(sb.charAt(1)=='/') {
		sb.insert(0, "0");
	}
	if(sb.charAt(4)=='/') {
		sb.insert(3,"0" );
	}
	return sb.toString();
}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String s=sc.nextLine();
	System.out.println(convert(s));
	String ns=sc.nextLine();
	System.out.println(chuanHoa(ns));
}
}
