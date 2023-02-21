package ch03.unit5;

import java.util.Scanner;

/*
 한 문자를 입력 받아 입력 받은 문자가 소문자이면 대문자로, 대문자이면 소문자로 변환하는 프로그램 작성 
 단 입력 받은 문자가 영문자가 아니면 입력 받은 문자를 그대로 출력
 */
public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 입력하세요");
		char a, b;
		a = sc.next().charAt(0);
		
//		b = a <= a <= z ? a-= 32 : a+= 32;
		b = a >= 'A' && a <= 'Z' ? (char)(a+32): (a>='a'&&a<='z' ? (char)(a-32):a); //대문자인 경우

		System.out.println(a + "->" + b);
		
		sc.close();
		
		
		
		
	}

}
