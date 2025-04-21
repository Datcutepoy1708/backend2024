package javacanban;

public class SinhVien7 extends Nguoi7 {
private String lop;
private double gpa;
public SinhVien7(String ma, String ten, String diaChi, String ngaySinh, String lop, double gpa) {
	super(ma, ten, diaChi, ngaySinh);
	this.lop = lop;
	this.gpa = gpa;
}
@Override
public String toString() {
	return super.toString()+" "+this.lop+" "+String.format("%.2f", this.gpa);
}

}
