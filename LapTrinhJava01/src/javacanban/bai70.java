package javacanban;
import java.util.Scanner;
public class bai70 {
public static boolean nguyenTo(int n) {
	if(n < 2)
		return false;
	for(int i=2;i<=Math.sqrt(n);i++) {
			if(n % i==0) {
				return false;
			}
	}
	return true;
}
public static boolean Fibo(int n) {
	int[] F=new int[50];
	F[1]=1;
	F[2]=2;
	for(int i=3;i<=30;i++) {
		F[i]=F[i-1]+F[i-2];
	}
	for(int i=1;i<=30;i++) {
		if(n==F[i]) return true;
	}
	return false;
}
public static boolean Tong(int n) {
	int sum=0;
	while(n !=0) {
		sum+=n % 10;
		n /=10;
	}
	return Fibo(sum);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		if(nguyenTo(i) && Tong(i)) {
			System.out.print(i+" ");
		}
	}
}
}
