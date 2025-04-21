package javacanban;
// in ki tu ke tiep
import java.util.Scanner;
public class bai19 {
 public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 char c= sc.next().charAt(0);
	 if(c=='z' || c=='Z') {
		 System.out.println("a");
	 }
	 else if(c >= 'A' && c<='Z') {
		 c= Character.toLowerCase(c);
		 c++;
		 System.out.println(c);
	 }
	 else {
		 c++;
		 System.out.println(c);
	 }
 }
}
