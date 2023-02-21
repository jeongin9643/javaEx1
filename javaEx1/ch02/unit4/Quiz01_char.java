package ch02.unit4;

import java.util.Scanner;

/*
 한 문자를 입력받아 입력받은 문자와 문자의 ASCII코드를 출력하는 프로그램 작성
 -실행 예
 한문자? A
 A -> 65 
 */
public class Quiz01_char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("한 문자를 입력하시오.");
		char a;
		a= sc.next().charAt(0);
		
		System.out.println("입력한 문자:"+ a);
		
		int i = a;
		System.out.println(i);
		System.out.println(a+"->" + i); // 문자와 유니코드를 동시에 보여줌
//		System.out.printf("%c -> %d%n", a, c); //런타임 오류 char형은 %d로 출력 안됨
		System.out.printf("%c -> %d%n", a, i);
		System.out.printf("%c -> %d%n", a, (int)a);
		
		sc.close();
		
		
		
		
		
		
	}

}
