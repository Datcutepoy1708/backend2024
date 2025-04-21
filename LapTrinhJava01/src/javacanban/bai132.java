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
public class bai132 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	TreeMap<Character,Integer>map=new TreeMap<>();
	for(int i=0;i<s.length();i++) {
		if(map.containsKey(s.charAt(i))) {
			map.put(s.charAt(i), map.get(s.charAt(i))+1);
		}
		else {
			map.put(s.charAt(i), 1);
		}
	}
   for(Map.Entry<Character, Integer>entry :map.entrySet()) {
	   System.out.println(entry.getKey()+" "+entry.getValue());
   }
   for(char x:s.toCharArray()) {
	   if(map.containsKey(x)) {
		   System.out.println(x+" "+map.get(x));
		   map.remove(x);
	   }
   }
}
}
