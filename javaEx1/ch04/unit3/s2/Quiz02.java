package ch04.unit3.s2;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan;
		
		do {
			System.out.print("단(1~9)을 입력해주세요");
			dan=sc.nextInt();
		} while (dan < 1 || dan > 1000);
		
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d =%d%n", dan, i, dan*i);
			
		}
		
		sc.close();

	}

}
