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
public class bai146 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int m=sc.nextInt(),s=sc.nextInt();
	if(s > 9 *m|| s==0 && m >1) {
		System.out.println("NOT FOUND");
	}
	else {
		int[] X=new int[m];
		int[] Y=new int[m];
		int t=s;
		for(int i=0;i<m;i++) {
			if(s >=9) {
				X[i]=9;
				s-=9;
			}
			else {
				X[i]=s;s=0;
			}
		}
		--t;
		for(int i=m-1;i>0;i--) {
		if(t >=9) {
			Y[i]=9;
			t-=9;
		}
		else {
			Y[i]=t;
			t=0;
		}
		}
		Y[0]=t+1;
		for(int x:Y){
			System.out.print(x);
		}
		System.out.println();
		for(int x:X) {
			System.out.print(x);
		}
	}
}
}
