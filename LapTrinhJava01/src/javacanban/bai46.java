package javacanban;
import java.util.Scanner;
public class bai46 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	long tong =0;
	int mod=1000000007;
	for(int i=0;i<n;i++) {
		long tmp=sc.nextLong();
		tong+=tmp % mod;
		tong %= mod;
	}
	System.out.println(tong);
}
}
