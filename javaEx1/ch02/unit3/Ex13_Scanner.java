package ch02.unit3;

import java.util.Scanner;

/*
두 정수를 입력 받아 사칙연산 하는 프로그램
 */
public class Ex13_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("a=?");
		a=sc.nextInt();
		
		System.out.print("b=?");
		b=sc.nextInt();
		
		
		System.out.printf("두 정수는? %d, %d%n", a, b);
		System.out.printf("%d + %d= %d%n" , a, b, a+b);
		System.out.printf("%d - %d= %d%n" , a, b, a-b);
		System.out.printf("%d * %d= %d%n" , a, b, a*b);
		System.out.printf("%d / %d= %d%n" , a, b, a/b);
		
		sc.close();
	}

}
