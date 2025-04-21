package javacanban;
import java.util.HashSet;
import java.util.Scanner;
public class bai78 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	HashSet<Integer> set=new HashSet<>();
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		int tmp=sc.nextInt();
		set.add(tmp);
	}
	System.out.println(set.size());
}
}
