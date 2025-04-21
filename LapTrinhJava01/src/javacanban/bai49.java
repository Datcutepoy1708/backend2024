package javacanban;
import java.util.Scanner;
public class bai49 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int i=sc.nextInt();
	long tich=1;
	int mod =(int)Math.pow(10,i);
	for(int i1=1;i1<=k;i1++) {
		tich *=(n %mod);
		tich %= mod;
	}
	System.out.println(tich);
}
}
