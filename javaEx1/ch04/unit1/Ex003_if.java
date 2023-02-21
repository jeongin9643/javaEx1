package ch04.unit1;

import java.util.Scanner;

public class Ex003_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		String s;
		
		System.out.print("정수?");
		a = sc.nextInt();
		
//		s=""; //이렇게 해도 초기화는 가능. but 짝수일 때 아무것도 안 나옴
		s= "홀수가 아님";
		if(a%2==1) { //if((a&1)==1) //결과 동일
			s = "홀수";
		} 


		System.out.println(a + "->" + s);//컴파일 오류 s가 초기화 되어 있지 않음
		
		sc.close();
	}

}
