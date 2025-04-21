package javacanban;
import java.util.HashSet;
import java.util.Scanner;
public class bai79 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	HashSet<Integer>set= new HashSet<>();
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		int x=sc.nextInt();
		set.add(x);
	}
	int q=sc.nextInt();
	for(int i=0;i<q;i++) {
		int x=sc.nextInt();
		if(set.contains(x)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
}
