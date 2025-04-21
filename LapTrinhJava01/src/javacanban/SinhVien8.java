package javacanban;

public class SinhVien8 extends Nguoi8{
private String lop,maSV;
private double gpa;
public SinhVien8(String maSV, String ten, String ngaySinh, String diaChi, String lop, double gpa) {
	super( ten, ngaySinh, diaChi);
	this.maSV=maSV;
	this.lop = lop;
	this.gpa = gpa;
}
public double getGpa() {
	return gpa;
}
public void setGpa(double gpa) {
	this.gpa = gpa;
}
public String getMa() {
	return maSV;
}
public String getLop() {
	return lop;
}
public void setLop(String lop) {
	this.lop = lop;
}
@Override
public String toString() {
    return this.maSV+" "+super.toString()+this.lop+" "+String.format("%.2f", gpa);
}

}
