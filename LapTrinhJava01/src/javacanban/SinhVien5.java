package javacanban;

public class SinhVien5 {
private String ten,diaChi,ngaySinh;

public SinhVien5(String  ten, String diaChi, String ngaySinh) {
	super();
	this.ten = ten;
	this.diaChi = diaChi;
	this.ngaySinh = ngaySinh;
}
public  SinhVien5(){
	ten="";
	diaChi="";
	ngaySinh="";
}
public void chuanHoa() {
	String[] a=ten.trim().split("\\s+");
	String name="";
	for(String x:a) {
		name+=Character.toUpperCase(x.charAt(0));
		for(int i=1;i<x.length();i++) {
			name+=Character.toLowerCase(x.charAt(i));
		}
		name+=" ";
	}
	ten=name.trim();
	StringBuilder sb=new StringBuilder(ngaySinh);
	if(sb.charAt(1)=='/') {
		sb.insert(0, "0");
	}
	if(sb.charAt(4)=='/') {
		sb.insert(3,"0");
	}
	ngaySinh=sb.toString();
}
public String getSortedName() {
	String[] arr=this.ten.split("\\s+");
	String res=arr[arr.length-1];
	for(int i=0;i<arr.length-1;i++) {
		res+=arr[i]+" ";
	}
	return res.trim();
}
@Override
public String toString() {
	return ten+" "+ngaySinh+" "+diaChi;
}

}
