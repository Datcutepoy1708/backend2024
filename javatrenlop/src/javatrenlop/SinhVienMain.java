package javatrenlop;
import java.util.Scanner;
public class SinhVienMain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Nhap ten sinh vien: ");
	String tsv=sc.nextLine();
	System.out.println("Nhap nganh hoc sinh vien: ");
	String nh=sc.nextLine();
	System.out.println("Nhap diem sinh vien: ");
	double diem=sc.nextDouble();
	SinhVien1 sv=new SinhVien1(tsv,nh,diem);
	sv.xuat();
}
}
