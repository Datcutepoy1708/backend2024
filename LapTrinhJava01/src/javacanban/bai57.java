package javacanban;
import java.util.Scanner;
public class bai57 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	boolean check=false;
	for(int i=0;i<n;i++) {
		check=false;
		for(int j=0;j<i;j++) {
			if(a[i]==a[j]) {
				check=true;
				break;
			}
		}
		if(!check) {
			int dem=1;
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					++dem;
				}
			}
			System.out.print(a[i]+" "+dem);
			System.out.println();
		}
	}
}
}
