package ch04.unit3;

import java.util.Scanner;

public class Quiz_hard_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int n, p;
		
		do {
			System.out.print("정수?");
			num=sc.nextInt();
		}while(num < 2);
		
		System.out.print(num + "=");
		
		p=2; //나누는 수
		n=num; 
		while( n != 1) {
			if(n%p == 0 ) {//나누어 떨어짐
				if(n != num) { 
					System.out.print("*");
				}
//				System.out.print(p+ " "); //여기에 '*' 를 하면 2 * 3* 4 * 5* 로 출력
				System.out.print(p);
				
				n /= p;
			}else {//나누어 떨어지지 않음
				p++;//나누는 수 1 증가
			}
		}
		
		sc.close();
		
	
		
		
	}

}
