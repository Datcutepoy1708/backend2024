package javacanban;
import java.util.Scanner;

public class bai51 {

    public static boolean NguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int tong = 0, dem = 0;
        for (int i = 0; i < n; i++) {
            if (NguyenTo(a[i])) {
                tong += a[i];
                dem++;
            }
        }

        if (dem > 0) {
            System.out.print((float) tong / dem);
        } else {
            System.out.println("No prime numbers found.");
        }
    }
}
