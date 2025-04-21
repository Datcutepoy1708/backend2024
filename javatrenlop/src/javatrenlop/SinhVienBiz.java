package javatrenlop;

public class SinhVienBiz extends SinhVienPoly{
protected double diemMarketing;
protected double diemSales;
public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSales) {
	super(hoTen, nganh);
	this.diemMarketing = diemMarketing;
	this.diemSales = diemSales;
}
@Override
public double getDiem() {
	return (2*diemMarketing+diemSales) /3;
}
public void xuat() {
	System.out.println(hoTen+" "+getDiem()+" "+getHocLuc());
}
}
