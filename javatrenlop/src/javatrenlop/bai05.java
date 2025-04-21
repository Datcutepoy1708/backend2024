package javatrenlop;
import java.util.Scanner;
public class bai05 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	double diem=sc.nextDouble();
	if(diem <3.5) {
		System.out.println("Hoc luc kem");
	}
	else if(diem >=3.5 && diem < 5) {
		System.out.println("Hoc luc trung binh");
	}
	else if(diem >=5 && diem < 6.5) {
		System.out.println("Hoc luc trung binh");
	}
	else if(diem >=6.5 && diem <8) {
		System.out.println("Hoc luc kha ");
	}
	else if(diem >=8 && diem <9) {
		System.out.println("Hoc luc gioi");
	}
	else {
		System.out.println("Hoc luc trung xuat sac");	
	}
}
}
