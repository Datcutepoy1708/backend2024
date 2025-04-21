package javacanban;

public class SinhVienMain4 extends SinhVien4 {
private String ma,lop;
private double gpa;
public SinhVienMain4(String ten, String ngaySinh, String diaChi, String ma, String lop, double gpa) {
	super(ten, ngaySinh, diaChi);
	this.ma = ma;
	this.lop = lop;
	this.gpa = gpa;
}
@Override
public String toString() {
	return ma+" "+super.toString()+" "+lop+" "+String.format("%.2f", gpa);
}
}
