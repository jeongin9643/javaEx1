package ch04.unit3.s2;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		int n;
		int min=0;
		
		System.out.print("정수 10개를 입력하세요.");
		for(int i = 1; i<10; i++) {
			n=sc.nextInt();
			
			if (min>n){
				min=n;
			}
		}
		
		System.out.println(min);
		sc.close();
	}

}
