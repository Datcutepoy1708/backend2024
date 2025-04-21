package javatrenlop;

public class SanPham {
private String tenSP;
private double donGia;
private double giamGia;
public SanPham(String tenSP, double donGia, double giamGia) {
	this.tenSP = tenSP;
	this.donGia = donGia;
	this.giamGia = giamGia;
}
public SanPham(String tenSP, double donGia) {
	this(tenSP,donGia,0);
}
private double getThueThuNhap() {
	return this.donGia *0.1;
}
public void xuat() {
	System.out.println("Ten san pham: "+this.tenSP);
	System.out.println("Don gia: "+this.donGia);
	System.out.println("Giam gia: "+this.giamGia);
	System.out.println("Thue thu nhap : "+getThueThuNhap());
}
}
