package javacanban;
import java.util.Scanner;
public class NhanVien {
private String ten,gioiTinh,ngaySinh,queQuan,ngayKi;
private int ma;
public NhanVien(String ten, String gioiTinh, String ngaySinh, String queQuan, String ngayKi, int ma) {
	this.ten = ten;
	this.gioiTinh = gioiTinh;
	this.ngaySinh = ngaySinh;
	this.queQuan = queQuan;
	this.ngayKi = ngayKi;
	this.ma = ma;
}
public void nhap() {
	Scanner sc=new Scanner(System.in);
	this.ten=sc.nextLine();
	this.gioiTinh=sc.nextLine();
	this.ngaySinh=sc.nextLine();
	this.queQuan=sc.nextLine();
	this.ma=sc.nextInt();
	sc.nextLine();
	this.ngayKi=sc.nextLine();
}
public void xuat() {
	System.out.print("00001"+" "+ten+" "+gioiTinh+" "+ngaySinh+" "+queQuan+" "+ma+" "+ngayKi);
}
}
