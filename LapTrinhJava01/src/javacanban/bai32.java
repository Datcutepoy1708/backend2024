package javacanban;
import java.util.Scanner;

public class bai32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float s = 0;

        // Calculate the sum of the series
        for (int i = 1; i < n; i++) {
            int a = 1; // Reset factorial for each i
            for (int j = 1; j <= i; j++) {
                a *= j; // Calculate i!
            }
            s += (float) (1.0 / a); // Add the term to the sum
        }

        System.out.printf("%.4f", s);
    }
}