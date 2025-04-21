package javatrenlop;

public class SanPham2 {
private String tensp;
private Double gia;
public SanPham2(String tensp, double gia) {
	this.tensp = tensp;
	this.gia = gia;
}
public String getTensp() {
	return tensp;
}
public void setTensp(String tensp) {
	this.tensp = tensp;
}
public Double getGia() {
	return gia;
}
public void setGia(double gia) {
	this.gia = gia;
}
@Override
public String toString() {
	return this.tensp+" "+this.gia;
}


}
