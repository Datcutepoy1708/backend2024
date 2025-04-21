package javatrenlop;

public class hinhvuong extends hinhchunhat{
 public hinhvuong(double canh) {
	 super(canh,canh);
 }

@Override
public void xuat() {
	System.out.println(dai);
	System.out.println(getChuVi());
	System.out.println(getDienTich());
}
}

