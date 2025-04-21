package javacanban;

public class GiangVien8 extends Nguoi8 {
private String maGV,khoa,lop;
private int luong;
public GiangVien8(String ten, String ngaySinh, String diaChi, String ma, String khoa, String lop, int luong) {
	super(ten, ngaySinh, diaChi);
	this.maGV = ma;
	this.khoa = khoa;
	this.lop = lop;
	this.luong = luong;
}
public String getMaGV() {
	return maGV;
}
public void setMaGV(String maGV) {
	this.maGV = maGV;
}
public String getLop() {
	return lop;
}
public void setLop(String lop) {
	this.lop = lop;
}
public int getLuong() {
	return luong;
}
public void setLuong(int luong) {
	this.luong = luong;
}
@Override
public String toString() {
	return this.maGV+" "+super.toString()+" "+this.khoa+" "+this.luong+" "+this.lop;
}

}
