package ch04.unit3;

import java.util.Scanner;

public class Ex007_while {

	public static void main(String[] args) {
		//정수를 입력 받아 1부터 입력받은 숫가까지 홀수 합 구하기
		Scanner sc = new Scanner(System.in);
		int num;
		int s, n;
		
		System.out.print("정수를 입력하시오");
		num= sc.nextInt();
		
		s = 0;
		n = 1;
		//n < (~까지) 
		while (n <= num) { //= 들어가야함. 그래야 num이 홀수일 때 num까지 더 해짐
			s += n;
			n += 2;
		}
		System.out.println("1~" + num + "까지의 홀수 합: " + s);
		
		sc.close();

	}

}
