package javacanban;
import java.util.Scanner;
public class bai35 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	long s=1;
	long a=0;
	for(int i=1;i<=n;i++) {
		s*=i;
		a+=s;
	}
	System.out.println(a);
}
}
