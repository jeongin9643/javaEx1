package ch04.unit1;

import java.util.Scanner;

public class Ex004_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		String s;
		
		System.out.print("정수?");
		a = sc.nextInt();
		
		
		if(a%2==1) { //if((a&1)==1) //결과 동일
			s = "홀수";
		} else { // 조건식이 false가 나오는 경우
			s = "짝수";
		}

		System.out.println(a + "->" + s);//컴파일 오류 s가 초기화 되어 있지 않음
		
		sc.close();
	}

}
