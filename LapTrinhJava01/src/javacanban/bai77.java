package javacanban;
import java.util.Scanner;
public class bai77 {
public static int S(int n) {
	if(n==1) {
		return 1;
	}
	else {
		return (int) (Math.pow(n,2)+S(n-1));
	}
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.print(S(n));
}
}
