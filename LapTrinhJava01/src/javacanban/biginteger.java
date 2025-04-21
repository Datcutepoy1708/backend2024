package javacanban;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Collections;
import java.util.Comparator;
public class biginteger {
public static void main(String[] args) {
	BigInteger num1 =new BigInteger("13834873874727432848328362887");
	BigInteger num2 =new BigInteger("13834873874727432848328362887");
	System.out.println(num1.add(num2));
	System.out.println(num1.subtract(num2));
	System.out.println(num1.multiply(num2));
	System.out.println(num1.divide(num2));
	System.out.println(num1.divideAndRemainder(num2));
}
}