package javatrenlop;

public class SinhVienBai4 {
protected String ten;
protected String nganh;
protected double diem;
public SinhVienBai4(String ten, String nganh, double diem) {
	super();
	this.ten = ten;
	this.nganh = nganh;
	this.diem = diem;
}
public double getDiem() {
	return diem;
}

public  String getHocLuc() {
	double diem=getDiem();
	if(diem < 5)
		return "Yeu";
	if(diem >=5 &&  diem < 6.5)
		return "Trung Binh";
	if(diem >=6.5 && diem < 7.5)
		return "Kha";
	if(diem >=7.5 && diem < 9)
		return " Gioi";
	else
		return "Xuat sac";
}
public void xuat() {
	System.out.println(this.ten+" "+this.nganh+ " "+getDiem()+" "+getHocLuc());
}
}
