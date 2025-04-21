package javacanban;
import java.util.Scanner;
public class bai71 {
public static boolean Fibo(int n) {
	long[] F=new long[100];
	F[1]=1;
	F[2]=1;
	for(int i=3;i<=92;i++) {
		F[i]=F[i-1]+F[i-2];
	}
	for(int i=1;i<=92;i++) {
		if(F[i]==n)  return true;
	}
	return false;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t =sc.nextInt();
	while(t-- >0) {
		int n=sc.nextInt();
		if(Fibo(n)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
}
