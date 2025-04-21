package javacanban;
import java.util.Scanner;
public class bai44 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		int x=0;
		if(i % 2==1) {
			x=i+64;			
		}
		else {
			x=i+96;
		}
		for(int j=1;j <=n;j++) {
			System.out.print((char)x);
			++x;
		}
		System.out.println();
	}
}
}
