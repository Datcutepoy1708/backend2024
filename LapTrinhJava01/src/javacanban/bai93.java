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
public class bai93 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	TreeSet<Integer>set=new TreeSet<>();
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		set.add(sc.nextInt());
	}
	System.out.print(set.size());
	System.out.print(set.first()+" "+set.last());
	System.out.println();
	System.out.print(set.lower(set.last())+" "+set.higher(set.first()));
	//set.lower : ho tro tim so lon thu 2
	// set.first : tim so be thu 2
}
}
