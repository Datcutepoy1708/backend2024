package javacanban;
import java.util.Arrays;
import java.util.Scanner;
public class sapxeptangdan {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	for(int x : a) {
		System.out.print(x+" ");
	}
}
}
