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
public class SinhVienMain2 {
public static String convert(String s) {
	String[] a=s.split("\\s+");
	String name="";
	for(String x:a) {
		name+=Character.toUpperCase(x.charAt(0));
		for(int i=1;i<x.length();i++){
			name+=Character.toLowerCase(x.charAt(i));
		}
	}
	return name.trim();
}
public static String ChuanHoa(String s) {
	StringBuilder sb=new StringBuilder(s);
	if(sb.charAt(1)=='/') {
		sb.insert(0, "0");
	}
	if(sb.charAt(4)=='/') {
		sb.insert(3, "0");
	}
	return sb.toString();
}
public static void main(String[] args) {
	SinhVien2 s=new SinhVien2(" "," ",0.0,0.0,0.0);
	s.nhap();
	s.xuat();
}
}
