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
public class bai88 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	TreeSet<Integer>hop=new TreeSet<>();
	TreeSet<Integer>set1=new TreeSet<>();
    TreeSet<Integer>set2=new TreeSet<>();
    for(int i=0;i<n;i++) {
    	int x=sc.nextInt();
    	set1.add(x);
    	hop.add(x);
    }
    for(int i=0;i<m;i++) {
    	int x=sc.nextInt();
    	set2.add(x);
    	hop.add(x);
    }
    for(int x:hop) {
    	if(!(set1.contains(x)&&set2.contains(x))) {
    		System.out.print(x+" ");
    	}
    }
}
}
