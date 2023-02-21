package ch04.unit3.s2;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max=0;//for문이 실행할지 안 할지 몰라서 컴파일 줘야 함
		int n;
		
		System.out.print("정수 10개를 입력하세요.");
//		max=sc.nextInt(); //max 초기화 안 해도 됨
		for(int i = 0; i<10; i++) {
			n=sc.nextInt();
			
			if(i==0) { //처음에는 n을 max에 저장
				max=n;
			}else if (max<n){
				max=n;
			}
			
			/*
			if(i==0) || max < n) {
				max = n;
			*/
		}
		System.out.println(max);
		sc.close();
	}
}
