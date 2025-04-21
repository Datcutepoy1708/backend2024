package javacanban;
import java.util.Scanner;
public class inbieuthuc {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int x =sc.nextInt();
	 int y=sc.nextInt();
	 int z=sc.nextInt();
	 int t=sc.nextInt();
	 long tong=(long)(x+y+z+t);
	 long bt=(long)(x - y + z*t);
	 System.out.printf("%d,%d,%d,%d \n",y,z,x,t);
	 System.out.println(tong);
	 System.out.println(bt);
	 sc.close();
 }
}
