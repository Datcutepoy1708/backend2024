package javacanban;
// Ham F(x,y)= 5 *x +2*y+x*y
import java.util.Scanner;
public class bai14 {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   long x=sc.nextLong();
	   long y=sc.nextLong();
	   long a= 5 *x +2*y+x*y;
	   System.out.println(a);
   }
}
