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
public class bai131 {
public static boolean inHoa(String s) {
	for(int i=0;i<s.length();i++) {
		if(!Character.isUpperCase(s.charAt(i)))
			return false;
	}
	return true;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int dem=0;
	String[] a=s.split("\\s++");
	for(String x:a) {
		if(inHoa(x)) {
			++dem;
		}
	}
	System.out.println(dem);
}
}
