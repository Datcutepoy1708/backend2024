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
public class SinhVienMain3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	SinhVien3[] a=new SinhVien3[n];
	for(int i=0;i<n;i++) {
		String ma=String.format("%03d", i+1);
		ma="SV"+ma;
		a[i]=new SinhVien3(ma,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble());
		sc.nextLine();
		a[i].chuanHoa();
		a[i].chuanHoa1();
	}
	Arrays.sort(a,new Comparator<SinhVien3>() {
		public int compare(SinhVien3 a, SinhVien3 b) {
			if(a.getGpa() != b.getGpa()) {
				if(a.getGpa() < b.getGpa())
					return -1;
				else
					return 1;
			
			}
			else
				return a.getMa().compareTo(b.getMa());
		}
	});
	for(SinhVien3 x:a) {
		System.out.println(x);
	}
}
}
