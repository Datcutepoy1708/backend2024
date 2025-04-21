package javatrenlop;
import java.util.Scanner;
public class hinhmain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		System.out.println("nhap chieu dai:");
	double dai=sc.nextDouble();
	System.out.println("Nhap chieu rong");
	double rong=sc.nextDouble();
	System.out.println("Nhap canh hinh vuong");
	double chv=sc.nextDouble();
	hinhchunhat cn=new hinhchunhat(dai,rong);
	hinhvuong   hv=new hinhvuong(chv);
	System.out.println("Thong tin hinh chu nhat");
	cn.xuat();
	System.out.println("Thong tin hinh vuong");
	hv.xuat();
}
}
