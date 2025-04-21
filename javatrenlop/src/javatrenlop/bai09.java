package javatrenlop;
import java.util.Scanner;
public class bai09 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Moi ban chon bai tap so: ");
	System.out.println("Bai tap 1");
	System.out.println("Bai tap 2");
	System.out.println("Bai tap 3");
	System.out.println("Bai tap 4");
	int n=sc.nextInt();
	switch(n) {
	case 1:{
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
	}break;
	case 2:{
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
	}break;
	case 3:{
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
	}break;
	case 4:{
		int sd=sc.nextInt();
		if( sd <= 50 && sd >0) {
			System.out.println( 1678 * sd);
		}
		else if(sd >=51 && sd <= 100) {
			System.out.println(50 * 1678 + (sd-50) *1734);
		}
		else if(sd >=101 && sd<=200) {
			System.out.println(50*1678+50*1734+(sd-100)*2014);
		}
		else if(sd >=201 && sd <=300) {
			System.out.println(50*1678+50*1734+50*2014+(sd-200)*2536);
		}
		else if(sd >=301 && sd <=400) {
			System.out.println(50*1678+50*1734+50*2014+50*2536+(sd-300)*2834);
		}
		else {
			System.out.println(50*1678+50*1734+50*2014+50*2536+50*2834+(sd-400)*2927);
		}
	}break;
	}
}
}
