package javatrenlop;
import java.util.Scanner;
public class bai08 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int sd=sc.nextInt();
	if( sd <= 50 && sd >0) {
		System.out.println( 1678 * sd);
	}
	else if(sd >=51 && sd <= 100) {
		System.out.println(50 * 1678 + (sd-50) *1734);
	}
	else if(sd >=101 && sd<=200) {
		System.out.println(50*1678+50*1734+(sd-100)*2014);
	}
	else if(sd >=201 && sd <=300) {
		System.out.println(50*1678+50*1734+50*2014+(sd-200)*2536);
	}
	else if(sd >=301 && sd <=400) {
		System.out.println(50*1678+50*1734+50*2014+50*2536+(sd-300)*2834);
	}
	else {
		System.out.println(50*1678+50*1734+50*2014+50*2536+50*2834+(sd-400)*2927);
	}
}
}
