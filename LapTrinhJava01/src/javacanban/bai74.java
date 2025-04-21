package javacanban;
import java.util.Scanner;
public class bai74 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	char[] a=new char[n];
	char[] tmp= {'2','8','t','e','c','h'};
	for(int i=0;i<n;i++) {
		a[i]=sc.next().charAt(0);
	}
	int j=0;
	for(int i=0;i<n;i+=2) {
		if(a[i]==tmp[j]) {
			++j;
		}
		if(j==6) {
			System.out.println("28TECH");
			return;
		}
		System.out.println("HCET82");
	}
}
}
