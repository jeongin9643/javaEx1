package ch04.unit3;

import java.util.Scanner;

public class Ex006_while {

	public static void main(String[] args) {
		//정수를 입력 받아 1부터 입력받은 숫가까지 합 구하기
		
		Scanner sc = new Scanner(System.in);
		int num;
		int s, n;
		
		System.out.print("정수를 입력하시오");
		num= sc.nextInt();
		
		s = n = 0;
		while (n < num) { //n < (~까지)
			n++;
			s += n;
		}
		System.out.println("1~" + num + "까지의 합: " + s);
		
		sc.close();
	}

}
