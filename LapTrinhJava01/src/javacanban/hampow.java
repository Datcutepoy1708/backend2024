package javacanban;

import java.util.Scanner;
public class hampow {
  public static void main(String[]  args) {
	  Scanner sc=new Scanner(System.in);
	  int x=sc.nextInt();
	  int y=sc.nextInt();
	  long res=(long)Math.pow(x, y);
	  System.out.println(res);
  }
}
