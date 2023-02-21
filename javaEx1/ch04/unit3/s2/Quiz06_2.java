package ch04.unit3.s2;

import java.util.Scanner;

public class Quiz06_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		int n;
		//min에 정수 중 가장 큰 값을 초기값으로 할당
		int min=0x7FFFFFFF;//7=0111 F=1
		
		System.out.print("정수 10개를 입력하세요.");
		for(int i = 0; i<10; i++) {
			n=sc.nextInt();
			
			if (min>n){
				min=n;
			}
		}
		
		System.out.println(min);
		sc.close();
	}

}
