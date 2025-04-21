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
public class bai83 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	TreeMap<Integer,Integer>map=new TreeMap<>();
	for(int i=1;i<=n;i++) {
	  int x=sc.nextInt();
	  map.put(x,1);
	}
	for(int i=2;i<=n;i++) {
		for(int j=1;i<=n;i++) {
			int x=sc.nextInt();
			if(map.containsKey(x) && map.get(x)==i-1) {
				map.put(x, 1);
			}
		}
	}
	Set<Map.Entry<Integer, Integer>> set= map.entrySet();
	boolean check=false;
	for(Map.Entry<Integer, Integer> entry :set) {
		if(entry.getValue()==n) {
			System.out.print(entry.getKey()+" ");
			check=true;
		}
		if(!check) {
			System.out.println("NOT FOUND");
		}
	}
}
}
