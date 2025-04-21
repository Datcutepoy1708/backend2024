package javatrenlop;

public class SinhVien1 extends SinhVien {
private double diem;
public SinhVien1(String hoten, String nganhHoc,double diem) {
	super(hoten,nganhHoc);
	this.diem=diem;
}
public double getDiem() {
	return diem;
}
public void setDiem(double diem) {
	this.diem = diem;
}
public String getHocLuc() {
	if(this.diem < 5)
		return "Yeu";
	if(this.diem >=5 && this.diem < 6.5)
		return "Trung Binh";
	if(this.diem >=6.5 && this.diem < 7.5)
		return "Kha";
	if(this.diem >=7.5 && this.diem <9)
		return "Gioi";
	else
		return "Xuat sac";
}
public void xuat() {
	System.out.print(this.hoten+" "+this.nganhHoc+" "+this.diem+" "+this.getHocLuc());
}
}
