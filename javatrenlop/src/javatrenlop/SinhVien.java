package javatrenlop;

public class SinhVien {
protected String hoten;
protected String nganhHoc;
public SinhVien(String hoten, String nganhHoc) {
	super();
	this.hoten = hoten;
	this.nganhHoc = nganhHoc;
}



@Override
public String toString() {
	return this.hoten+" "+this.nganhHoc;
}

}
