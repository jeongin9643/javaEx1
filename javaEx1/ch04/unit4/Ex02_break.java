package ch04.unit4;

import java.util.Scanner;

public class Ex02_break {
//실수를 입력 받아 입력받은 실수의 합을 구한다. 입력받은 숫자가 0이하면 합을 출력하고 종료
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num, sum;
		
		sum=0;
/*				
		while(true) {
			do {
			System.out.print("실수를 입력하세요.");
			num=sc.nextDouble();
			sum+=num;
			}while(num>0);
		
			if(num==0) {
				break;
			}
		}
		System.out.println(sum);
*/		
		
		System.out.print("실수를 입력하세요.(0입력시 종료)");
		while(true) {
			num=sc.nextDouble();
			if(num <= 0) {
				break;
			}
			sum+=num;
		}
		System.out.println(sum);
		
		sc.close();
		
	}

}
