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
public class bai142 {
public static boolean check(String s) {
	String res="python";
	int j=0;
	for(char x:s.toCharArray()) {
		if(x==res.charAt(j)) {
			++j;
		}
		if(j==6) {
			return true;
		}
	}
	return false;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	if(check(s)) {
		System.out.println("YES");
	}
	else {
		System.out.println("NO");
	}
}
}
