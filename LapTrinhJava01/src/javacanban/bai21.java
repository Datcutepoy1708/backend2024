package javacanban;
// cap so nhan
import java.util.Scanner;
public class bai21 {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int a= sc.nextInt();
	  int b=sc.nextInt();
	  int c= sc.nextInt();
	  int d=sc.nextInt();
	  if((b/a)*b==c && (b/a) *c ==d) {
		  System.out.println("YES");
	  }
	  else {
		  System.out.println("NO");
	  }
  }
}
