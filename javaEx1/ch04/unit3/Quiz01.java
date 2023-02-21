package ch04.unit3;

import java.util.Scanner;

public class Quiz01 {
	
	//정수를 입력 받아 1부터 입력 받은 수까지의 합, 짝수의 합, 홀수의 합을 구하시오.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, s, num;
		
		
		System.out.print("정수를 입력하시오");
		num=sc.nextInt();
		
		
		
		//총 합을 구하는 whlie문
		n=0;
		s=0;
		while(n<num) {
			n++;
			s+=n;
		}
		System.out.println("1부터" + num + "까지의 총합: " + s);
		
		
		
		// 짝수의 합을 구하는 while문
		n=2;
		s=0;
		while(n <= num) {
			s += n;
			n += 2;
		}
		System.out.println("1부터" + num + "까지의 짝수 합: " + s);
		
		
		
		//홀수를 구하는 while문
		n=1;
		s=0;
		while(n<=num) {
			s+=n;
			n+=2;
		}
		System.out.println("1부터" + num + "까지의 홀수 합: " + s);
		
		sc.close();
	}

}
