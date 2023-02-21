package ch02.unit3;

import java.util.Scanner;

public class Ex11_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		char gender;
		int age;
		double h;
		
		System.out.print("이름?");
		name=sc.next();//공백없는 문자열 입력
		//입력하지 않으면 다음 코드가 실행되지 않음
		System.out.print("성별[M/F]?");
		gender=sc.next().charAt(0); //한문자 입력, 문자열에서 index 0번째만 출력
		
		System.out.print("나이?");
		age = sc.nextInt();
		
		System.out.print("키?");
		h= sc.nextDouble(); //실수도 가능
		
		System.out.println("%n입력 내용!!!");
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + h);
		
		
		sc.close(); //end 표시
	}

}
