package javacanban;
import java.util.Scanner;
public class bai61 {
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
	for(int i=0;i<n;i++) {
		if(cnt[a[i]] !=0) {
			System.out.println(a[i]+" "+cnt[a[i]]);
			cnt[a[i]]=0;
		}
	}
}
}
