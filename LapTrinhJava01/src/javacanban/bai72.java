package javacanban;
import java.util.Scanner;
public class bai72 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int TC=sc.nextInt();
	int tc=0;
	while(TC-- >0) {
	  int n=sc.nextInt();
	  int[] a=new int[n+5];
	  for(int i=0;i<n;i++) {
		  a[i]=sc.nextInt();
	  }
	  int[] pos= new int[n];
	  int cnt=0;
	  int maxLen=1,len=1;
	   pos[0]=0;
	   cnt=1;
	  for(int i=1;i<n;i++) {
		  if(a[i] >a[i-1]) {
			  ++len;
		  }
		  else if(a[i] <=a[i-1] ||i==n-1) {
			  // cap nhat day con
			  if(len >maxLen) {
				  maxLen=len;
				  pos[0]=i-maxLen;
				  cnt=1;
			  }
			  else if(len==maxLen) {
				  pos[cnt]=n-maxLen;
				  ++cnt;
			  }
			  ++tc;
			  System.out.println("Test #"+tc+":\n");
			  System.out.println(maxLen);
			  for(int x=0;x<cnt;x++) {
				  int start=pos[x];
				  for(int j=0;j<maxLen;j++) {
					  System.out.print(a[start+j]+" ");
				  }
				  System.out.println();
			  }
		  }
	  }
	}
}
}
