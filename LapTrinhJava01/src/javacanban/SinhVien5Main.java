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
public class SinhVien5Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	ArrayList<SinhVienMain5> arr=new ArrayList<>();
	SinhVienMain5[] a=new SinhVienMain5[n];
	for(int i=0;i<n;i++) {
		sc.nextLine();
		String ten=sc.nextLine();
		String ngaySinh=sc.nextLine();
		String diaChi=sc.nextLine();
		String lop=sc.nextLine();
		double gpa=sc.nextDouble();
		SinhVienMain5 sinhVien=new SinhVienMain5(i+1,ten,ngaySinh,diaChi,lop,gpa);
		sinhVien.chuanHoa();
		arr.add(sinhVien);
	}
	Collections.sort(arr , new Comparator<SinhVienMain5>() {

		@Override
		public int compare(SinhVienMain5 o1, SinhVienMain5 o2) {
			return o1.getSortedName().compareTo(o2.getSortedName());
		}
		
	});
	for(SinhVienMain5 x: arr) {
		System.out.println(x);
	}
}
}
