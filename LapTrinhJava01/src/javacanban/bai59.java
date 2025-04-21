package javacanban;
import java.util.Scanner;
public class bai59 {
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
	int maxFre=0,res=-1;
	for(int i=0;i<1000000;i++) {
		if(cnt[i] > maxFre) {
			maxFre=cnt[i];
			res=i;
		}
	}
	System.out.println(res +" " + maxFre);
}
}
