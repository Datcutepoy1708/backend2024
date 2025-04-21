package javacanban;
// kiem tra in hoa , in thuong, chu so , ki tu dac biet
import java.util.Scanner;
public class bai18 {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 char c= sc.next().charAt(0);
	 if((c >='a') && (c <= 'z')) {
		 System.out.println("LOWER");
	 }
	 else if((c >='A')&&(c <='Z')) {
		 System.out.println("UPPER");
	 }
	 else if((c >='0') && (c <='9')) {
		 System.out.println("NUMBER");	 
	 }
	 else {
		 System.out.println("SPECIAL");
	 }
 }
}
