package javatrenlop;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class trycatchbai1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(true) {
		try {
			float a=sc.nextFloat();
			float b=sc.nextFloat();
			if(b==0) {
				System.out.println("Du lieu khong hop le");
			}
			else {
				System.out.println(a/b);
			}
		}catch(InputMismatchException e) {
			System.out.println("Du lieu khong o dang so");
		}
	}
}
}
