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
public class Nguoi6Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	ArrayList<SinhVien6> arr1=new ArrayList<>();
	ArrayList<GiangVien6> arr2=new ArrayList<>();
	for(int i=0;i<n;i++) {
		sc.nextLine();
		String ma=sc.nextLine();
		String ten=sc.nextLine();
		String ngaySinh=sc.nextLine();
		String diaChi=sc.nextLine();
		if(ma.substring(0,2).equals("GV")) {
			String khoa=sc.nextLine();
			double luong=sc.nextDouble();
			GiangVien6 gv=new GiangVien6( ma,ten,ngaySinh,diaChi,khoa,luong);
			gv.chuanHoa();
			arr2.add(gv);
		}
		else {
			String lop=sc.nextLine();
			double gpa=sc.nextDouble();
			SinhVien6 sv=new SinhVien6(ma,ten,ngaySinh,diaChi,lop,gpa);
			sv.chuanHoa();
			arr1.add(sv);
		}
	}
	System.out.println("DANH SACH GiANG VIEN:");
	for(GiangVien6 x:arr2) {
		System.out.println(x);
	}
	System.out.println("DANH SACH SINH VIEN:");
	for(SinhVien6 x: arr1) {
		System.out.println(x);
	}
}
}
