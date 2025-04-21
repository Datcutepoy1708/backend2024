package javatrenlop;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Collections;
import java.util.Comparator;
public class bai18 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
 ArrayList<Double>  arr = new ArrayList<>();
 double sum=0;
 while(true) {
	 Double x=sc.nextDouble();
	 arr.add(x);
	 sc.nextLine();
	 System.out.println("Muon nhap tiep hay dung ? Y/N: ");
     String answer=sc.nextLine();
     if(answer.equalsIgnoreCase("N")) {
    	 break;
     }
 }
 System.out.println("Danh sach cac so da nhap: ");
 for(double x:arr) {
	 System.out.print(x+" ");
	 sum+=x;
	 }
 System.out.println();
 System.out.println(sum);
}
}
