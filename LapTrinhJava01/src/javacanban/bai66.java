package javacanban;
import java.util.Scanner;
public class bai66 {
public static long gcd(long a, long b) {
	while(b !=0) {
		long r= a% b;
		a=b;
		b=r;
	}
	return a;
}
public static long lcm(long a, long b) {
	return a* b /gcd(a,b);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long a=sc.nextLong() , b=sc.nextLong(), c=sc.nextLong(),d=sc.nextLong();
    System.out.println(gcd(gcd(a,b),gcd(c,d)));
    System.out.println(lcm(lcm(a,b),lcm(c,d)));
}
}
