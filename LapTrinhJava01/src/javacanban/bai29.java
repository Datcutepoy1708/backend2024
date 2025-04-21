package javacanban;
// thoi gian ke tiep
import java.util.Scanner;
public class bai29 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int h=sc.nextInt();
	int m=sc.nextInt();
	int k=sc.nextInt();
	k %= 784;
	int x= h * 28 +m+k; // so phut tinh tu 0.00h
	x %= 784;
	h = x/ 28;
	m = x % 28;
	System.out.printf("%02dh:%02dm",h,m);
}
}
