package ch04.unit1;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, m, f, a, r, result, ap=0;
		String name, grade;
		
		System.out.print("학번 ?");
		num = sc.nextInt();
		
		System.out.print("이름 ?");
		name = sc.next();
		
		System.out.print("중간고사 점수 ?");
		m = sc.nextInt();
		
		System.out.print("기말고사 점수 ?");
		f = sc.nextInt();
		
		System.out.print("결석 횟수 ?");
		a = sc.nextInt();
		
		System.out.print("레포트 점수 ?");
		r = sc.nextInt();
		
		if(a<=1) {
			ap=100;
		} else if(a<=3) {
			ap=80;
		} else if(a<=5) {
			ap=60;
		} else if(a>=6) {
			ap=0;
		}
		
		result = (int)((m*0.4)+(f*0.4)+(ap*0.1)+(r*0.1));
		/*
		m*=0.4로 하면 형변환 필요 없음
		f*=0.4;
		ap*=0.4;
		r*=0.4;
		
		result = m+f+ap+r;
		*/
		if(result>=90) {
			grade = "A";
		} else if(result>=80) {
			grade = "B";
		}else if(result>=70) {
			grade = "C";
		}else if(result>=60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		System.out.println("학번    이름   중간고사   기말고사   출석점수   레포트   합산점수  학점");
		System.out.printf("%d   %s    %d     %d      %d     %d     %d    %s", num, name, m, f, ap, r, result, grade);
		
		sc.close();
	}

}
