package javacanban;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class bai94 {
public static int le(int n) {
	int dem=0;
	while(n > 0) {
		dem = n % 10;
		if(dem % 2 ==1) {
			dem++;
		}
		n /=10;
	}
	return dem;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Integer [] a=new Integer[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	Arrays.sort(a,new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			if(le(o1) != le(o2)) {
				return le(o1)-le(o2);
			}
			else {
				return o1-o2;
			}
		}
	});
	for(int x:a) {
		System.out.print(x+" ");
	}
}
}
