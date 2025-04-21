package javacanban;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Collections;
public class bai92 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	TreeMap<Integer,Integer>map=new TreeMap<>();
	for(int i=0;i<n;i++) {
		int x=sc.nextInt();
		if(map.containsKey(x)) {
			map.put(x, map.get(x)+1);
		}
		else {
			map.put(x, 0);
		}
	}
	for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
		System.out.print(entry.getValue()+" ");
	}
}
}
