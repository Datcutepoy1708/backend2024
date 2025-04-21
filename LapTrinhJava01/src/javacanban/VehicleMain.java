package javacanban;
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
import java.util.InputMismatchException;
import java.util.Collections;
import java.util.Comparator;
public class VehicleMain {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
sc.nextLine();
ArrayList<VehicleOto> arr1=new ArrayList<>();
ArrayList<VehicleMotobike> arr2=new ArrayList<>();
for(int i=0;i<n;i++) {
	String ma=sc.nextLine();
	if(ma.substring(0, 2).equals("OT")) {
		String ten=sc.nextLine();
		String hang=sc.nextLine();
		String mau=sc.nextLine();
		int maLuc=sc.nextInt();
		int gia=sc.nextInt();
		sc.nextLine();
		VehicleOto vo=new VehicleOto(ma,ten,hang,mau,maLuc,gia);
		arr1.add(vo);
	}
	else {
		String ten=sc.nextLine();
		String hang=sc.nextLine();
		String mau=sc.nextLine();
		int tocDo=sc.nextInt();
		int gia=sc.nextInt();
		sc.nextLine();
		VehicleMotobike vm=new VehicleMotobike(ma,ten,hang,mau,tocDo,gia);
		arr2.add(vm);
	}
}
String hang =sc.nextLine();
for(VehicleOto x : arr1) {
	if(x.getHang().equals(hang)) {
		System.out.println(x);
	}
}
for(VehicleMotobike x: arr2) {
	if(x.getHang().equals(hang)) {
		System.out.println(x);
	}
}
}
}
