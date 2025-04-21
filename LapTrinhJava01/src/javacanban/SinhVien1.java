package javacanban;
import java.util.Scanner;
public class SinhVien1 {
private String ten,ngaySinh;
private double toan,ly,hoa;
public String getTen() {
	return ten;
}
public void setTen(String ten) {
	this.ten = ten;
}
public String getNgaySinh() {
	return ngaySinh;
}
public void setNgaySinh(String ngaySinh) {
	this.ngaySinh = ngaySinh;
}
public double getToan() {
	return toan;
}
public void setToan(double toan) {
	this.toan = toan;
}
public double getLy() {
	return ly;
}
public void setLy(double ly) {
	this.ly = ly;
}
public double getHoa() {
	return hoa;
}
public void setHoa(double hoa) {
	this.hoa = hoa;
}
public SinhVien1(String ten, String ngaySinh, double toan, double ly, double hoa) {
	this.ten = ten;
	this.ngaySinh = ngaySinh;
	this.toan = toan;
	this.ly = ly;
	this.hoa = hoa;
}
public void nhap() {
	Scanner sc=new Scanner(System.in);
	 this.ten=sc.nextLine();
	this.ngaySinh=sc.nextLine();
	this.toan=sc.nextDouble();
	this.ly=sc.nextDouble();
	this.hoa=sc.nextDouble();
}
public double getTong() {
	return toan+ly+hoa;
}
public void xuat() {
	System.out.print(ten+" "+ngaySinh+" "+" "+getTong());
}
public String toString() {
	return ten+" "+ngaySinh+" "+String.format("%.1f", (toan+ly+hoa));
}
}
