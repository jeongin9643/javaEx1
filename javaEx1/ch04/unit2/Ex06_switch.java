package ch04.unit2;

import java.util.Scanner;
/*
 강화된 switch문
 1. 여러 조건 가능 
 ex) case 1: case 2 : case 3 : System.out--
     case 1, 2, 3 : System.out-- 가능
 2. 화살표 case 라벨 (->)
     case: 에서 break;를 사용한 것과 동일
     (case : ===;break;) == (case -> ===;) 
     화살표 case 라벨에서는 실행할 문이 두 줄 이상인 경우는 반드시 블럭화{} 필요
 3. JDK12, 13에서는 preview로 제공, 14부터는 표준화.
         
 */
public class Ex06_switch {

	public static void main(String[] args) {
		// 년도와 월을 입력 받아 입력 받은 월의 마지막 날짜 구하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		int y, m;
		
		System.out.print("년도를 입력하세요");
		y = sc.nextInt();
		
		System.out.print("월을 입력하세요");
		m = sc.nextInt();
		
		switch(m) {
		case 1, 3, 5, 7, 8, 10, 12 -> System.out.printf("%d년 %d월의 마지막 날짜는 31일%n", y, m );
		case 4, 6, 9, 11 -> System.out.printf("%d년 %d월의 마지막 날짜는 30일%n", y, m );
		case 2 -> {
			int d = y%4 ==0 && y%100 != 0 || y%400 == 0 ? 29 : 28;
			System.out.printf("%d년 %d월의 마지막 날짜는 %d일%n", y, m, d);
		      }
		default -> System.out.println("입력 오류입니다.");
		}
		
		sc.close();
		
		
	}

}
