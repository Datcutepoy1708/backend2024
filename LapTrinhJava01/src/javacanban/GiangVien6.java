package javacanban;
public class GiangVien6 extends Nguoi6 {
private String khoa;
private double luong;
public GiangVien6(String ma, String ten, String ngaySinh, String diaChi, String khoa, double luong) {
	super(ma, ten, ngaySinh, diaChi);
	this.khoa = khoa;
	this.luong = luong;
}
@Override
public String toString() {
	return super.toString()+" "+this.khoa+ " " + this.luong;
}

}
