package javacanban;
import java.util.Scanner;
public class PhanSo {
 private int tu,mau;
 public PhanSo(int tu,int mau) {
	 this.tu=tu;
	 this.mau=mau;
 }
 public void toiGian() {
	 int a=tu,b=mau;
	 while( b !=0) {
		 int r = a % b;
		 a=b;
		 b=r;
	 }
	 tu /= a;
	 mau /=a;
 }
 public String toString(){
	 return tu +"/"+ mau;
 }
 public void nhap() {
	 Scanner sc=new Scanner(System.in);
	 this.tu=sc.nextInt();
	 this.mau=sc.nextInt();
 }
}
