package ch04.unit2;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s;
		String grade;
		
		System.out.println("점수(0~100)를 입력하세요");
		s = sc.nextInt();
		
//		switch (s/10) {
//		case 10: System.out.println("점수 :"+ s+ "등급: 수");break;
//		case 9: System.out.println("점수 :"+ s+ "등급: 수");break;
//		case 8: System.out.println("점수 :"+ s+ "등급: 우");break;
//		case 7: System.out.println("점수 :"+ s+ "등급: 우");break;
//		case 6: System.out.println("점수 :"+ s+ "등급: 미");break;
//		case 5: System.out.println("점수 :"+ s+ "등급: 미");break;
//		case 4: System.out.println("점수 :"+ s+ "등급: 양");break;
//		case 3: System.out.println("점수 :"+ s+ "등급: 양");break;
//		case 2: System.out.println("점수 :"+ s+ "등급: 가");break;
//		case 1: System.out.println("점수 :"+ s+ "등급: 가");break;
//		}
		
		switch (s/10) {
		case 10: 
		case 9: grade ="수";break; 
		case 8: grade ="우";break;
		case 7: grade ="미";break;
		case 6: grade ="양";break;
		default: grade ="가";break;
		}
		
		System.out.printf("점수 : %d, 등급 : %s", s, grade );
		
		sc.close();
		
	}

}
