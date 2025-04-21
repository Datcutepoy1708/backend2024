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
public class bai136 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.nextLine();
	HashMap<String,Integer>map=new HashMap<>();
	for(int i=0;i<n;i++) {
		String s=sc.nextLine().toLowerCase();
		String[] a= s.split("/");
		int len=a.length;
		String email=a[len-2];
		for(int j=0;j<a.length-2;j++) {
			email+=a[j].charAt(0);
		}
		if(map.containsKey(email)==false) {
			System.out.println(email+"@xyz.edu.vn");
			map.put(email, 1);
		}
		else {
			map.put(email, map.get(email)+1);
			System.out.println(email+map.get(email)+"@xyz.edu.vn");
		}
		String[] b=a[len-1].split("/");
		for(String x:b) {
			System.out.print(Integer.parseInt(x));
		}
	}
}
}
