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
public class bai130 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String t="";
    for(int i=0;i<s.length();i++) {
        char c=s.charAt(i);
        if(c==','||c=='.'||c=='!'||c=='?')
        	t+=" ";
        else
        	t+=c;
    }
    String[] a=t.split("\\s++");
    for(String x:a) {
    	System.out.print(x+" ");
    }
}
}
