package javacanban;
import java.util.Scanner;
public class bai53 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long[] F=new long[100];
	F[1]=1;
	F[2]=1;
	for(int i=3;i<=92;i++) {
		F[i]=F[i-1]+F[i-2];
	}
	int n=sc.nextInt();
	int[] a=new int[n];
	for(int i=1;i <=n;i++) {
		System.out.println(F[i]);
	}
}
}
