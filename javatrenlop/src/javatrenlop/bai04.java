package javatrenlop;
import java.util.Scanner;
public class bai04 {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Nhap cac he so: ");
	  double a=sc.nextDouble();
	  double b=sc.nextDouble();
	  double c=sc.nextDouble();
	  double delta=Math.pow(b,2) - 4 * a * c;
	  System.out.printf("%.1f",delta);
	  sc.close();
  }
}
