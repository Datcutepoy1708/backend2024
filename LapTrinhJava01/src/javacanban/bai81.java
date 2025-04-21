//  truy van phan tu tren mang
package javacanban;
import java.util.Scanner;
import java.util.HashMap;
public class bai81 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	HashMap<Integer,Integer>map =new HashMap();
	// gia tri va tan suat tuong ung
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		int x=sc.nextInt();
		if(map.containsKey(x)) {
			map.put(x, map.get(x)+1);
		}
		else {
			map.put(x, 1);
		}
	}
	int q=sc.nextInt();
	for(int i=0;i<q;i++) {
		int tt=sc.nextInt();
		int x=sc.nextInt();
		if(tt==1) {
			if(map.containsKey(x)) {
				map.put(x, map.get(x)+1);
			}
			else {
				map.put(x, 1);
			}
		}
		else if(tt==2) {
			if(map.containsKey(x)) {
				map.put(x, map.get(x)-1);
				if(map.get(x)==0) {
					map.remove(x);
				}
			}
		}
		else {
			if(map.containsKey(x)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
}
