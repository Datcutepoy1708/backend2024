package javatrenlop;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
public class bai15 {
static class  SV{
	String name;
	double diem;
	public SV(String name, double diem) {
		this.name=name;
		this.diem=diem;
	}
	public String  hocLuc() {
		if(diem < 5) return "Yeu";
		if(diem >=5 && diem < 6.5 ) return "Trung Binh";
		if(diem >=6.5 && diem <7.5) return "Kha";
		if(diem >=7.5 && diem <9) return "Gioi";
		return "Xuat sac";
	}
	public void in() {
		System.out.printf("%-30s %-10.2f %-10s ",name,diem,hocLuc());
		System.out.println();
	}
}
public static boolean cmp(SV a, SV b) {
	return a.diem < b.diem;
}
public static void sapXep(Vector<SV>v) {
	for(int i=0;i<v.size()-1;i++) {
		for(int j=i+1; j<v.size();j++) {
			if(!cmp(v.get(i),v.get(j))) {
				Collections.swap(v,i,j);
			}
		}
	}
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Vector<SV> v=new Vector<>();
	int n=sc.nextInt();
	sc.nextLine();
	for(int i=0;i<n;i++) {
		System.out.print("Nhap ten sinh vien "+(i+1)+": ");
		String name=sc.nextLine();
		System.out.print("Nhap diem sinh vien thu  "+(i+1)+": ");
		double diem=sc.nextDouble();
		sc.nextLine();
		v.add( new SV(name,diem));
	}
	sapXep(v);
	System.out.println("Danh sach sinh vien: \n");
    for(SV s:v) {
    	s.in();
    }
}
}

