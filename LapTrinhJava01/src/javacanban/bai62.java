package javacanban;
import java.util.Scanner;
public class bai62 {
public static int[] cnt=new int[1000000];
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++) {
		cnt[a[i]]++;
	}
	int maxFre=0,res=0;
	for(int i=0;i<n;i++) {
		if(cnt[a[i]] > maxFre) {
			maxFre=cnt[a[i]];
			res=a[i];
		}
	}
	System.out.println(res + " "+ maxFre);
}
}
