package ch04.unit1;

import java.util.Scanner;

public class Ex005_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("세개의 정수 입력?");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.printf("입력받은 수 : %d, %d, %d%n",  a, b, c);
		
		//적은 수에서 큰 수로 출력

		int t;
		if(a>b) {
			t=a; a=b; b=t;
		}
		
		if(a>c) {
			t=a; a=b; b=t;
		}
		if(b>c) {
			t=a; a=b; b=t;
		}
		
		System.out.printf("크기 순 : %d, %d, %d%n", a, b, c);
		
		sc.close();
	}

}
