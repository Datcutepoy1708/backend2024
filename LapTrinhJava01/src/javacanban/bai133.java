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
public class bai133 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String[] a=s.split("\\s+");
	TreeMap<String,Integer> map=new TreeMap<>();
	for(String x:a) {
		if(map.containsKey(x)) {
			map.put(x, map.get(x)+1);
		}
		else {
			map.put(x, 1);
		}
	}
	for(Map.Entry<String, Integer>entry:map.entrySet()) {
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	System.out.println();
	for(String x:a) {
		if(map.containsKey(x)) {
			System.out.println(x+" "+map.get(x));
			map.remove(x);
		}
	}
}
}
