package javacanban;
import java.util.Scanner;
public class SinhVien3 {
private String ma,ten,lop,ngaySinh;
private double gpa;
public SinhVien3(String ma, String ten, String lop, String ngaySinh, double gpa) {
	this.ma = ma;
	this.ten = ten;
	this.lop = lop;
	this.ngaySinh = ngaySinh;
	this.gpa = gpa;
}
public void chuanHoa() {
	String[] arr=ten.trim().split("\\s++");
	String name="";
	for(String x:arr) {
		name+=Character.toUpperCase(x.charAt(0));
		for(int i=1;i<x.length();i++) {
			name+=Character.toLowerCase(x.charAt(i));
		}
		name+=" ";
	}
}
public void chuanHoa1(){
	StringBuilder sb=new StringBuilder(ngaySinh);
	if(sb.charAt(1)=='/') {
		sb.insert(0, "0");
	}
	if(sb.charAt(4)=='/') {
		sb.insert(3, "0");
	}
	ngaySinh=sb.toString();
}

public String getMa() {
	return ma;
}
public void setMa(String ma) {
	this.ma = ma;
}
public double getGpa() {
	return gpa;
}
public void setGpa(double gpa) {
	this.gpa = gpa;
}
public String toString() {
	return ma+" "+ten+" "+lop+" "+ngaySinh+" "+String.format("%.1f", gpa);
}
}
