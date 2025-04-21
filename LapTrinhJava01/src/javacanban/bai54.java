package javacanban;
import java.util.Scanner;
public class bai54 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long[] F=new long[100];
	F[0]=0;
	F[1]=1;
	for(int i=2;i<=92;i++) {
		F[i]=F[i-1]+F[i-2];
	}
	int dem=0;
	int n=sc.nextInt();
	for(int i=1;i<=92;i++) {
		if(n==F[i]) {
			dem++;
		}
	}
	if(dem==0) {
		System.out.print("FALSE");
	}
	else {
		System.out.print("TRUE");
	}
}
}
