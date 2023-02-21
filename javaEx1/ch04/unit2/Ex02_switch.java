package ch04.unit2;

import java.util.Scanner;

public class Ex02_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("수?");
		n=sc.nextInt();
		
		//break; switch 문을 빠져나감
		switch(n) { 
		case 3: System.out.println("*");System.out.println("&#");break; 
		//조건 문장 여러 줄이어도 상관 없음.
		case 2: System.out.println("*");
		        System.out.println("&");
		        break;
		case 1: System.out.println("*");break; //마지막의 break는 생략 가능
		}
		System.out.println();
		
		sc.close();
	}

}
