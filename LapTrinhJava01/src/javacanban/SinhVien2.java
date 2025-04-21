package javacanban;
import java.util.Scanner;
public class SinhVien2 {
	public static String convert(String s) {
		String[] a=s.split("\\s+");
		String name="";
		for(String x:a) {
			name+=Character.toUpperCase(x.charAt(0));
			for(int i=1;i<x.length();i++){
				name+=Character.toLowerCase(x.charAt(i));
			}
			name+=" ";
		}
		return name.trim();
	}
	public static String ChuanHoa(String s) {
		StringBuilder sb=new StringBuilder(s);
		if(sb.charAt(1)=='/') {
			sb.insert(0, "0");
		}
		if(sb.charAt(4)=='/') {
			sb.insert(3, "0");
		}
		return sb.toString();
	}
private String ten,ngaySinh;
private double d1,d2,d3;
public SinhVien2(String ten, String ngaySinh, double d1, double d2, double d3) {
	this.ten = ten;
	this.ngaySinh = ngaySinh;
	this.d1 = d1;
	this.d2 = d2;
	this.d3 = d3;
}
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
public double getD1() {
	return d1;
}
public void setD1(double d1) {
	this.d1 = d1;
}
public double getD2() {
	return d2;
}
public void setD2(double d2) {
	this.d2 = d2;
}
public double getD3() {
	return d3;
}
public double getTong() {
	return d1+d2+d3;
}
public void setD3(double d3) {
	this.d3 = d3;
}
public void nhap() {
	Scanner sc=new Scanner(System.in);
	this.ten=sc.nextLine();
	this.ngaySinh=sc.nextLine();
	this.d1=sc.nextDouble();
	this.d2=sc.nextDouble();
	this.d3=sc.nextDouble();
}
public void xuat() {
	System.out.printf(("SV001"+" "+convert(ten)+" "+ChuanHoa(ngaySinh)+" "+"%.1f"),getTong());
}
}
