package ch04.unit3.s2;

import java.util.Scanner;

public class Quiz05_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		int n;
		//max에 정수 중 가장 적은 값을 초기값으로 할당
		int max=0x80000000;//8=1000 0x=16진수 
		
		System.out.print("정수 10개를 입력하세요.");
		for(int i = 0; i<10; i++) {
			n=sc.nextInt();
			
			if (max<n){
				max=n;
			}
		}
		
		System.out.println(max);
		sc.close();
	}

}
