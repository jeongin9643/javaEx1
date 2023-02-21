package ch03.unit5;

import java.util.Scanner;

/*
년도를 입력 받아 입력 받은 년도가 윤년인지 평년인지 출력하는 프로그램을 작성 
년도가 4의 배수이고 100의 배수가 아니거나 400의 배수이면 윤년, 그렇지 않으면 평년
 */
public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int y;
		String s;
		
		System.out.print("년도를 입력하세요.");
		y = sc.nextInt();
	
		s = y%4 == 0 && y%100 != 0 || y%400 == 0 ? "윤년" : "평년";
		
		System.out.println(y + "년도는" + s + "입니다.");
		System.out.printf("%d년도는 %s입니다.", y, s);
		
		sc.close();
	}

}
