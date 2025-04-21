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
import java.util.InputMismatchException;
import java.util.Collections;
import java.util.Comparator;
public class Nguoi7Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.nextLine();
	ArrayList<SinhVien7> arr1=new ArrayList<>();
	ArrayList<GiangVien7> arr2=new ArrayList<>();
	for(int i=0;i<n;i++) {
		String ma=sc.nextLine();
		String ten=sc.nextLine();
		String ngaySinh=sc.nextLine();
		String diaChi=sc.nextLine();
		if(ma.substring(0,2).equals("GV")) {
			String khoa=sc.nextLine();
			int luong=Integer.parseInt(sc.nextLine());
			String lop=sc.nextLine();
			GiangVien7 gv=new GiangVien7(ma,ten,ngaySinh,diaChi,khoa,luong,lop);
			gv.chuanHoa();
			arr2.add(gv);
		}
			else {
			    String lop = sc.nextLine();
			    if (sc.hasNextDouble()) {
			        double gpa = sc.nextDouble();
			        sc.nextLine();
			        SinhVien7 sv = new SinhVien7(ma, ten, ngaySinh, diaChi, lop, gpa);
			        sv.chuanHoa();
			        arr1.add(sv);
			    } else {
			        sc.next(); // Loại bỏ giá trị không hợp lệ
			    }
			}	
	}
	String diaChi=sc.nextLine().trim();
	System.out.println("DANH SACH SINH VIEN CO DIA CHI "+ diaChi+":");
	for(SinhVien7 x:arr1) {
		if(x.getDiaChi().equals(diaChi)) {
			System.out.println(x);
		}
	}
	System.out.println("DANH SACH GIANG VIEN CO DIA CHI "+ diaChi+ ":" );
	for(GiangVien7 x: arr2) {
		if(x.getDiaChi().equals(diaChi)) {
			System.out.println(x);
		}
	}
}
}
