package javacanban;
import java.util.Scanner;
public class bai34 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long n=sc.nextLong();
	int s=0;
	while(n >0) {
		s+= (n % 10);
		n /=10;
	}
	int b=0;
	if(s >=10) {
		while(s >0) {
			b += (s %10);
			s /=10;
		}
	}
	System.out.println(b);
}
}
