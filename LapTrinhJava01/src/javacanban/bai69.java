package javacanban;
import java.util.Scanner;
public class bai69 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	long[] F=new long[100];
	F[1]=1;
	F[2]=2;
	for(int i=3;i<=92;i++) {
		F[i]=F[i-1]+F[i-2];
	}
	long n=sc.nextLong();
	for(int i=1;i<=92;i++ ) {
		if(F[i] >=n) {
			System.out.println(F[i]);
			break;
		}
	}
}
}
