package javacanban;
import java.util.Scanner;
public class bai33 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int dem =0;
	for(int i=0;i <= c/a;i++) {
		int r= c -i *a;
		if(r >=0 && r % b==0) {
			int d = r /b;
			if(d >=0) {
				dem++;
			}
		}
	}
	if(dem >=1) {
		System.out.println("YES");
	}
	else {
		System.out.println("NO");
	}
}
}
