package javacanban;
// phep chia du
import java.util.Scanner;
public class bai13 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	long a= sc.nextLong();
	long b= sc.nextLong();
	long c = a % b;
	System.out.println(c);
}
}
