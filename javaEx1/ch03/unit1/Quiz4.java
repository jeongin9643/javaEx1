package ch03.unit1;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("섭씨온도를 입력하세요.");
		int c;
		c=sc.nextInt();
		
		double f;
		f= c*1.8+32;
		
		System.out.printf("화씨온도는 %.1f 입니다.%n", f);
		
		sc.close();
	}

}
