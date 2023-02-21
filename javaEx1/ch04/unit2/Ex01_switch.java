package ch04.unit2;

import java.util.Scanner;

public class Ex01_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		//1~3 사이에 수를 입력받아 입력 받은 수 만큼 * 출력
		//break 없어서 밑에도 쭉 실행
		System.out.println("수?");
		n=sc.nextInt();
		
		//switch: byte, short, char, int, String, enum 만 가능
		switch(n) { //switch(수식 또는 변수)
		case 3: System.out.println("*"); //case 다음에는 리터널(상수)만 가능.
		case 2: System.out.println("*");
		case 1: System.out.println("*");
		}
		System.out.println();
		
		sc.close();
	}

}
