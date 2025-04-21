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
public class bai141 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String[] a=s.split("\\s+");
	TreeMap<String , Integer>map=new TreeMap<>();
	for(String x:a) {
		if(map.containsKey(x)==true) {
			map.put(x, map.get(x)+1);
		}
		else {
			map.put(x, 1);
		}
	}
	int tanSuatMax =0,tanSuatMin=Integer.MAX_VALUE;
	String res="",res1="";
	for(Map.Entry<String, Integer>entry:map.entrySet()) {
		if(entry.getValue() >= tanSuatMax) {
			tanSuatMax=entry.getValue();
			res=entry.getKey();
		}
		if(entry.getValue()<=tanSuatMin) {
			tanSuatMin=entry.getValue();
			res1=entry.getKey();
		}
	}
	System.out.println(res+" "+tanSuatMax);
	System.out.println(res1+" "+tanSuatMin);
}
}
