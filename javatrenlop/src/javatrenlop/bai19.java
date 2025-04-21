package javatrenlop;
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
public class bai19 {
	static ArrayList<String> arr=new ArrayList<>();
public static void nhap() {
	Scanner sc=new Scanner(System.in);
	while(true) {
		String x=sc.nextLine();
		arr.add(x);
		System.out.println("Ban muon nhap tiep hay dung Y/N: ");
		String answer=sc.nextLine();
		if(answer.equalsIgnoreCase("N")) {
			break;
		}
	}
}
public static void xuat() {
	for(String x:arr) {
		System.out.println(x);
	}
}
public static void ngaunhien() {
	Collections.shuffle(arr);
	for(String x:arr) {
		System.out.println(x);
	}
}
public static void giamdan() {
	Collections.sort(arr);
	Collections.reverse(arr);
	for(String x: arr) {
		System.out.println(x);
	}
}
public static void xoa() {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	arr.removeIf(x->x.equalsIgnoreCase(a));
	for(String x:arr) {
		System.out.println(x);
	}
}
public static void main(String[] args) {
	System.out.println("MENU: ");
	System.out.println("1.nhap danh sach ho va ten: ");
	System.out.println("2.Xuat danh sach vua nhap: ");
	System.out.println("3.Xuat danh sach ngau nhien: ");
	System.out.println("4.Sap xep giam dan va xuat danh sach: ");
	System.out.println("5.Tim va xoa ho ten nhap tu ban phim: ");
	System.out.println("6.Ket thuc");
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("Nhap lua chon: ");
		int opt=sc.nextInt();
		if(opt==1) {
			nhap();
		}
		if(opt==2) {
			xuat();
		}
		if(opt==3) {
			ngaunhien();
		}
		if(opt==4) {
			giamdan();
		}
		if(opt==5) {
			xoa();
		}
		if(opt==6) {
			System.out.println("Ket thuc chuong trinh");
			break;
		}
	}
}
}
