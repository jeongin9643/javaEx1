package ch04.unit1;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int a, b, c;
		
		System.out.println("두 정수를 입력하시오");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("첫번째 수:" + a);
		System.out.println("두번째 수:" + b);
		
		
		if(a>b) {
			c = a-b;
		}else {
			c = b-a;
		}
		
		System.out.println("두 수의 차이 :"+c);
		
		sc.close();
	}

}
