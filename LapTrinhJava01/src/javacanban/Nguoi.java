package javacanban;

public class Nguoi {
protected String ten,ngaySinh,diaChi;

public Nguoi(String ten, String ngaySinh, String diaChi) {
	this.ten = ten;
	this.ngaySinh = ngaySinh;
	this.diaChi = diaChi;
}
public void xinChao() {
	System.out.println("Hello 28Tech");
}
public void inThongTin() {
	System.out.print(ten+" "+ngaySinh+" "+diaChi);
}
@Override
public String toString() {
	return "Nguoi [ten=" + ten + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + "]";
}

}
