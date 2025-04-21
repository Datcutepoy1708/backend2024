package javacanban;
// happy new year
import java.util.Scanner;
public class bai27 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int h=sc.nextInt();
	int m=sc.nextInt();
	System.out.println(1440-h * 60 -m);
}
}
