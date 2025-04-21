package javatrenlop;
import java.util.Scanner;
public class bai07 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	double a=sc.nextDouble();
	double b=sc.nextDouble();
	double c=sc.nextDouble();
	if(a==0) {
		if(b==0 && c==0) {
			System.out.println("Phuong trinh vo so nghiem");
		}
		else if(b==0 && c !=0) {
			System.out.println("Phuong trinh vo nghiem");
		}
		else {
			System.out.println(-c/b);		
		}
	}
	else {
		double delta= b*b- 4 *a *c;
		if(delta <0) {
			System.out.println("Phuong trinh vo nghiem");
		}
		else if(delta==0) {
			System.out.println(-b / (2 *a));
		}
		else {
			double x1=(-b+Math.sqrt(delta))/ (2 *a);
			double x2=(-b-Math.sqrt(delta))/ (2 *a);
			System.out.println(x1);
			System.out.println(x2);
		}
	}
}
}
