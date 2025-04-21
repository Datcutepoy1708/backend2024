package javatrenlop;
import java.util.Scanner;
public class SinhVienPolyMain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	// thong tin sinh vien IT
	System.out.println("Nhap thong tin sinh vien IT: ");
	String svIT=sc.nextLine();
	System.out.println("Nhap ten nganh: ");
	String nganhIT=sc.nextLine();
	System.out.println("Nhap diem Java: ");
	double diemJava=sc.nextDouble();
	System.out.println("Nhap diem Html: ");
	double diemHtml=sc.nextDouble();
	System.out.println("Nhap diem Css: ");
	double diemCss=sc.nextDouble();
	sc.nextLine();
	// thong tin sinh vien Biz
	System.out.println("Nhap thong tin sinh vien Biz: ");
	String svBiz=sc.nextLine();
	System.out.println("Nhap nganh sinh vien Biz");
	String nganhKT=sc.nextLine();
	System.out.println("Nhap dien Marketing: ");
	Double diemMarketing=sc.nextDouble();
	System.out.println("Nhap diem Sales: ");
	Double diemSales=sc.nextDouble();
	// 
	SinhVienIT ttsvIT=new SinhVienIT(svIT,nganhIT,diemJava,diemHtml,diemCss);
	SinhVienBiz ttsvBiz=new SinhVienBiz(svBiz,nganhKT,diemMarketing,diemSales);
    ttsvIT.xuat();
    ttsvBiz.xuat();
   
}
}
