package javacanban;
// chia tien
import java.util.Scanner;
public class bai26 {
  public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  int c1=sc.nextInt();
	  int c2=sc.nextInt();
	  int c3=sc.nextInt();
	  int c4=sc.nextInt();
	  int c5=sc.nextInt();
	  if((c1+c2+c3+c4+c5) % 5==0) {
		  if((c1+c2+c3+c4+c5) / 5 !=0) {
			  System.out.println("YES");
		  }
		  else {
			  System.out.println("NO");
		  }
	  }
	  else {
		  System.out.println("NO");
	  }
  }
}
