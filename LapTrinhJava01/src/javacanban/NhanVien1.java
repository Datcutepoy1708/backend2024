package javacanban;
import java.util.Scanner;
public class NhanVien1 {
	private String ten,gioiTinh,ngaySinh,queQuan,ngayKi;
	private int ma;
	public NhanVien1(String ten, String gioiTinh, String ngaySinh, String queQuan, String ngayKi, int ma) {
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.queQuan = queQuan;
		this.ngayKi = ngayKi;
		this.ma = ma;
}
public static String convert(String s) {
	String[] a=s.split("\\s+");
	String name="";
	for(String x:a) {
		name+=Character.toUpperCase(x.charAt(0));
		for(int j=1;j<x.length();j++) {
			name+=Character.toLowerCase(x.charAt(j));
		}
		name+=" ";
	}
	return name.trim();
}
public static String ChuanHoa(String s){
	StringBuilder sb=new StringBuilder(s);
	if(sb.charAt(1)=='/') {
		sb.insert(0, "0");
	}
	if(sb.charAt(4)=='/') {
		sb.insert(3, "0");
	}
	return sb.toString();
}
public void nhap() {
	Scanner sc=new Scanner(System.in);
	this.ten=sc.nextLine();
	this.gioiTinh=sc.nextLine();
	this.ngaySinh=sc.nextLine();
	this.queQuan=sc.nextLine();
	this.ma=sc.nextInt();
	sc.nextLine();
	this.ngayKi=sc.nextLine();
}
public void xuat() {
	System.out.print("00001"+" "+convert(ten)+" "+ChuanHoa(ngaySinh)+" "+convert(queQuan)+" "+ma+" "+ChuanHoa(ngayKi));
}
}
