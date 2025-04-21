package javacanban;
import java.util.Scanner;
public class bai55 {
public static void DichPhai(int a[] ,int n) {
	int tmp=a[n-1];
	for(int i=n-1;i>=1;i--) {
		a[i]=a[i-1];
	}
	a[0]=tmp;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	DichPhai(a,n);
	for(int i=0;i<n;i++) {
		System.out.print(a[i]+" ");
	}
}
}
