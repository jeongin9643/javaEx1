package ch04.unit1;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수를 입력해주세요.");
		int a, b, result=0;
		a= sc.nextInt();
		b= sc.nextInt();
		
		
		System.out.print("연산자[+, -, *, /]를 입력해주세요.");
		char ch;
		ch= sc.next().charAt(0);
		
		if(!(ch== '+' || ch== '-' || ch== '*' || ch== '/')) {
			System.out.println("연산자 입력 오류입니다. 다시 입력해주세요.");
		} else if(ch== '+') {
			result = a + b;
		} else if(ch== '-') {
			result = a - b;
		} else if(ch== '*') {
			result = a * b;
		} else if(ch== '/') {
			result = a / b;
		} 
		
		System.out.printf("입력하신 %d와 %d의 %c 연산 결과는 %d 입니다.", a, b, ch, result);
		 
		sc.close();
	}

}
