package ch02.unit4;
/*
 
 정수의 문자 코드를 입력 받아 입력 받은 코드에대한 문자를 출력하는 프로그램 작성
 실행 예 
 문자코드? 65
 65->A
 */

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 코드를 입력하시오");
		int i;
		i=sc.nextInt();
		
		System.out.println("입력받은 문자코드:"+ i);
		
		char c = (char)i;//형변환 불필요
		System.out.println("입력한 문자코드의 문자열: "+ c);
		
		System.out.printf("%d -> %c%n", i, i); //int는 %c로 출력 가능
		sc.close();
	}
}
