package javacanban;

public class SinhVien {
private String ten,ngaySinh;
private double gpa;

public SinhVien(String ten, String ngaySinh, double gpa) {
	super();
	this.ten = ten;
	this.ngaySinh = ngaySinh;
	this.gpa = gpa;
}
public void dangKiHoc() {
	System.out.println("Sinh vien co the dang ki hoc !");
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
public double getGpa() {
	return gpa;
}
public void setGpa(double gpa) {
	this.gpa = gpa;
}

}
