package javacanban;
import java.util.Scanner;
public class tongphantu {
	public static int tong(int a[] , int n) {
	    int s=0;
	    for(int i=0;i <n ;i++) {
	    	s+=a[i];
	    }
	    return s;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i < n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(tong(a,n));
	}
}
