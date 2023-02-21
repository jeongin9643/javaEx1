package ch04.unit5;

import java.util.Scanner;

public class Ex02_continue {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double input, sum;
		
		sum=0;
		
		//5개의 실수를 입력 받아 0보다 큰 수의 합 구하기
		System.out.print("5개의 실수를 입력하세요");
		for(int i=1; i<=5; i++) {
			input=sc.nextDouble();
			if(input <= 0) {
				continue;
			}
			sum+=input;
		}
		System.out.println("결과:"+sum);
		
		sc.close();
	}

}
