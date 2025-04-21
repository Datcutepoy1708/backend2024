package javatrenlop;
import java.util.Scanner;
public class bai16 {
public static class SanPham{
	private String TenSanPham;
	private double donGia;
	private double giamGia;
	private double thueNhapKhau;
	
 public SanPham(String TenSanPham,double donGia,double giamGia) {
	 this.TenSanPham=TenSanPham;
	 this.donGia=donGia;
	 this.giamGia=giamGia;
	 
 }
 public double getthueNhapKhau(){
	 return donGia *0.10;
 }
 public void xuat() {
	 System.out.println("Ten San Pham: "+TenSanPham );
	 System.out.println("Don Gia(Vnd): "+donGia);
	 System.out.println("Giam Gia(Vnd): "+giamGia);
	 System.out.println("Thue Nhap Khau(Vnd): "+getthueNhapKhau());
	}
 public void nhap() {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Nhap ten San Pham: ");
	 TenSanPham=sc.nextLine();
	 System.out.println("Nhap don gia: ");
	 donGia=sc.nextDouble();
	 System.out.println("Nhap giam Gia: ");
	 giamGia=sc.nextDouble();
//	 thueNhapKhau=donGia * 0.10;
 }
}
public static void main(String[] args) {
	SanPham sanPham = new SanPham("", 0.0, 0.0);
	sanPham.nhap();
	sanPham.xuat();
}
}
