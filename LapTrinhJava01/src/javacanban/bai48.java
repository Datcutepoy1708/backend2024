package javacanban;
import java.util.Scanner;
public class bai48 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	long tich=1;
	int mod=100000007;
	for(int i=1;i<=n;i++) {
		tich *= i % mod;
		tich %=mod;
		System.out.println(tich);
	}
	}
}
