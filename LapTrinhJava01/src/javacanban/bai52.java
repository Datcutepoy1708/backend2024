package javacanban;
import java.util.Scanner;
public class bai52 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	int tong2=0,tong3=0,tong4=0;
	for(int i=0;i<n-1;i++) {
		tong2=a[i]+a[i+1];
		System.out.print(tong2+ " ");
	}
	System.out.println();
	for(int i=0;i<n-2;i++) {
		tong3=a[i]+a[i+1]+a[i+2];
		System.out.print(tong3+" ");
	}
	System.out.println();
	for(int i=0;i<n-3;i++) {
		tong4=a[i]+a[i+1]+a[i+2]+a[i+3];
		System.out.print(tong4+" ");
	}
}
}
