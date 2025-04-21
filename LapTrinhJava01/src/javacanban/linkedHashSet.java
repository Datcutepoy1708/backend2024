package javacanban;
import java.util.LinkedHashSet;
public class linkedHashSet {
public static void main(String[] args) {
	int[] a= {1,2,5,1,2,3,4};
	LinkedHashSet<Integer> set=new LinkedHashSet<>();
	for(int x:a) {
		set.add(x);
	}
	for(int x:set) {
		System.out.print(x+" ");
	}
}
}
