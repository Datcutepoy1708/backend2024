package javatrenlop;
import java.util.ArrayList;
import java.util.Scanner;
public class bai17 {
public static class SanPham{
	private String TenSanPham;
	private double donGia;
	private double giamGia;
	private double thueNhapKhau;
	private double giaTien;
 public SanPham(String TenSanPham,double donGia,double giamGia) {
	 this.TenSanPham=TenSanPham;
	 this.donGia=donGia;
	 this.giamGia=giamGia;
 }
 public double getthueNhapKhau(){
	 return donGia*0.10;
 }
 public double getGiaTien() {
	 return donGia-giamGia+thueNhapKhau;
 }
 public void xuat() {
	 System.out.println("Ten San Pham: "+TenSanPham );
	 System.out.println("Don Gia: "+donGia);
	 System.out.println("Giam Gia: "+giamGia);
	 System.out.println("Thue Nhap Khau: "+getthueNhapKhau());
	 System.out.println("Gia Tien: "+getGiaTien());
	}
 public void nhap() {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Nhap ten San Pham: ");
	 TenSanPham=sc.nextLine();
	 System.out.println("Nhap don gia: ");
	 donGia=sc.nextDouble();
	 System.out.println("Nhap giam Gia: ");
	 giamGia=sc.nextDouble();
 }
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Nhap so luong san pham: ");
	int n=sc.nextInt();
    sc.nextLine();
    ArrayList<SanPham> danhSachSanPham = new ArrayList<>();
    for(int i=0;i<n;i++) {
    	System.out.printf("Nhap san phan thu %d: ",i+1);
    	System.out.println();
    	SanPham sanPham = new SanPham("", 0.0, 0.0);
    	sanPham.nhap();
    	danhSachSanPham.add(sanPham);
    }
    for(int i=0;i<n;i++) {
    	System.out.printf("Ten san pham %d: ",i+1);
    	System.out.println();
        	danhSachSanPham.get(i).xuat();
    }
    
}
}
