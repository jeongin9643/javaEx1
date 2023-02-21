package ch04.unit2;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, result=0;
		char s;
		
		System.out.print("두 정수를 입력하세요");
		a= sc.nextInt();
		b= sc.nextInt();

		System.out.print("연산자[+, -, *, /]를 입력하세요");
		s=sc.next().charAt(0);
		
		boolean f = true;//참인지 거짓인지 판별하는 변수
		
		switch(s) {
		case '+' : result= a+b; break;
		case '-' : result= a-b; break;
		case '*' : result= a*b; break;
		case '/' : result= a/b; break;
		default: f=false; System.out.println("연산자 오류입니다.");break;
		}
		
		if(f) {
		System.out.printf("두 정수 %d 와 %d의 연산자 %c 의 결과는 %d입니다", a, b, s, result);
		}
		
		//연산자 오류가 났을 때 컴파일 오류가 생김. 경우가 추가 되어야 함
		
		sc.close();
		
		
	}

}
