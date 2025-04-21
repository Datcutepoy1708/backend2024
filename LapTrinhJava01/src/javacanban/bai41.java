package javacanban;
import java.util.Scanner;
public class bai41 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;i <=n;i++) {
		for(int j=1; j <= 2*(n-i);j++) {
			System.out.print(" ");
		}
		for(int j=1; j <= 2*i-1;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	for(int i=n;i>=1;i--) {
		for(int j = 2*(n-i); j>=1;j--) {
			System.out.print(" ");
		}
		for(int j= 2*i-1 ;j >=1;j--) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
