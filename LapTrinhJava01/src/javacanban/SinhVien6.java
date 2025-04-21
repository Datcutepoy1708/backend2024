package javacanban;

public class SinhVien6 extends Nguoi6 {
	private String lop;
	private double gpa;
	public SinhVien6(String ma, String ten, String ngaySinh, String diaChi, String lop, double gpa) {
		super(ma, ten, ngaySinh, diaChi);
		this.lop = lop;
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return super.toString()+" "+this.lop+" "+String.format("%.2f", this.gpa);
	}
	

}
