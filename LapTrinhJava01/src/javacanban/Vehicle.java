package javacanban;

public class Vehicle {
private String ma,ten,hang,mau;
private int gia;
public Vehicle(String ma, String ten, String hang, String mau,  int gia) {
	this.ma = ma;
	this.ten = ten;
	this.hang = hang;
	this.mau = mau;
	this.gia = gia;
}
@Override
public String toString() {
	return this.ma+" "+this.ten+" "+this.hang+" "+this.mau+" "+" "+this.gia;
}
public String getHang() {
	return hang;
}
public void setHang(String hang) {
	this.hang = hang;
}

}
