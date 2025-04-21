package javacanban;
// so ngay cua thang
import java.util.Scanner;
public class bai17 {
  public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  int n=sc.nextInt();
	  int t=sc.nextInt();
	  if(n % 4==0 && n % 100 !=0) {
		  if(t==1 || t ==3 || t ==5||t==7||t==8||t==10||t==12) {
			  System.out.println("31");
		  }
		  else if(t==4||t==6||t==9||t==11) {
			  System.out.println("30");
		  }
		  else {
			  System.out.println("29");
		  }
	  }
	  else {
		  if(t==1 || t ==3 || t ==5||t==7||t==8||t==10||t==12) {
			  System.out.println("31");
		  }
		  else if(t==4||t==6||t==9||t==11) {
			  System.out.println("30");
		  }
		  else {
			  System.out.println("28");
		  }
	  }
  }
}
