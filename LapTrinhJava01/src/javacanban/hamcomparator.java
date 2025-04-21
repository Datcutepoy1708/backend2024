package javacanban;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class hamcomparator {
public static int sum(int n) {
	int sum=0;
	while(n >=0) {
		sum+=n % 10;
		n/=10;
	}
	return sum;
}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Integer[] a= {99,100,23,59,108,706,6};
	// neu muon o1 dung truoc o2 sau khi sap xep =>so am -1
	// neu muon o1 dung sau o2 sau khi sap xep => so duong +1
	// dieu kien de o1 va o2 ..
	Arrays.sort(a,new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			if(sum(o1) !=sum(o2)) 
			return sum(o1)-sum(o2);
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
