package javatrenlop;

public class SinhVienIT extends SinhVienPoly {
protected double diemJava;
protected double diemCss;
protected double diemHtml;
public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCss, double diemHtml) {
	super(hoTen, nganh);
	this.diemJava = diemJava;
	this.diemCss = diemCss;
	this.diemHtml = diemHtml;
}
@Override
public double getDiem() {
	return (2 * diemJava+diemCss+diemHtml) /4;
}
public void xuat() {
	System.out.println(hoTen+" "+getDiem()+" "+getHocLuc());
}
}
