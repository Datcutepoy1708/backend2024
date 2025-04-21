package javacanban;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class set {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	HashSet<Integer> set = new HashSet<>();
	set.add(1);
	set.add(3);
	set.add(4);
	System.out.print(set.size());
}
}
