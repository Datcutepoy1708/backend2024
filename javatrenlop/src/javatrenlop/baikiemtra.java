package javatrenlop;
import java.util.Scanner;
public class baikiemtra {
    public static boolean check(String n) {
        try {
            Integer.parseInt(n); 
            return true; 
        } catch (NumberFormatException e) {
            return false; 
        }
    }
public static int tich(int n) {
  int tich=1;
  if(n==1) {
	  return 1;
  }
  if(n==0) {
	  return 0;
  }
  else  {
	  return n*tich(n-1);
  }
}
public static int tong(int n) {
	if(n >0) {
		return (n*(n+1)) /2;
	}
	else {
		return n+tong(n+1);
	}
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("----MENU----\n");
    System.out.print("1.Tinh tong tu 1 den n\n");	
    System.out.print("2.Tinh giai thua cua so n\n");
    System.out.print("0.Thoat chuong trinh\n");
    System.out.print("\n");
    while(true) {
    	System.out.print("Dua ra lua chon: \n");
    	String chon=sc.nextLine();
    	if(chon.equals("0")) {
    		System.out.print("Ket thuc chuong trinh ");
    		break;
    	}
    	else if(chon.equals("1")) {
    		System.out.print("Nhap  n: ");
    		String n=sc.nextLine();
    		if(check(n)==false) {
    			System.out.print("So nguyen n khong thoa man\n");
    		}
    		else {
    			int num = Integer.parseInt(n);
    			System.out.print("Ket qua la "+ tong((int)num));
    			System.out.print("\n");
    		}
    	}
    	else if(chon.equals("2")){
    		System.out.print("Nhap  n: ");
    		String n=sc.nextLine();
    		if(check(n)==false) {
    			System.out.print("So nguyen n khong thoa man\n");
    		}
    		else {
    			int num = Integer.parseInt(n);
    			if(num < 0) {
    				System.out.print("Khong thoa man \n");
    			}
    			else {
    				System.out.print("Ket qua la : " +tich(num));
    			}
    		}
    	}
    	else {
    		System.out.print("Vui long nhap lai lua chon\n");
    	}
    }
}
}
