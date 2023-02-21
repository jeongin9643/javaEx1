package ch04.unit1;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int h;
//		int m=0;
//		
//		System.out.print("근무시간을 입력하세요");
//		h= sc.nextInt();
//		
//		if(h<=8) {
//			m=h*10000;
//		}else if(h>8){
//			m=80000+(h-8)*15000;
//		}
//
//		System.out.printf("근무시간은 %d 시간이며 급여는 %,d 원 입니다.", h, m);
		int h, m, r = 10000; //r은 시급
		
		System.out.print("근무시간을 입력하세요");
		h= sc.nextInt();
		
		if(h > 8) {
			m = 8 *r + (int)((h-8)*r*1.5);
		} else {
			m = h * r;
		}
		System.out.printf("근무시간은 %d 시간이며 급여는 %,d 원 입니다.", h, m);
		
		
		sc.close();
	}
	

}
