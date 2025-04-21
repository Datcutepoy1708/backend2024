package javatrenlop;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVienBai4Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    ArrayList<SinhVienBai4> danhSach = new ArrayList<>();
    SinhVienBai4QuanLy quanLy = new SinhVienBai4QuanLy("", "", 0, danhSach, sc);
    quanLy.menu();
}
}
