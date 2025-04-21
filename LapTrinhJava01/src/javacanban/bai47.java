package javacanban;
import java.util.Scanner;
public class bai47 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	long tich=1;
	int mod=100000007;
	for(int i=0;i<n;i++) {
		long tmp=sc.nextLong();
		tich *= tmp % mod;
		tich %= mod;
	}
	System.out.println(tich);
}
}
