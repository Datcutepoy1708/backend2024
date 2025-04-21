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
public class SanPham1Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("THONG TIN SAN PHAM 1");
	System.out.println("Nhap ten sp: ");
	String tenSP1=sc.nextLine();
	System.out.println("Don gia: ");
	double donGia1=sc.nextDouble();
	System.out.println("Giam gia: ");
	double giamGia1=sc.nextDouble();
	sc.nextLine();
	SanPham1 sp1=new SanPham1(tenSP1, donGia1, giamGia1);
	System.out.println("NHAP THONG TIN SAN PHAM 2: ");
	System.out.println("Ten san pham: ");
	String tenSP2=sc.nextLine();
	System.out.println("Don gia: ");
	double donGia2=sc.nextDouble();
	SanPham1 sp2=new SanPham1(tenSP2,donGia2);
	System.out.println("THONG TIN SAN PHAM 1: ");
	sp1.xuat();
	System.out.println("THONG TIN SAN PHAM 2: ");
	sp2.xuat();
}
}
