package javacanban;

public class SinhVienMain5 extends SinhVien5 {
	private String ma,lop;
	private double gpa;
	public SinhVienMain5(int ma, String  ten, String diaChi, String ngaySinh,  String lop, double gpa) {
		super(ten, diaChi, ngaySinh);
		this.ma = String.format("%04d",ma);
		this.lop = lop;
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return ma+" "+super.toString()+" "+lop+" "+String.format("%.2f", gpa);
	}
	

}
