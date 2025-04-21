package javatrenlop;
import java.util.InputMismatchException;
import java.util.Scanner;
public class trycatchbai2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    while(true) {
    	try {
    		String s=sc.nextLine();
    		int t=Integer.parseInt(s);
    		System.out.println(t);
    	}catch(NumberFormatException e) {
    		System.out.println("Du lieu khong hop le");

    	}
    }
}
}
