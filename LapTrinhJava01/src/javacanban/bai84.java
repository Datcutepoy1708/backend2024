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
public class bai84 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	TreeSet<Integer> set=new TreeSet<>();
	for(int i=0;i<n;i++) {
		int x=sc.nextInt();
		set.add(x);
	}
	int q=sc.nextInt();
	for(int i=0;i<q;i++) {
		int tt=sc.nextInt();
		if(tt==1) {
			int x=sc.nextInt();
			set.add(x);
		}
		if(tt==2) {
			int x=sc.nextInt();
			if(set.contains(x)) {
				set.remove(x);
			}
		}
		else if(tt==3) {
			System.out.println(set.first());
		}
		else {
			System.out.println(set.last());
		}
	}
}
}
