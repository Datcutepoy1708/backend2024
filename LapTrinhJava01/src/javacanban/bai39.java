package javacanban;
import java.util.Scanner;
public class bai39 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j <= 2*(n-i);j++) {
			System.out.print(" ");
		}
		int x=i;
		for(int j =1 ; j <= 2 * i-1;j++) {
			if( j < i) {
				System.out.print(x+" ");
				++x;
			}
			else {
				System.out.print(x+" ");
				--x;
			}
		}
		System.out.println();
	}
}
}
