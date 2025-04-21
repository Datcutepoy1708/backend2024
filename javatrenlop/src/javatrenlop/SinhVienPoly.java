package javatrenlop;

public class SinhVienPoly extends SinhVien2 {
	protected double diem;
public SinhVienPoly(String hoTen, String nganh) {
		super(hoTen, nganh);
		this.diem=diem;
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
	System.out.print(this.hoTen+" "+this.nganh+ " "+getDiem()+" "+getHocLuc());
}
}
