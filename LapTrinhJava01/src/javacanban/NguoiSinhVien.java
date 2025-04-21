package javacanban;

public class NguoiSinhVien extends Nguoi {
private double gpa;

public NguoiSinhVien(String ten, String ngaySinh, String diaChi, double gpa) {
	super(ten, ngaySinh, diaChi);
	this.gpa = gpa;
}
public void xinChao() {
	System.out.println("Hello 28Tech");
}
public void inThongTin() {
	//System.out.println(ten+" "+ngaySinh+" "+diaChi+" "+String.format("%.2f", gpa));
	super.inThongTin();
	System.out.printf("%.2f",gpa);
}
@Override
public String toString() {

return super.toString()+String.format("%.2f", gpa);
}

}
