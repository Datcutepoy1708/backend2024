package javacanban;
import java.util.Scanner;
public class bai65 {
public static void count1(long n) {
	for(int i=2;i<=Math.sqrt(n);i++) {
		if(n % i==0) {
			System.out.print(i+" ");
			while(n % i==0) {
				n /=i;
			}
		}
	}
	if(n >1) {
		System.out.print(n);
	}
}
public static void count2(long n) {
	for(int i=2;i<=Math.sqrt(n);i++) {
		if(n % i==0) {
			int mu=0;
			while(n % i==0) {
				n /=i;
				++mu;
			}
			System.out.print("("+i+", "+mu+") ");
		}
	}
	if(n >1) {
		System.out.print("("+n+" ,1 )");
	}
}
public static void count3(long n) {
	for(int i=2;i<=Math.sqrt(n);i++) {
		if(n % i==0) {
			while(n % i==0) {
				System.out.print(i);
				n /=i;
				if(n !=1) {
					System.out.print(" x ");
				}
			}
		}
	}
	if(n >1) {
		System.out.print(n);
	}
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long n=sc.nextLong();
	count1(n);
	System.out.println();
	count2(n);
	System.out.println();
	count3(n);
	System.out.println();
}
}
