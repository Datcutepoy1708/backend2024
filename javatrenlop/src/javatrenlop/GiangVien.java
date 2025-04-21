package javatrenlop;
import java.util.Scanner;
public class GiangVien extends cau3NhanVien{
private String LopDay;
private String buoiDay;
private double luong1h;
private int soGio;
public GiangVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String lopDay, double luong1h,
		int soGio) {
	super(hoTen, gioiTinh, ngaySinh, diaChi);
	this.LopDay = lopDay;
	this.buoiDay=buoiDay;
	this.luong1h = luong1h;
	this.soGio = soGio;
}
public GiangVien() {
	super();
	this.LopDay="";
	this.buoiDay="";
	this.luong1h=0;
	this.soGio=0;
}
public String getBuoiDay() {
	return buoiDay;
}
public void setBuoiDay(String buoiDay) {
	this.buoiDay = buoiDay;
}
public String getLopDay() {
	return LopDay;
}
public void setLopDay(String lopDay) {
	LopDay = lopDay;
}
public double getLuong1h() {
	return luong1h;
}
public void setLuong1h(double luong1h) {
	this.luong1h = luong1h;
}
public int getSoGio() {
	return soGio;
}
public void setSoGio(int soGio) {
	this.soGio = soGio;
};
@Override
public void input() {
	super.input();
	Scanner sc=new Scanner(System.in);
	System.out.println("Nhap lop day: ");
	this.LopDay=sc.nextLine();
	System.out.println("Nhap buổi dạy: ");
	this.buoiDay=sc.nextLine();
	System.out.println("nhap luong 1 gio: ");
	this.luong1h=sc.nextDouble();
	System.out.println("nhap so gio: ");
	this.soGio=sc.nextInt();
}
public double luongThucNhan() {
	if(this.buoiDay.equalsIgnoreCase("S")) {
		return this.luong1h*this.soGio;
	}
	else
		return this.luong1h*this.soGio*1.2;
}
@Override
public void output() {
	super.output();
	System.out.println("Lop day: "+this.LopDay);
	System.out.println("Buổi day: "+this.buoiDay);
	System.out.println("luong 1h: "+this.luong1h);
	System.out.println("so gio: "+this.soGio);
	System.out.println("Luong Thuc Nhan: "+this.luongThucNhan());
}
}
