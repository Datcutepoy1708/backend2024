package javacanban;
// doi  thoi gian
import java.util.Scanner;
public class bai28 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	System.out.printf(" %d h : %d m : %d s", n /3600 , (n %3600) /60 , n % 60);
}
}
