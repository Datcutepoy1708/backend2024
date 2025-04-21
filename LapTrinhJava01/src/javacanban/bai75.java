package javacanban;
import java.util.Scanner;
public class bai75 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	int chan=0,le=0;
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++) {
		if(a[i] % 2==0) {
			++chan;
		}
		else {
			++le;
		}
	}
	System.out.println(1L*chan*(chan-1)/2+1L*le*(le-1)/2);
}
}
