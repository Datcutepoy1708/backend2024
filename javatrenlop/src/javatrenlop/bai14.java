package javatrenlop;
import java.util.Arrays;
import java.util.Scanner;
public class bai14 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	for(int x:a) {
		System.out.print(x+" ");
	}
	System.out.println();
	for(int i=0;i<n;i++) {
		System.out.println(a[0]);
		break;
	}
	 int tong=0,dem=0;
	 for(int x:a) {
		 if(x % 3==0) {
			 tong+=x;
			 dem++;
		 }
	 }
	 System.out.println((double)tong / dem );
}
}
