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
public class SanPham2Main {
static ArrayList<SanPham2> arr =new ArrayList<>();
public static void nhap() {
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("Nhap ten san pham: ");
		String ten=sc.nextLine();
		System.out.println("Nhap gia san pham: ");
		Double gia=sc.nextDouble();
		arr.add(new SanPham2(ten,gia));
		sc.nextLine();
		String answer=sc.nextLine();
		if(answer.equalsIgnoreCase("N")) {
			break;
		}
	}
}
public static void sapxep() {
Collections.sort(arr,new Comparator<SanPham2>() {

	@Override
	public int compare(SanPham2 o1, SanPham2 o2) {
		return o2.getGia().compareTo(o1.getGia());
	}
});
for(SanPham2 x: arr) {
	System.out.println(x);
}
}
public static void xoa() {
  Scanner sc=new Scanner(System.in);
  System.out.println("Nhap ten san pham: ");
  String ten=sc.nextLine();
  boolean found = arr.removeIf(sp -> sp.getTensp().equalsIgnoreCase(ten));
  if (found) {
      System.out.println("San pham đa duoc xoa.");
  } else {
      System.out.println("Khong tim thay san pham.");
  }

  System.out.println("Danh sach san pham con lai:");
  for (SanPham2 x : arr) {
      System.out.println(x);
  }
}
public static void xuatGiaTB() {
	double sum=0;
	for(SanPham2 x: arr) {
		sum+=x.getGia();
	}
	System.out.println("Gia trung binh san pham:  "+sum / arr.size());
}
public static void main(String[] args) {
	System.out.println("MENU");
	System.out.println("1.Nhap danh sach san pham theo ban phim: ");
	System.out.println("2.Sap xep giam dan theo gia va xuat ra man hinh: ");
	System.out.println("3.Tim va xoa san pham theo ten nhap tu ban phim");
	System.out.println("Xuat gia trung binh cua cac san pham");
	System.out.println("5.Ket thuc");
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("Vui long nhap lua chon: ");
		int n=sc.nextInt();
		if(n==1) {
			nhap();
		}
		if(n==2) {
			sapxep();
		}
		if(n==3) {
			xoa();
		}
		if(n==4) {
			xuatGiaTB();
		}
		if(n==5) {
			System.out.println("Ket thuc chuong trinh");
			break;
		}
	}
}
}
