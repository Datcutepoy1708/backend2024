package javacanban;
// in 1 va 2 chu so cuoi cung 
import java.util.Scanner;
public class bai10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long n=sc.nextLong();
	int a= (int)n % 10;
	int b= (int)n % 100;
	System.out.println(a);
	System.out.println(b);
}
}
