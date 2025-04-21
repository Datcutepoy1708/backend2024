package javatrenlop;
import java.util.InputMismatchException;
import java.util.Scanner;

public class nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;


        try {
            n = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Du lieu dau vao khong hop le.");
            return;
        }

        int[] a = new int[n];
        int i = 0;
        try {
            while (i < n) {
                a[i] = sc.nextInt();
                i++;
            }

            System.out.print("Mang da day.ban co muon nhap them phan tu khong? (y/n): ");
            String answer = sc.next();

            if (answer.equalsIgnoreCase("y")) {

                System.out.print("nhap phan tu thu " + (n + 1) + ": ");
                int b = sc.nextInt();
                System.out.println("phan tu thu " + (n + 1) + " là: " + b);
            } else {
                System.out.println("khong co phan tu " + (n + 1) + ".");
            }

        } catch (InputMismatchException e) {
            System.out.println("du lieu khong hop le.khong co so thu n+1 trong mang");
            sc.next();
        } 
    }
}

