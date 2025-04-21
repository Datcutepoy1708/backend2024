package javatrenlop;
import java.util.Scanner;
public class bai02 {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Nhap chieu dai: ");
	   double cd= sc.nextDouble();
	   System.out.println("Nhap chieu rong: ");
	   double cr=sc.nextDouble();
	   double cv= (cd+cr) *2;
	   double dt= cd*cr;
	   double cn=Math.min(cd,cr);
	   System.out.printf("%.1f %.1f %.1f",cv,dt,cn);
	   sc.close();
   }
   
}
