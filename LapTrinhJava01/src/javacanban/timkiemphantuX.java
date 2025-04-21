package javacanban;

import java.util.Scanner;

public class timkiemphantuX {
@SuppressWarnings("unused")
public static boolean timKiem(int a[] ,int n ,int x) {
	for(int i=0;i < n;i++) {
		if(a[i]==x) 
			return true;
	}
	return false;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int x=sc.nextInt();
	int[] a= new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	if(timKiem(a,n,x)) {
		System.out.println("YES");
	}
	else {
		System.out.println("NO");
	}
}
}
