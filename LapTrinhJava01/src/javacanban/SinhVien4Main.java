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
public class SinhVien4Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	SinhVienMain4[] a= new SinhVienMain4[n];
	for(int i=0;i<n;i++) {
		String ma=String.format("%04d", i+1);
		sc.nextLine();
		String ten,ngaySinh,diaChi,lop;double gpa;
		ten=sc.nextLine();
		String s=sc.nextLine();
		lop=sc.nextLine();
		gpa=sc.nextDouble();
		int idx=-1;
		for(int j=0;j<s.length();j++) {
			if(Character.isAlphabetic(s.charAt(j))) {
				idx=j; break;
			}
		}
		ngaySinh=s.substring(0, idx);
		diaChi=s.substring(idx);
		a[i]=new SinhVienMain4(ma,lop,diaChi,ten,ngaySinh,gpa);
		a[i].chuanHoa();
	}
	for(SinhVienMain4 x:a) {
		System.out.println(x);
	}
}
}
