package javatrenlop;
import java.util.Scanner;
public class cau3NhanVien {
private String hoTen;
private String gioiTinh;
private String ngaySinh;
private String diaChi;
public String getHoTen() {
	return hoTen;
}
public void setHoTen(String hoTen) {
	this.hoTen = hoTen;
}
public String getGioiTinh() {
	return gioiTinh;
}
public void setGioiTinh(String gioiTinh) {
	this.gioiTinh = gioiTinh;
}
public String getNgaySinh() {
	return ngaySinh;
}
public void setNgaySinh(String ngaySinh) {
	this.ngaySinh = ngaySinh;
}
public String getDiaChi() {
	return diaChi;
}
public void setDiaChi(String diaChi) {
	this.diaChi = diaChi;
}
public cau3NhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi) {
	super();
	this.hoTen = hoTen;
	this.gioiTinh = gioiTinh;
	this.ngaySinh = ngaySinh;
	this.diaChi = diaChi;
}
public cau3NhanVien() {
	this.diaChi="";
	this.gioiTinh="";
	this.hoTen="";
    this.ngaySinh="";
}
public void input() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Nhap ho va ten: ");
	this.hoTen=sc.nextLine();
	System.out.println("Nhap gioi tinh: ");
	this.gioiTinh=sc.nextLine();
	System.out.println("nhap ngay sinh: ");
	this.ngaySinh=sc.nextLine();
	System.out.println("Nhap dia chi: ");
	this.ngaySinh=sc.nextLine();
}
public void output() {
	System.out.println("ho va ten: "+this.hoTen);
	System.out.println("gioi tinh: "+this.gioiTinh);
	System.out.println("ngay sinh: "+this.ngaySinh);
	System.out.println("dia chi: "+this.diaChi);
}
}
