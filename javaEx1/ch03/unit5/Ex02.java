package ch03.unit5;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		String s;
		
		System.out.println("정수?");
		a = sc.nextInt();
		
		/*
		 5 => 0101 & 0001 = 1 
		 13 => 1101 & 0001 = 1 
		 12 => 1100 & 0001 = 10 
		 6 => 0110 & 0001 = 0 
		 
		 홀수는 끝에 1 짝수는 끝에 0 
		 */
		
		
		s = (a % 1) == 0 ? "홀수" : "짝수" ; //비트단위 연산
		
		s = a % 2 == 0 ? "짝수" : "홀수"; 
		System.out.println(a + ":" + s);
		
		sc.close();
	
	}

}
