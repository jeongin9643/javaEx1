package ch03.unit5;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		String s;
		
		System.out.println("정수?");
		a = sc.nextInt();
		
		s = a > 0 ? "양수" : (a == 0? "0" : "음수");//괄호 없어도 상관은 없음 
		System.out.println(a + ":" + s);
		
		sc.close();
	
	}

}
