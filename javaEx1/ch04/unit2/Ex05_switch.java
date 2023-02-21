package ch04.unit2;

import java.util.Scanner;

public class Ex05_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		
		System.out.print("과목 코드 [a1, a2, a3]?");
		s= sc.next();
		
		switch(s) {
		case "a1" : System.out.println("자바"); break;
		case "a2" : System.out.println("오라클"); break;
		case "a3" : System.out.println("서블릿"); break;
		default : System.out.println("입력 오류"); break;
		}
		//리터널뿐 아니라 문자열도 가능.
		
//		if(s=="a1") {} // 잘못된 코딩. == 으로는 문자열 비교할 수 없음. 
		
		sc.close();
	}

}
