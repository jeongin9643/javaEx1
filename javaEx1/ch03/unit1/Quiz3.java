package ch03.unit1;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력해주세요.");
		int m;
		m=sc.nextInt();
		
		System.out.println("5만원 개수:" + (m/50000));
		System.out.println("1만원 개수:" + (m%50000)/10000);
		System.out.println("5천원 개수:" + (m%10000)/5000);
		System.out.println("1천원 개수:" + (m%5000)/1000);
		System.out.println("500원 개수:" + (m%1000)/500);
		System.out.println("100원 개수:" + (m%500)/100);
		System.out.println("50원 개수:" + (m%100)/50);
		System.out.println("10원 개수:" + (m%50)/10);
		System.out.println("1원 개수:" + (m%10)/1);
		
		sc.close();
	}

}
