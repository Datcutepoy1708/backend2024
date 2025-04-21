package javacanban;
import java.util.ArrayList;
import java.util.Scanner;
public class bai73 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
        	int tmp=sc.nextInt();
        	arr.add(tmp);
        }
        for(int i=0;i<arr.size();i++) {
        	System.out.print(arr.get(i)+" ");
        }
    }
}
