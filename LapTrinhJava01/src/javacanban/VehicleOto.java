package javacanban;

public class VehicleOto extends Vehicle{
private int maLuc;

public VehicleOto(String ma, String ten, String hang, String mau, int gia, int maLuc) {
	super(ma, ten, hang, mau, gia);
	this.maLuc = maLuc;
}

@Override
public String toString() {
	return super.toString()+" "+this.maLuc;

}
}