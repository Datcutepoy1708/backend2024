package javacanban;

public class Nguoi6 {
private String ma,ten,ngaySinh,diaChi;

public Nguoi6(String ma, String ten, String ngaySinh, String diaChi) {
	this.ma = ma;
	this.ten = ten;
	this.ngaySinh = ngaySinh;
	this.diaChi = diaChi;
}

public void chuanHoa() {
	String[] arr=ten.trim().split("\\s+");
	String name="";
	for(String x:arr) {
		name+=Character.toUpperCase(x.charAt(0));
		for(int i=1;i<x.length();i++) {
			name+=Character.toLowerCase(x.charAt(i));
		}
		name+=" ";
	}
	this.ten=name.trim();
	StringBuilder sb=new StringBuilder(ngaySinh);
	if(sb.charAt(1)=='/') {
		sb.insert(0, "0");
	}
	if(sb.charAt(4)=='/') {
		sb.insert(3, "0");
	}
    this.ngaySinh=sb.toString();
}
@Override
public String toString() {
	return this.ma+" "+this.ten+" "+this.ngaySinh+" "+this.diaChi;
}
}
