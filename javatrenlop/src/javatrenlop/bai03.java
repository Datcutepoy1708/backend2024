package javatrenlop;
import java.util.Scanner;
public class bai03 {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Nhap canh cua hinh lap phuong");
	  double canh= sc.nextDouble();
	  double dt= Math.pow(canh,3);
	  System.out.printf("Dien tich cua hinh lap phuong la: %.1f", dt);
  }
}
