package ch04.unit2;

import java.util.Scanner;

public class Ex04_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		//정수를 입력받아 3의 배수인지 판별
		System.out.println("정수?");
		n=sc.nextInt();
		
		//default는 case 조건을 만족하는 것이 없을 때 실행하며 위치는 상관 없지만 맨 마지막이 가장 보기 좋음.
		switch(n % 3) {
		case 0 : System.out.println("***");break;
		case 1 : System.out.println("**");break;
		case 2 : System.out.println("*");break;
		default: System.out.println("입력 에러입니다.");break;
		}
		
		sc.close();
	}

}
