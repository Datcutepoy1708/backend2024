package javacanban;
import java.util.Scanner;
public class bai25 {
  public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  int c=sc.nextInt();
	  int n=sc.nextInt();
	  if((a+b+c+n) % 3==0) {
		  int x=(a+b+c+n) /3;
		  if(x >= a && x >= b && x >=c ) {
			  System.out.println("Yes");
		  }
		  else {
			  System.out.println("No");
		  }
	  }
	  else {
		  System.out.println("NO");
	  }
  }
}
