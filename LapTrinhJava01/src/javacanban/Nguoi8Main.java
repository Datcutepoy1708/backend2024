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
public class Nguoi8Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    sc.nextLine();
   ArrayList<SinhVien8> arr1=new ArrayList<>();
   ArrayList<GiangVien8> arr2=new ArrayList<>();
   for(int i=0;i<n;i++) {
	   String ma=sc.nextLine();
	   if(ma.substring(0,2).equals("GV")) {
		   String ten=sc.nextLine();
		   String ngaySinh=sc.nextLine();
		   String diaChi=sc.nextLine();
		   String khoa=sc.nextLine();
		   int luong=Integer.parseInt(sc.nextLine());
		   String lop=sc.nextLine();
		   GiangVien8 gv=new GiangVien8(ma,ten,ngaySinh,diaChi,khoa,lop,luong);
		   gv.chuanHoa();
		   arr2.add(gv);
	   }
	   else {
		   String ten=sc.nextLine();
		   String ngaySinh=sc.nextLine();
		   String diaChi=sc.nextLine();
		   String lop=sc.nextLine();
		   double gpa=sc.nextDouble();
		   sc.nextLine();
		   SinhVien8 sv=new SinhVien8(ma,ten,ngaySinh,diaChi,lop,gpa);
		   sv.chuanHoa();
		   arr1.add(sv);
	   }
   }
   Collections.sort(arr1,new Comparator<SinhVien8>() {

	@Override
	public int compare(SinhVien8 o1, SinhVien8 o2) {
		if(o1.getGpa() != o2.getGpa()) {
			if(o1.getGpa() > o2.getGpa()) return -1;
		    return 1;
		}
		else { 
			return o1.getMa().compareTo(o2.getMa());
		
	}
	}  
   });
   Collections.sort(arr2,new Comparator<GiangVien8>() {

	@Override
	public int compare(GiangVien8 o1, GiangVien8 o2) {
	  if(o1.getLuong() != o2.getLuong()) {
		  if(o1.getLuong() > o2.getLuong()) return 1;
		  return -1;
	  }
	  else {
		  return o2.getMaGV().compareTo(o1.getMaGV());
	  }
	}
	   
   });
   	System.out.println("DANH SACH GIANG VIEN: ");
   	for(GiangVien8 x: arr2) {
   		System.out.println(x);
   	}
   	System.out.println("DANH SACH SINH VIEN: ");
   	for(SinhVien8 x: arr1) {
   		System.out.println(x);
   	}
}
}
