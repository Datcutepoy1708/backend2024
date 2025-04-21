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
import java.util.Collections;
import java.util.Comparator;
public class NguoiMain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 NguoiSinhVien s=new NguoiSinhVien("Teo","22/12/2002","Hai Duong",3.5);
	 s.xinChao();
	 s.inThongTin();
	 System.out.println(s);
	 
}

}
