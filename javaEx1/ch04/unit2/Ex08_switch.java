package ch04.unit2;

import java.util.Scanner;

public class Ex08_switch {

	//switch 수식을 이용하여 평점 계산
	//90~100 4.0/ 80~89 3.0 10~79 2.0 60~69 1.0 0~59ㅐ 0.0
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s;
		
		System.out.print("점수를 입력하시오");
		s= sc.nextInt();
		
		var grade = switch (s / 10) {
		case 10, 9 -> 4.0;
		case 8 -> 3.0;
		case 7 -> 2.0;
		case 6 -> 1.0;
		case 5, 4, 3, 2, 1, 0 -> 0.0;
		default -> "입력 오류 입니다.";
		};
		//103은 평점 4.0, 110은 입력 오류. 범위가 정해져있지 않기 때문. 
		//var는 printf로 출력을 하지 못함. 자료형이 뭔지 모르기 때문.
		
		System.out.println("점수:" + s + "평점" + grade);
		
		sc.close();
		
	}
}
