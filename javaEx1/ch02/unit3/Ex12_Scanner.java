package ch02.unit3;

import java.util.Scanner;

public class Ex12_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		String birth, tel;
		
		
		System.out.print("이름?");
		name = sc.nextLine();
		
//		System.out.print("나이?");
//		age = sc.nextInt();
		
		
		/*
		 next(), nextInt(), nextDouble() 에서 엔터는 구분자 역할을 함
		 abc 123 은 자연스럽게 이름과 나이로 인식
		 
		 nextLine은 엔터까지 읽어버림, 구분자가 아니라 포함해서 읽음
		 age에서 nextInt는 엔터을 누르면 nextInt는 읽지 못하고
		 birth에서 엔터를 공백으로 읽어버려서 바로 tel로 이어짐
		 만약 nextLine을 쓰면서 나이를 읽고 싶다면 
		 */
		
		System.out.print("나이?");
		age = sc.nextInt();
		sc.nextLine(); //엔터를 읽어서 버림
		
		System.out.print("생년월일?"); //생년월일?전화번호? 로 출력
		birth = sc.nextLine();

		System.out.print("전화번호?");
		tel = sc.nextLine();
		
		System.out.println("%n입력 받은 내용. . .");
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("생년월일: "+birth);
		System.out.println("전화번호: "+tel);
		
		
		
		sc.close();
	}

}
