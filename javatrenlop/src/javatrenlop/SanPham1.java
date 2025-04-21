package javatrenlop;

public class SanPham1 {
private String tenSP;
private double donGia;
private double giamGia;
public SanPham1(String tenSP, double donGia, double giamGia) {
	this.tenSP = tenSP;
	this.donGia = donGia;
	this.giamGia = giamGia;
}
public SanPham1(String tenSP, double donGia) {
	this(tenSP,donGia,0);
}
private double getThueThuNhap() {
	return this.donGia *0.1;
}

public String getTenSP() {
	return tenSP;
}
public void setTenSP(String tenSP) {
	this.tenSP = tenSP;
}
public double getDonGia() {
	return donGia;
}
public void setDonGia(double donGia) {
	this.donGia = donGia;
}
public double getGiamGia() {
	return giamGia;
}
public void setGiamGia(double giamGia) {
	this.giamGia = giamGia;
}
public void xuat() {
	System.out.println("Ten san pham: "+this.tenSP);
	System.out.println("Don gia: "+this.donGia);
	System.out.println("Giam gia: "+this.giamGia);
	System.out.println("Thue thu nhap : "+getThueThuNhap());
}
}
