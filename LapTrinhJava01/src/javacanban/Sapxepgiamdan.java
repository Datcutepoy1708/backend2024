package javacanban;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Sapxepgiamdan {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Integer[] a = new Integer[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	Arrays.sort(a,Collections.reverseOrder());
	for(int x:a) {
		System.out.print(x+" ");
	}
}
}
