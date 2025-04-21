package javacanban;

public class GiangVien7 extends Nguoi7 {
private String khoa,lop;
private int luong;
public GiangVien7(String ma, String ten, String diaChi, String ngaySinh, String khoa, int luong,String lop) {
	super(ma, ten, diaChi, ngaySinh);
	this.khoa = khoa;
	this.lop = lop;
	this.luong=luong;

}
@Override
public String toString() {
	return  super.toString()+" "+this.khoa+" "+this.luong+" "+this.lop;
}

}
