package javatrenlop;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class trycatchbai3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(true) {
	  try {
		  int a=sc.nextInt();
		  int b=sc.nextInt();
		  System.out.println(a+" "+b);
		  break;
	  }catch(InputMismatchException e) {
		  System.out.println("Du lieu dau vao khong hop le");
		  sc.next();
	  }
	}
}
}
