package javatrenlop;
import java.util.InputMismatchException;
import java.util.Scanner;

public class cau1kiemtra {
public static int uc(int a, int b) {
	if(b==0) {
		return a;
	}
	else {
		return uc(b,a%b);
	}
}
public static int bc(int a, int b) {
	if(a==0 || b==0) return 0;
	else
	return (a*b) / uc(a,b);
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
while(true) {
	try {
		System.out.println("Nhap so a: ");
		int a=sc.nextInt();
		System.out.println("Nhap so b: ");
		int b=sc.nextInt();
		if(a < 0 || b < 0) {
			System.out.println("du lieu nhap vao khong phu hop");
		}
		else {
			System.out.println("Uoc chung lon nhat: ");
			System.out.println(uc(a,b));
			System.out.println("Boi chung nho nhat: ");
			System.out.println(bc(a,b));
		}
	}catch(Exception e) {
		System.out.println("Loi: "+e.getMessage());
	}
}
} 
}
