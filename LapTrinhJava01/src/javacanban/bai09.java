package javacanban;
// ham cell,floor, round
import java.util.Scanner;
public class bai09 {
  public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  double n=sc.nextDouble();
	  int n1= (int)Math.ceil(n);
	  int n2=(int)Math.floor(n);
	  int n3=(int)Math.round(n);
	  System.out.println(n1);
	  System.out.println(n2);
	  System.out.println(n3);
  }
}
