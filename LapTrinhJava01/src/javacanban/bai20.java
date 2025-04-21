package javacanban;
// cap so cong: cho cap so cong co n phan tu , u1 va d. Tinh tong cac phan tu
import java.util.Scanner;
public class bai20 {
  public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  long n=sc.nextLong();
	  long u1=sc.nextLong();
	  long d= sc.nextLong();
	  long un=u1+(n-1)*d;
	  long t= (n*(u1+un)) /2 ;
	  System.out.println(t);
  }
}
