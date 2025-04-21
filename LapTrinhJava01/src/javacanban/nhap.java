package javacanban;
import java.util.Scanner;

public class nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) { 
            int n = sc.nextInt(); 
            System.out.print("TRUE");
        } else {
            System.out.print("FALSE");
        }
        
        sc.close(); // Đóng Scanner sau khi sử dụng
    }
}
