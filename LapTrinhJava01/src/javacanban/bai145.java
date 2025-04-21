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
public class bai145 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int[] cnt=new int[256];
	for(char x:s.toCharArray()) {
		cnt[x]++;
	}
	long ans=s.length();
	for(int i=0; i<256;i++) {
		ans+=1l *cnt[i]*(cnt[i]-1) /2;
	}
	System.out.println(ans);
}
}
