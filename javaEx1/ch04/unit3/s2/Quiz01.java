package ch04.unit3.s2;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, sum;
		
		System.out.print("정수를 입력해주세요");
		num=sc.nextInt();
		
		sum=0;
		for(int i =1; i<=num;i++) {
			sum+=i;
		}
		System.out.printf("1부터 %d까지의 합: %d", num, sum );
/*		
		int num;
		
		do {
			System.out.print("수[1~1000]?");
			num=sc.nextInt();
		} while (num < 1 || num > 1000);
		
		sum=0;
		for(int i =1; i<=num;i++) {
			sum+=i;
		}
		System.out.printf("1부터 %d까지의 합: %d", num, sum );
*/
		sc.close();
	}

}
