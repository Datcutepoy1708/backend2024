package javatrenlop;
import java.util.Scanner;
public class bai11 {
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int x=sc.nextInt();
	for(int i=1;i <=x;i++) {
		for(int j=1;j<=10;j++){
			System.out.printf("%d x %d = %d \n ",i,j,i*j);
		}	
		System.out.println();
	}
}
}
