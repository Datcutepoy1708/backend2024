package javacanban;
import java.util.Scanner;
public class bai36 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
    int   n=sc.nextInt();
	while(n > 0) {
		int i=sc.nextInt();
		n--;
		if(i % 2==0) {
			System.out.println("EVEN");
		}
		else {
			System.out.println("ODD");
		}
	}
}
}
