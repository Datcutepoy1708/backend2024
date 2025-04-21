package javatrenlop;
import java.util.Scanner;
public class bai12 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	for(int i=1 ;i<=6;i++) {
        for(int j=1;j<=i;j++) {
        		System.out.print("* ");
        }
        System.out.println();
	}
	System.out.println();
	for(int i=1; i<=6;i++) {
		for(int j =6;j>=i;j--) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
