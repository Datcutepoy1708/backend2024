package javacanban;
// phep chia
import java.util.Scanner;
public class bai11 {
  public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  int c = a / b;
	  float d= (float)a / b;
	  System.out.println(c);
	  System.out.printf("%.2f",d);
  }
}
