package javacanban;
// bizo the champion
import java.util.Scanner;
public class bai23 {
  public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  int a1=sc.nextInt();
	  int a2=sc.nextInt();
	  int a3=sc.nextInt();
	  int b1=sc.nextInt();
	  int b2=sc.nextInt();
	  int b3=sc.nextInt();
	  int n=sc.nextInt();
	  int cup=a1+a2+a3;
	  int hc=b1+b2+b3;
	  int x=0,y=0;
	  if(cup % 5 ==0) {
		  x= cup /5;
	  }
	  else {
		  x=cup / 5 +1;
	  }
	  if(hc % 10 ==0) {
		  y =hc /10;
	  }
	  else {
		  y=hc / 10 +1;
	  }
	  if(x + y <=n ) {
		  System.out.println("Yes");
	  }
	  else {
		  System.out.println("No");
	  }
  }
}
