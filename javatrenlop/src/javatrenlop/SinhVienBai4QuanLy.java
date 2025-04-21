package javatrenlop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class SinhVienBai4QuanLy extends SinhVienBai4 {
	private ArrayList<SinhVienBai4> danhSach;
	private Scanner sc;
	public SinhVienBai4QuanLy(String ten, String nganh, double diem, ArrayList<SinhVienBai4> danhSach, Scanner sc) {
		super(ten, nganh, diem);
		this.danhSach = danhSach;
		this.sc = sc;
	}

	public void nhapThongTin() {
		System.out.println("Nhap ten sv: ");
		String ten=this.sc.nextLine();
		System.out.println("Nhap nganh: ");
		String nganh=this.sc.nextLine();
		System.out.println("Nhap diem: ");
		double diem=this.sc.nextDouble();
		this.sc.nextLine();
		SinhVienBai4 sv=new SinhVienBai4(ten,nganh,diem);
		danhSach.add(sv);
	}
	public void xuatThongTin() {
		for(SinhVienBai4 x:danhSach) {
			x.xuat();
			
		}
	}
	public void danhsachSVGioi() {
		for(int i=0;i<danhSach.size();i++) {
			SinhVienBai4 SV	=danhSach.get(i);
			if(SV.getHocLuc().equals("Gioi")|| SV.getHocLuc().equals("Xuat Sac")) {
				SV.xuat();
			}
		}
	}
	public void sapXep() {
		Collections.sort(danhSach, new Comparator<SinhVienBai4>() {

			@Override
			public int compare(SinhVienBai4 o1, SinhVienBai4 o2) {
				return Double.compare(o1.getDiem(), o2.getDiem());
			}
			
		});
		xuatThongTin();
	}
	public void menu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("---------------MENU-------------------");
		System.out.println("1.Nhap thong tin sinh vien");
		System.out.println("2.xuat danh sach sinh vien");
		System.out.println("3. Xuat danh sach sinh vien theo hoc luc Gioi");
		System.out.println("4.Sap xep sinh vien theo diem");
		System.out.println("5.Ket thuc");
		System.out.println("--------------MENU--------------------");
		while(true) {
			System.out.println("Nhap lua chon: ");
			int luachon=sc.nextInt();
			if(luachon==1) {
				nhapThongTin();
				
			}
			if(luachon==2) {
				xuatThongTin();
			}
			if(luachon==3) {
				danhsachSVGioi();
			}
			if(luachon==4) {
				sapXep();
			}
			if(luachon==5) {
				System.out.println("Ket thuc chuong trinh");
				break;
			}
		}
	}
}


