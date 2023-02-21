package ch04.unit3.s2;

import java.util.Scanner;

public class Quiz_hard_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		int n, s;
		
		System.out.print("정수 5개를 입력하시오.");
		for(int i=0; i<5; i++) {
			n=sc.nextInt();
			if(i==1) {
				s=n;
			}else if(7-s>7-n){
				s=n;
			}
			System.out.println(s);
		}
		*/
		
		int n, diff, min=0, result=0;
		
		System.out.print("정수 5개를 입력하시오.");
		for(int i=0; i<5; i++) {
			n=sc.nextInt();
			diff = n>7 ? n-7 : 7-n;
			
			if(i==0 || diff < min) {
				min=diff;
				result = n;
			}
		}
		
		System.out.println("7에 가장 가까운 숫자:" + result);
		
		sc.close();
	}

}
