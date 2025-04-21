package javatrenlop;

public class hinhchunhat {
protected double dai;
protected double rong;
public hinhchunhat(double dai, double rong) {
	super();
	this.dai = dai;
	this.rong = rong;
}
public double getChuVi() {
	return (dai+rong)*2;
}
public double getDienTich() {
	return dai*rong;
}
public void xuat() {
	System.out.println(this.dai);
	System.out.println(this.rong);
	System.out.println(this.getChuVi());
	System.out.println(this.getDienTich());
}
@Override
public String toString() {
	return this.dai+" "+this.rong+" "+this.getChuVi()+" "+this.getDienTich();
}

}
