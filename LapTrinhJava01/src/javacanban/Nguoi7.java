package javacanban;

public class Nguoi7 {
private String ma,ten,diaChi,ngaySinh;

public Nguoi7(String ma, String ten, String diaChi, String ngaySinh) {
	this.ma = ma;
	this.ten = ten;
	this.diaChi = diaChi;
	this.ngaySinh = ngaySinh;
}
public void chuanHoa() {
	String[] arr =ten.trim().split("\\s+");
	String name="";
	for(String x:arr) {
		name+=Character.toUpperCase(x.charAt(0));
		for(int i=1;i<x.length();i++) {
			name+=Character.toLowerCase(x.charAt(i));
		}
		name+=" ";
	}
	this.ten=name.substring(0,name.length()-1);
	StringBuilder sb=new StringBuilder(this.ngaySinh);
	if(sb.charAt(1)=='/') sb.insert(0, "0");
	if(sb.charAt(4)=='/') sb.insert(3, "/");
	this.ngaySinh=sb.toString();
}
@Override
public String toString() {
	return this.ma+" "+this.ten+" "+this.diaChi+" "+this.ngaySinh;
}
public String getDiaChi() {
	return diaChi;
}
public void setDiaChi(String diaChi) {
	this.diaChi = diaChi;
}

}
