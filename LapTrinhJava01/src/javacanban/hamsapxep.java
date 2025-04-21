package javacanban;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Arrays;
public class hamsapxep {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] a= {3,1,2,4,5,9,10,8,7,6};
	Arrays.sort(a);
	for(int x:a) {
		System.out.print(x+" ");
	}
	Arrays.sort(a,0,7);
}
}
