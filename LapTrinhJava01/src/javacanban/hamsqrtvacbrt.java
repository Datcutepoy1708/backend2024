package javacanban;
 import java.util.Scanner;
public class hamsqrtvacbrt {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	float a= (float)Math.sqrt(n);
	float b=(float)Math.cbrt(n);
	System.out.printf("%.2f \n",a);
	System.out.printf("%.3f", b);
}
}
