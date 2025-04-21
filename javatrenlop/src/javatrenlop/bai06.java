package javatrenlop;
import java.util.Scanner;
public class bai06 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double a=sc.nextDouble();
	double b=sc.nextDouble();
	if(a==0) {
		if(b==0) {
			System.out.println("Phuong trinh co vo so nghiem");
		}
		else {
			System.out.println("Phuong trinh vo nghiem");
		}	
	}
	else {
		System.out.println(-b /a);
	}
}
}
