package javacanban;

public class VehicleMotobike extends Vehicle {
private int tocDo;

public VehicleMotobike(String ma, String ten, String hang, String mau, int gia, int tocDo) {
	super(ma, ten, hang, mau, gia);
	this.tocDo = tocDo;
}

@Override
public String toString() {
	return super.toString()+" "+this.tocDo;
}

}
