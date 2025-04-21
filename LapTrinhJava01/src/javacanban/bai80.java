package javacanban;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class bai80 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	LinkedHashSet<Integer> set=new LinkedHashSet<>();
	for(int i=0;i<n;i++) {
		int x=sc.nextInt();
		set.add(x);
	}
	for(int x:set) {
		System.out.print(x+" ");
	}
}
}
