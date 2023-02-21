package ch04.unit3.s2;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt=0;
		int cnt2=0;
		
		System.out.print("정수 10개를 입력하세요.");
		for(int i = 0; i<=10; i++) {
			i=sc.nextInt();
			if(i%2==0) {
				cnt++;
			}else {
				cnt2++;
			}
		}
		
		System.out.printf("홀수의 개수 : %d%n짝수의 개수: %d%n", cnt, cnt2);
		
		sc.close();
	}

}
