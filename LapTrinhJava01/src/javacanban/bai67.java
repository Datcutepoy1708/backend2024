package javacanban;
import java.util.Scanner;
public class bai67 {
public static long gt(long a) {
	long ans=1;
	for(int i=1;i<=a;i++) {
		ans*=i;
	}
	return ans;
}
public static long nCk(int n, int k) {
	return gt(n) / (gt(k) * gt(n-k));
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int h=sc.nextInt();
	for(int i=0;i<h;i++ ) {
		for(int j=0;j<=i;j++) {
			System.out.print(nCk(i,j)+" ");
		}
		System.out.println();
	}
}
}
