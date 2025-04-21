package javacanban;
import java.util.Scanner;

public class bai56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        // Nhập các phần tử vào mảng
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        // In ra các phần tử không trùng lặp
        for (int i = 0; i < n; i++) {
            boolean ok = false;
            for (int j = 0; j < i; j++) {  
                if (a[i] == a[j]) {
                    ok = true;
                    break;
                }
            }
            if (!ok) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
