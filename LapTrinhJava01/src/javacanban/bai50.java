package javacanban;
import java.util.Scanner;
public class bai50 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	int dem1=0, dem2=0;
	int tong1=0,tong2=0;
	for(int i=0;i<n;i++) {
		if(a[i] % 2 ==0) {
			dem1++;
			tong1+=a[i];
		}
		else {
			dem2++;
			tong2+=a[i];
		}
	}
	System.out.print(dem1+" "+dem2+" "+tong1+" "+tong2+" ");
}
}
