package ch04.unit3;

import java.util.Scanner;

public class Quiz_hard_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("정수?");
		num=sc.nextInt();
		
		int n =2;
		boolean b = true;
		while(n<num) {
			if(num%n == 0) {
				b = false;
				break;//while문장 빠져나가는 break 문
			}
			n++; //num = 121 일 때 n 은 11까지 올라가고 나누어 떨어지는 순간 b=false로 넘어가고 소수가 아니게 됨. 
			     //여기서 break가 없으면 n이 12 13 14까지 올라감
			
		}
		
		if(b) {//b가 true이면 소수 false 면 소수가 아님
			System.out.println(n + ": 소수");
		}else {
			System.out.println(n + ": 소수가 아님");
		}
		
		sc.close();
	}

}
