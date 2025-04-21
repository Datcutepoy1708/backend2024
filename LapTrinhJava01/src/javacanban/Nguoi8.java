package javacanban;

public class Nguoi8 {
private String ten,ngaySinh,diaChi;

public Nguoi8( String ten, String ngaySinh, String diaChi) {
	this.ten = ten;
	this.ngaySinh = ngaySinh;
	this.diaChi = diaChi;
}
public void chuanHoa() {
	String[] arr=this.ten.trim().split("\\s+");
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
	if(sb.charAt(4)=='/') sb.insert(3, "0");
	this.ngaySinh=sb.toString();
}
@Override
public String toString() {
	return  this.ten+" "+this.ngaySinh+" "+this.diaChi;
}

}
