package javacanban;
import java.util.Scanner;
public class bai04 {
  public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	long b =sc.nextLong();
	char c=sc.next().charAt(0);
	float d=sc.nextFloat();
	double e=sc.nextDouble();
	System.out.println(a);
	System.out.println(b);
	System.out.print(c);
	System.out.printf("%.f \n",d);
	System.out.printf("%.4f \n",e);
	sc.close();
  }
}
