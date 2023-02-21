package ch04.unit1;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s; 
		double avg = 0 ;
		
		System.out.println("점수를 입력해주세요");
		s= sc.nextInt();
		
//		if(95 <= s && s <= 100) {
//			avg = 4.5;
//		}else if(90 <= s && s <= 94) {
//			avg = 4.0;
//		}else if(85 <= s && s <= 89) {
//			avg = 3.5;
//		}else if(80 <= s && s <= 84) {
//			avg = 3.0;
//		}else if(75 <= s && s <= 79) {
//			avg = 2.5;
//		}else if(70 <= s && s <= 74) {
//			avg = 2.0;
//		}else if(65 <= s && s <= 69) {
//			avg = 1.5;
//		}else if(60 <= s && s <= 64) {
//			avg = 1.0;
//		}else if(0<= s && s <= 59) {
//			avg = 0.0;
//		}else {
//			System.out.println("입력 오류입니다.");
//		}
//		
//		System.out.printf("점수 %d은 평점 %b 입니다", s, avg);
//		
//		sc.close();
		
		if(s>0 && s<100) {
			System.out.println("입력 오류입니다.");
		} if (s >= 95) {
			avg = 4.5;
		}else if(s >= 90) {
			avg = 4.0;
		}else if(s >= 85) {
			avg = 3.5;
		}else if(s >= 80) {
			avg = 3.0;
		}else if(s >= 75) {
			avg = 2.5;
		}else if(s >= 70) {
			avg = 2.0;
		}else if(s >= 65) {
			avg = 1.5;
		}else if(s >= 60) {
			avg = 1.0;
		}else {
			avg = 0;
		}
		
		System.out.printf("점수 %d은 평점 %b 입니다", s, avg);
		
		sc.close();
	}

}
