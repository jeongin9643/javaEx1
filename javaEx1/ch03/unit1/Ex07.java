package ch03.unit1;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		//가로와 세로를 입력받아 직사각형 넓이 둘레 구하기
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		int c, d;
		
		System.out.println("가로 길이를 입력하시오.");
		a=sc.nextInt();
		
		System.out.println("세로 길이를 입력하시오.");
		b=sc.nextInt();
		
		c = a*b;
		d = (a+b)*2;
		
		System.out.println("넓이: "+c);
		System.out.println("둘레: "+d);
		
		sc.close();
		
	}

}
