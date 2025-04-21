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
public class bai82 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
     TreeMap<Character,Integer> map=new TreeMap<>();
	for(int i=0;i<n;i++) {
		char c=sc.next().charAt(0);
		if(map.containsKey(c)) {
			map.put(c, map.get(c)+1);
		}else {
			map.put(c,1);
		}
	}
	System.out.println(map.firstKey()+" "+map.get(map.firstKey()));
	// first.key() la ham in ra ki tu dau tien
	System.out.println(map.lastKey()+" "+map.get(map.lastKey()));
	Set<Map.Entry<Character,Integer>> set=map.entrySet();
	ArrayList<Map.Entry<Character,Integer>> arr =new ArrayList<>();
	for(Map.Entry<Character,Integer> entry :set) {
		System.out.println(entry.getKey()+" "+entry.getValue());	
		arr.add(entry);
	}
	System.out.println();
	for(int i=arr.size()-1;i>=0;i--) {
		System.out.println(arr.get(i).getKey()+" "+arr.get(i).getValue());
	}
}
}
