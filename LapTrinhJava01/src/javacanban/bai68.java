package javacanban;
import java.util.Scanner;
public class bai68 {
public static int MOD=1000007;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	long[] F=new long[1000000];
	F[1]=1;
	F[2]=1;
	for(int i=3;i<=n;i++) {
		F[i]= 2 * F[i-1]+3 * F[i-2];
		F[i] %= MOD;
	}
	System.out.println(F[n]);
}
}
