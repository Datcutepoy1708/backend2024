package javacanban;
import java.util.Scanner;
public class bai45 {
	public static int countDigit(long n) {
		int dem=0;
		if(n==0) {
			return 1;
		}
		while(n !=0) {
			++dem;
			n /=10;
		}
		return dem;
	}
public static void main(String[] args) {
  Scanner sc= new Scanner(System.in);
  long n=sc.nextLong();
  System.out.println(countDigit(n));
}
}
