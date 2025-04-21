package javacanban;
import java.util.Scanner;
public class bai60 {
public static int[] cnt=new int[1000000];
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	int maxVal=Integer.MIN_VALUE;
	for(int i=0;i<n;i++) {
		cnt[a[i]]++;
		maxVal=Math.max(maxVal, a[i]);
	}
	for(int i=0;i<=maxVal;i++) {
		if(cnt[i] !=0) {
			System.out.println(i+" "+cnt[i]);
		}
	}
}
}
